import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { Task } from '../../Task';

@Component({
  selector: 'app-task',
  templateUrl: './task.component.html',
  styleUrls: ['./task.component.css']
})
export class TaskComponent implements OnInit {

  @Output() onAddTask: EventEmitter<Task> = new EventEmitter();

  texto!: string;
  dia!: string;
  recordatorio: boolean = false;

  @Output() btnClick = new EventEmitter();

  constructor() {}

  ngOnInit(): void {
  }

  onSubmit(){ 
    if(!this.texto) {
      alert("Porfavor agregue una tarea");
      return;
    }

    const newTask: Task = {
      texto: this.texto,
      dia: this.dia,
      recordatorio: this.recordatorio,
    };

    this.onAddTask.emit(newTask);

    this.texto = '';
    this.dia = '';
    this.recordatorio = false;
  }

}
