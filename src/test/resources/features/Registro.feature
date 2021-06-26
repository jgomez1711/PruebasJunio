#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
@Curso1
Feature: diligenciar formulario
Scenario Outline: enviar correo 
	Given abrir el navegador
	And escribir nombre <userNameP>
	
	Examples:	
	|userNameP  |
	|Pruebas    |
	|Pruebas dos|