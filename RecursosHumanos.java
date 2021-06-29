package RecursosHumanos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RecursosHumanos {
	String []PuestosDeTrabajo ={"GerenteAdministrativo, GerenteDeVenta, Contador, AuxiliarDeContador, ResponsableCarteraYCobro, Cajera, Facturador, Secretaria"};
	 String Nombre, FechaNacimiento, Dirrecion, EstadoCivil, Correo, NumeroDeTelefono, NivelDeEscolaridad, PuestoAlQueAspira,ExperienciaLaboral, Habilidades;
	 int Edad,comprobacion;
	 Scanner lector = new Scanner (System.in);
	public void ReclutamientoSeleccionContratacion() {
		for (int i= 0; i<PuestosDeTrabajo.length; i++) {
			System.out.println(PuestosDeTrabajo[i]);
		}
			System.out.println("Ingrese los datos que se le pide a continuacion");
			System.out.println(" Nombre completo");
			Nombre=lector.nextLine();
			System.out.println("");
			do {
				comprobacion=2;
			try {
				System.out.println("Ingrese su edad");	
				Edad=lector.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Solo puede ingresar numeros");
				lector.next();
				comprobacion=1;							
			}
			}while(comprobacion!=2);
			System.out.println("Fecha de nacimiento");
			FechaNacimiento=lector.nextLine();		
			System.out.println("");
			System.out.println("Dirrecion");
			Dirrecion=lector.nextLine();
			System.out.println("");
			System.out.println("Estado civil");
			EstadoCivil=lector.nextLine();
			System.out.println("");
			System.out.println("Correo");
			Correo=lector.nextLine();
			System.out.println("");
			System.out.println("Numero de telefono");
			NumeroDeTelefono=lector.nextLine();
			System.out.println("");
			System.out.println("Nivel de escolaridad");
			NivelDeEscolaridad=lector.nextLine();
			System.out.println("");
			System.out.println("Puesto al que aspira");
			PuestoAlQueAspira=lector.nextLine();
			System.out.println("");
			System.out.println("Experiencia Laboral");
			ExperienciaLaboral=lector.nextLine();
			System.out.println("");
			System.out.println("Habilidades");
			Habilidades=lector.nextLine();
			System.out.println("");
		}
	public static void main(String[] args) {
		RecursosHumanos obj = new RecursosHumanos ();
		 Scanner lector = new Scanner (System.in);
	int opcion, comprobacion;

	  
 
	do {
		comprobacion=2;
		try {
			do {	
	System.out.println("Administracion de recursos humanos");
	System.out.println("Que desea hacer?");
	System.out.println("1.Reclutamiento, seleccion y contratacion de personal");
	System.out.println("2.Pago de nomina");
	System.out.println("3.Finalizacion de contrataciones");
	System.out.println("4.Jubilaciones");
	System.out.println("5.Salir");

				opcion = lector.nextInt();
	switch(opcion) {
	
	
	case 1:
				System.out.println("opcion 1");
				obj.ReclutamientoSeleccionContratacion();
				break;
	case 2:
				System.out.println("opcion 2");
				break;
	case 3:
				System.out.println("opcion 3");
				break;
	case 4:
				System.out.println("opcion 4");
				break;
	case 5:break;
				default: 
					System.out.println("");
					System.out.println("La opcion que eligio es invalida");
					System.out.println("");
	}
	}while(opcion != 5);
				System.out.println("Muchas gracias por nuedtra aplicacion!");
				System.out.println("Vuelva pronto!");
			} catch (InputMismatchException e) {
				System.out.println("");
				System.out.println("Solo puede ingresar numeros");
				System.out.println("");
				lector.next();
				comprobacion=1;							
			}
			}while(comprobacion!=2);																
	lector.close();
	
	}

}
