package com.unab;

import java.util.Scanner;

public class AE1ABP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		boolean error = false;
		int rut;
		String nombre = "";
		String apellido = "";
		String telefono;
		String afp = "";
		int salud = 2;
		String direccion;
		String comuna = "";
		int edad;
				

		// INGRESAR DATOS
		System.out.println("Por favor ingrese sus datos");
		// RUT
		while (true) {
			System.out.println("Ingresar Rut: (Sin puntos ni guión)");
			rut = entrada.nextInt();
			if (rut > 999999999 || rut <= 0) {
				System.out.println("Error, por favor ingresar un rut válido");
				rut = entrada.nextInt();

			} else {
				break;
			}
		}
		// NOMBRE
		entrada.nextLine();
		while (true) {
			System.out.println("Ingresar nombre:");
			nombre = entrada.nextLine();
			if (nombre.equals("")) {
				System.out.println("Error, por favor ingresar nombre:");

			} else {
				break;
			}
		}
		// APELLIDO
		while (true) {
			System.out.println("Ingresar apellido:");
			apellido = entrada.nextLine();
			if (apellido.equals("")) {
				System.out.println("Error, por favor completar campo\n");

			} else {
				break;
			}

		}
		// TELEFONO

		System.out.print("Ingresar teléfono\n");
		telefono = entrada.nextLine();
		while (telefono.length() > 15 || telefono == "") {
			System.out.println("Error, por favor ingresar número válido: \n");
			telefono = entrada.nextLine();

			break;
		}

		// AFP
		while (true) {
			System.out.println("Ingresar AFP");
			afp = entrada.nextLine();
			if (afp.equals("")) {
				System.out.println("Error, por favor completar campo\n");

			} else {
				break;
			}
		}

		// SISTEMA DE SAlUD
		
		
		System.out.println("Ingresar su Sistema de Salud: 1 (Fonasa) o 2 (Isapre)");
		salud = Integer.valueOf(entrada.nextLine());

		while (salud != 1 && salud != 2) {
			System.out.println("Error, por favor ingresar una opción válida \n");
			salud = Integer.valueOf(entrada.nextLine());
		}
		
		
		if (salud == 1) {


		} else if (salud == 2) {
			
		

		}
		// DIRECCIÓN
		System.out.println("Ingresar dirección: ");
		direccion = entrada.nextLine();
		while (direccion.length() > 50  || rut <= 0) {
			System.out.println("Error, por favor ingresar dirección válida \n");
			direccion = entrada.nextLine();

			break;
		}

		// COMUNA
		while (true) {
			System.out.println("Ingresar comuna: ");
			comuna = entrada.nextLine();
			if (comuna.equals("")) {
				System.out.println("Error, por favor ingresar comuna \n");

			} else {
				break;
			}

		}

		// EDAD

		System.out.print("Ingresar edad: \n");
		edad = Integer.valueOf(entrada.nextLine());
		while (edad >= 120  || rut <= 0) {
			System.out.println("Error, por favor ingresar número válido: \n");
			edad = Integer.valueOf(entrada.nextLine());

			break;
		}

		System.out.println("___________________________________________________________________ \n");
		System.out.println("Datos de usuario: \n");
		System.out.println("Rut: " + rut);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.print("Sistema de Salud: ");
		if (salud==1) {
			System.out.println("Fonasa");
		}else {
			if (salud==2) {
				System.out.println("Isapre");
		}
		System.out.println("Dirección: " + direccion);
		System.out.println("Comuna: " + comuna);
		System.out.println("Edad: " + edad);
		System.out.println("___________________________________________________________________");

	}
	}
	/*
	 * for (int i = 0; telefono.length() < 15; i++) { telefono += "_";
	 */

	private static void While(boolean b) {
		// TODO Auto-generated method stub

	}
}

// private static void While(boolean b)
// TODO Auto-generated method stub