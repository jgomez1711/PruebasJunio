#Jhonatan Medina blanco
#08062021
Feature: Se debe validar que permita el regitro
Background:
Given abrir el navegador
@Regresion
	Scenario: registro exitoso
		
		When haga clic en el boton Crear

@Regresion	
	Scenario Outline: registro exitoso con nombre 
				
				When haga clic en el boton Crear
				Then diligenciar campo nombre <nombres>
				
				Examples:
				|nombres |
				|Jhonatan|
		