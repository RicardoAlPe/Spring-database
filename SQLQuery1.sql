create database pr1; 

use pr1;





create table persona(
id_persona int primary key identity,
nombre varchar(50),
apellido varchar(50),
email varchar(50),
telefono varchar(50)

); 


select * from persona;  

 insert into persona (nombre,apellido,email,telefono) values ('William','Diaz','william@gmail.com','23560055');

 SELECT * from persona;
