drop database if exists task;
create database task;
use task;

create table task (
	id int auto_increment primary key,
    texto varchar(255),
    dia varchar(100),
    recordatorio boolean
);

insert into task (texto,dia,recordatorio) value ("Ir al medico",20221020,false);
insert into task (texto,dia,recordatorio) value ("Comer sandia",20221025,true);

select * from task;