import { Component, OnInit, Type } from '@angular/core';
import { TaskService } from '../../services/task.service';
import { Task } from '../../Task';

@Component({
  selector: 'app-tasks-to-do',
  templateUrl: './tasks-to-do.component.html',
  styleUrls: ['./tasks-to-do.component.css']
})
export class TasksToDoComponent implements OnInit {

  tasks: Task[] = [];

  constructor(private taskService: TaskService) {}


  ngOnInit(): void {

    this.taskService.getTasks().subscribe((tasks) => (this.tasks = tasks));
    
  }

  deleteTask(task: Task){
    this.taskService
    .deleteTask(task)
    .subscribe(
      () => (this.tasks = this.tasks.filter((t) => t.id !== task.id))
    );
  }

  ToggleReminder(task:Task){
    task.recordatorio = !task.recordatorio;
    this.taskService.updateTaskReminder(task).subscribe();
  }

}