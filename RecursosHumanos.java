package RecursosHumanos;

import java.util.InputMismatchException;
import java.util.Scanner;


public class RecursosHumanos {
	
	 static String  nombre, FechaNacimiento, Dirrecion, EstadoCivil, Correo, NumeroDeTelefono, NivelDeEscolaridad, PuestoAlQueAspira,ExperienciaLaboral, Habilidades,Aspirante1, Aspirante2,salario; 
	 static  String Idioma, Referencia;
	 static int puntajeRespuestas=2;
	 static int puntaje=0;
	 int edad;
	 int comprobacion;
	 static int puntajeAspirante1;
	 static int puntajeAspirante2;
	 static boolean Repetir,Continuar;
	 static double SalarioBruto,SalarioBrutoAnual,IR,MontoSindicato,MontoAntiguedad,SalarioTotal,Montoinss,Montoinsspatronal,MontoIr;
	 static int A�os,Antiguedad;
	 static double TotalDeducciones,SalarioNeto;
	 static final double INSS = 7, INSSPatronal = 22.5;
	 static final int Sindicato = 1;
	 static String Motivo;
	 static double Saldo,Liquidacion,NuevoSueldo;
	 static int Puesto,Opcion,Elegir,Seleccionar,Meses;
	 static String Puestos[] = new String[5]; {
	  		Puestos[0] = "Gerente";
	  		Puestos[1] = "Supervisor";
	  		Puestos[2] = "Cajero";
	  		Puestos[3] = "Contador";
	  		Puestos[4] = "Vendedor";
	  }
	 static String Renovacion[] = new String[2]; {
	  	Renovacion[0] = "Renovacion temporal";
	  	Renovacion[1] = "Contratacion fija";
	  }
	  
	  public void ContratacionFin() {
		  	do {
		  		try{
		  			Repetir = false;
		  			do {
		  				System.out.println("Ingrese el nombre del trabajador");
		  				nombre= lector.nextLine();
		  			}while(nombre.equals(""));
		  			do {
		  				System.out.println("Ingrese el salario bruto mensual del trabajador");
		  				SalarioBruto = lector.nextDouble();
		  			}while(SalarioBruto<=0);
		  			do {
		  				System.out.println("Seleccione el puesto que ejercia el trabajador");
		  				for(int N=0; N<Puestos.length;N++) {
		  					System.out.println(Puestos[N]+"("+N+")");
		  				}
		  				Puesto = lector.nextInt();
		  			}while(Puesto<0 || Puesto>4);
		  	} catch(InputMismatchException ex) {
		  		System.out.println("Ingreso un dato valido");
		  		lector.next();
		  		System.out.println("");
		  		Repetir = true;
		  	}
		  	}while(Repetir);
		  	
		  	
		  	do {
		  		try{
		  			Repetir = false;
		  			do {
		  				System.out.println("***Motivo por finalizacion***");
		  				System.out.println("Despido(1)");
		  				System.out.println("Finalizacion de contrato(2)");
		  				Opcion = lector.nextInt();
		  			}while(Opcion<1 || Opcion>2);
		  	} catch(InputMismatchException ex) {
		  		System.out.println("Ingreso un dato valido");
		  		lector.next();
		  		System.out.println("");
		  		Repetir = true;
		  	}
		  	}while(Repetir);
		  	
		  	if(Opcion==1) {
		  		do {
		  			System.out.println("Ingrese el motivo del despido");
		  			Motivo = lector.nextLine();
		  		}while(Motivo.equals(""));
		  	} else {
		  		do {
		  			try{
		  				Repetir = false;
		  				do {
		  					System.out.println("Desea renovar el contrato?");
		  					System.out.println("Si(1)");
		  					System.out.println("No(2)");
		  					Elegir = lector.nextInt();
		  				}while(Elegir<1 || Elegir>2);
		  		} catch(InputMismatchException ex) {
		  			System.out.println("Ingreso un dato valido");
		  			lector.next();
		  			System.out.println("");
		  			Repetir = true;
		  		}
		  		}while(Repetir);
		  		if(Elegir==1) {
		  			do {
		  				try{
		  					Repetir = false;
		  					do {
		  						System.out.println("Seleccione el tipo de contratacion");
		  						for(int N=0;N<Renovacion.length;N++) {
		  							System.out.println(Renovacion[N]+"("+N+")");
		  						}
		  						Seleccionar = lector.nextInt();
		  					}while(Seleccionar<0 || Seleccionar>1);
		  			} catch(InputMismatchException ex) {
		  				System.out.println("Ingreso un dato valido");
		  				lector.next();
		  				System.out.println("");
		  				Repetir = true;
		  			}
		  			}while(Repetir);
		  			
		  			do {
		  				try{
		  					Repetir = false;
		  					if(Seleccionar==0) {
		  						do {
		  							System.out.println("Ingrese en meses la duracion del contrato");
		  							Meses = lector.nextInt();
		  						}while(Meses<0);
		  					}
		  					do {
		  						System.out.println("Si desea aumentar el sueldo mensual del trabajador ingrese el monto a sumar");
		  						System.out.println("en caso de que no ingrese un 0");
		  						Saldo = lector.nextDouble();
		  					}while(Saldo<0);
		  			} catch(InputMismatchException ex) {
		  				System.out.println("Ingreso un dato valido");
		  				lector.next();
		  				System.out.println("");
		  				Repetir = true;
		  			}
		  			}while(Repetir);
		  		}
		  	}
		  	if(Opcion==1) {
		  		Liquidacion = SalarioBruto*3;
		  		System.out.println("");
		  		System.out.println("*******************************************");
		  		System.out.println("El trabajador de nombre "+nombre);
		  		System.out.println("Que ejercia el puesto de "+Puestos[Puesto]);
		  		System.out.println("Con un sueldo bruto mensual de "+SalarioBruto);
		  		System.out.println("Fue despedido por el siguiente motivo:");
		  		System.out.println(Motivo);
		  		System.out.println("Recibira una liquidacion de "+Liquidacion+" Por sus servicios");
		  		System.out.println("*******************************************");
		  		System.out.println("");
		  	} else {
		  		if(Elegir==2) {
		  			System.out.println("");
		  			System.out.println("*******************************************");
		  			System.out.println("El trabajador de nombre "+nombre);
		  			System.out.println("Que ejercia el puesto de "+Puestos[Puesto]);
		  			System.out.println("Con un sueldo bruto de "+SalarioBruto);
		  			System.out.println("Dejara la empresa por motivos de que su contrato a terminado");
		  			System.out.println("Le agradecemos por el tiempo que trabajo para nosotros");
		  			System.out.println("*******************************************");
		  			System.out.println("");
		  		} else {
		  			NuevoSueldo = SalarioBruto+Saldo;
		  			System.out.println("");
		  			System.out.println("*******************************************");
		  			System.out.println("El trabajador de nombre "+nombre);
		  			System.out.println("Que ejercia el puesto de "+Puestos[Puesto]);
		  			System.out.println("Con un sueldo bruto mensual de "+SalarioBruto);
		  			System.out.println("Recibio una "+Renovacion[Seleccionar]);
		  			if(Seleccionar==0) {
		  				System.out.println("Que durara durante "+Meses+ " Meses");
		  			}
		  			System.out.println("Con un sueldo mensual de "+NuevoSueldo);
		  			System.out.println("*******************************************");
		  			System.out.println("");
		  		}
		  	}
		  }
	  	public void PedirDatos() {
	  		do {
	  			try{
	  				Repetir = false;
	  				do {
	  					System.out.println("Ingrese su salario bruto mensual");
	  					SalarioBruto = lector.nextDouble();
	  				}while(SalarioBruto<=0);
	  				do {
	  					System.out.println("Ingrese el monto de a�os trabajados");
	  					A�os = lector.nextInt();
	  				}while(A�os<0 || A�os>60);
	  		} catch(InputMismatchException ex) {
	  			System.out.println("Ingreso un dato valido");
	  			lector.next();
	  			System.out.println("");
	  			Repetir = true;
	  		}
	  		}while(Repetir);
	  		SalarioBrutoAnual = SalarioBruto*12;
	  		if(SalarioBrutoAnual<=100000) {
	  			IR = 0;
	  		}
	  		if(SalarioBrutoAnual>100000 && SalarioBrutoAnual<=200000) {
	  			IR = 15;
	  		}
	  		if(SalarioBrutoAnual>200000 && SalarioBrutoAnual<=350000) {
	  			IR = 20;
	  		}
	  		if(SalarioBrutoAnual>350000 && SalarioBrutoAnual<=500000) {
	  			IR = 25;
	  		}
	  		if(SalarioBrutoAnual>500000) {
	  			IR = 30;
	  		}
	  		
	  		if(A�os>3) {
	  			Antiguedad = 15;
	  		} else {
	  			Antiguedad = 0;
	  		}
	  		MontoAntiguedad = (SalarioBrutoAnual*Antiguedad/100)/12;
	  		MontoSindicato = (SalarioBrutoAnual*Sindicato/100)/12;
	  		SalarioTotal=((SalarioBrutoAnual)/12)+MontoAntiguedad;
	  		Montoinss=(SalarioTotal*INSS/100)/12;
	  		MontoIr=(SalarioTotal*IR/100)/12;
	  		TotalDeducciones=Montoinss+MontoIr+MontoSindicato;
	  		Montoinsspatronal=(SalarioTotal*INSSPatronal/100)/12;
	  		SalarioNeto=SalarioTotal-TotalDeducciones;
	  		System.out.println("***Tasas***");
	  		System.out.println("INSS = "+INSS+"%");
	  		System.out.println("IR = "+IR+"%");
	  		System.out.println("Sindicato = "+Sindicato+"%");
	  		System.out.println("INSS Patronal = "+INSSPatronal+"%");
	  		System.out.println("Antiguedad = "+Antiguedad+"%");
	  		System.out.println("***Ingresos del empleado***");
	  		System.out.println("Ingreso Bruto = "+SalarioBruto);
	  		System.out.println("Monto por antiguedad = "+MontoAntiguedad);
	  		System.out.println("Monto del ingreso total = "+SalarioTotal);
	  		System.out.println("***Deducciones sobre el ingresos bruto***");
	  		System.out.println("Monto por afilaciones del sindicato = "+MontoSindicato);
	  		System.out.println("***Deducciones sobre el ingreso total***");
	  		System.out.println("Monto de INSS = "+Montoinss);
	  		System.out.println("Monto de IR = "+MontoIr );
	  		System.out.println("Monto total de deducciones = "+TotalDeducciones);
	  		System.out.println("***Deducciones del empleador***");
	  		System.out.println("Monto del INSS patronal ="+Montoinsspatronal);
	  		System.out.println("***Total a pagar***");
	  		System.out.println("Monto del ingreso Neto = "+SalarioNeto);
	  		System.out.println("");
	  	}
	 
	Scanner lector = new Scanner (System.in);
	
	public void  Aspirante1() {

	
	
			System.out.println("Ingrese los datos que se le pide a continuacion");
			System.out.println(" Nombre completo");
			nombre=lector.nextLine();
			while(nombre.equals("")) {
				System.out.println("El campo no puede estar vacio");
				nombre=lector.nextLine();
			
			}
			
			System.out.println("");	
			do {
			do {
			comprobacion=2;
			try {
			
				System.out.println("Ingrese su edad");	
				edad=lector.nextInt();
				if(edad<18 || edad>59){
					System.out.println("Usted no puede trabajar en esta empresa porque no cumple los requisitos de edad de entre 18 y 59 a�os");
					System.out.println("Ingrese una edad valida");
				}
			} catch (InputMismatchException e) {
				System.out.println("Solo puede ingresar numeros");
				lector.next();
				comprobacion=1;	
				
			}
			}while(comprobacion!=2);
			}while(edad<18 || edad>59); 
				
			
			System.out.println("");	
			System.out.println("Fecha de nacimiento");
		    lector.nextLine();
		    FechaNacimiento=lector.nextLine();
			System.out.println("");
		while(FechaNacimiento.equals("")){
			System.out.println("El campo no puede estar vacio");
			FechaNacimiento=lector.nextLine();
		}
			System.out.println("Dirrecion");
			Dirrecion=lector.nextLine();
			while(Dirrecion.equals("")){
				System.out.println("El campo no puede estar vacio");
				Dirrecion=lector.nextLine();
			}
			System.out.println("");
			System.out.println("Estado civil");
			EstadoCivil=lector.nextLine();
			while(EstadoCivil.equals("")){
				System.out.println("El campo no puede estar vacio");
				EstadoCivil=lector.nextLine();
			}
			System.out.println("");
			System.out.println("Correo");
			Correo=lector.nextLine();
			while(Correo.equals("")){
				System.out.println("El campo no puede estar vacio");
				Correo=lector.nextLine();
			}
			System.out.println("");
			System.out.println("Numero de telefono");
			NumeroDeTelefono=lector.nextLine();
			while(NumeroDeTelefono.equals("")){
				System.out.println("El campo no puede estar vacio");
				NumeroDeTelefono=lector.nextLine();
			}
			System.out.println("");
			System.out.println("Nivel de escolaridad");
			NivelDeEscolaridad=lector.nextLine();
			while(NivelDeEscolaridad.equals("")){
				System.out.println("El campo no puede estar vacio");
				NivelDeEscolaridad=lector.nextLine();
			}
			System.out.println("");
			System.out.println("Para las siguientes preguntas responda si o no");
			System.out.println("Tiene Experiencia Laboral?");
			ExperienciaLaboral=lector.nextLine();
			if(ExperienciaLaboral.equalsIgnoreCase("si")) {
				puntaje=puntaje+1;
			}
			while(ExperienciaLaboral.equals("")){
				System.out.println("El campo no puede estar vacio");
				ExperienciaLaboral=lector.nextLine();
			}
			System.out.println("");
			System.out.println("Sabe ingles");
			Idioma=lector.nextLine();
			if(Idioma.equalsIgnoreCase("si")) {
				puntaje=puntaje+1;				
		}
			while(Idioma.equals("")){
				System.out.println("El campo no puede estar vacio");
				Idioma=lector.nextLine();
			}
				
			System.out.println("");
			System.out.println("Tiene referencia");
			Referencia=lector.nextLine();
			if(Referencia.equalsIgnoreCase("si")) {
				puntaje=puntaje+1;								
			}
			while(Referencia.equals("")){
				System.out.println("El campo no puede estar vacio");
				Referencia=lector.nextLine();
			}
			
			puntajeAspirante1=puntajeRespuestas*puntaje;
			System.out.println("Su puntaje es " + puntajeAspirante1);
	
	}
	




	


public void  Aspirante2() {
	
	
	System.out.println("Ingrese los datos que se le pide a continuacion");
	System.out.println(" Nombre completo");
	nombre=lector.nextLine();
	while(nombre.equals("")) {
		System.out.println("El campo no puede estar vacio");
		nombre=lector.nextLine();
	
	}
	
	System.out.println("");	
	do {
	do {
	comprobacion=2;
	try {
	
		System.out.println("Ingrese su edad");	
		edad=lector.nextInt();
		if(edad<18 || edad>59){
			System.out.println("Usted no puede trabajar en esta empresa porque no cumple los requisitos de edad de entre 18 y 59 a�os");
			System.out.println("Ingrese una edad valida");
		}
	} catch (InputMismatchException e) {
		System.out.println("Solo puede ingresar numeros");
		lector.next();
		comprobacion=1;	
		
	}
	}while(comprobacion!=2);
	}while(edad<18 || edad>59); 
		
	
	System.out.println("");	
	System.out.println("Fecha de nacimiento");
    lector.nextLine();
    FechaNacimiento=lector.nextLine();
	System.out.println("");
while(FechaNacimiento.equals("")){
	System.out.println("El campo no puede estar vacio");
	FechaNacimiento=lector.nextLine();
}
	System.out.println("Dirrecion");
	Dirrecion=lector.nextLine();
	while(Dirrecion.equals("")){
		System.out.println("El campo no puede estar vacio");
		Dirrecion=lector.nextLine();
	}
	System.out.println("");
	System.out.println("Estado civil");
	EstadoCivil=lector.nextLine();
	while(EstadoCivil.equals("")){
		System.out.println("El campo no puede estar vacio");
		EstadoCivil=lector.nextLine();
	}
	System.out.println("");
	System.out.println("Correo");
	Correo=lector.nextLine();
	while(Correo.equals("")){
		System.out.println("El campo no puede estar vacio");
		Correo=lector.nextLine();
	}
	System.out.println("");
	System.out.println("Numero de telefono");
	NumeroDeTelefono=lector.nextLine();
	while(NumeroDeTelefono.equals("")){
		System.out.println("El campo no puede estar vacio");
		NumeroDeTelefono=lector.nextLine();
	}
	System.out.println("");
	System.out.println("Nivel de escolaridad");
	NivelDeEscolaridad=lector.nextLine();
	while(NivelDeEscolaridad.equals("")){
		System.out.println("El campo no puede estar vacio");
		NivelDeEscolaridad=lector.nextLine();
	}
	System.out.println("");
	System.out.println("Para las siguientes preguntas responda si o no");
	System.out.println("Tiene Experiencia Laboral?");
	ExperienciaLaboral=lector.nextLine();
	if(ExperienciaLaboral.equalsIgnoreCase("si")) {
		puntaje=puntaje+1;
	}
	while(ExperienciaLaboral.equals("")){
		System.out.println("El campo no puede estar vacio");
		ExperienciaLaboral=lector.nextLine();
	}
	System.out.println("");
	System.out.println("Sabe ingles");
	Idioma=lector.nextLine();
	if(Idioma.equalsIgnoreCase("si")) {
		puntaje=puntaje+1;				
}
	while(Idioma.equals("")){
		System.out.println("El campo no puede estar vacio");
		Idioma=lector.nextLine();
	}
		
	System.out.println("");
	System.out.println("Tiene referencia");
	Referencia=lector.nextLine();
	if(Referencia.equalsIgnoreCase("si")) {
		puntaje=puntaje+1;								
	}
	while(Referencia.equals("")){
		System.out.println("El campo no puede estar vacio");
		Referencia=lector.nextLine();
	}
	
	
	
	puntajeAspirante2=puntajeRespuestas*puntaje;
	System.out.println(puntajeAspirante2);


}

public void GerenteAdministrativo () {
	nombre="Steven Daniel Lopez ";
	edad=30;	
}


public void GerenteDeVenta() {
	nombre="Maria Jose Morales  ";
	edad=28;	
}
	
public void Contador () {
	nombre="Angela Guadalupe Lopez Morales ";
	edad=40;	
}
public void ResponsableCarteraYCobro () {
	nombre="Alex Daniel Blanco ";
	edad=37;	
}
public void Caja () {
	nombre="Manuel David Urbina ";
	edad=40;	
}
public void Facturador () {
	nombre="Aurora Alexandra Reyes Blanco ";
	edad=29;	
}
public void Secretraria () {
	nombre="Luisa Zaria Ezpinoza ";
	edad=34;	
}
public void ResponsableBodega () {
	nombre="Gabriel Felipe Perez Mu�oz ";
	edad=30;	
}
public void Despachador () {
	nombre="Valentino  Elenio Munguia ";
	edad=34;	
}
public void Repartidor1 () {
	nombre="Julio Morgan Urbina Lara ";
	edad=40;	
}
public void Repartidor2 () {
	nombre="Octavio Noel Torrez ";
	edad=58;	
}


	public static void main(String[] args) {
		
		RecursosHumanos obj = new RecursosHumanos ();
		 Scanner lector = new Scanner (System.in);
	int opcion, comprobacion;

	 String [] PuestosDeTrabajo = new String [12];
		
		PuestosDeTrabajo[0]="GerenteAdministrativo";
		PuestosDeTrabajo[1]="GerenteDeVenta"; 
		PuestosDeTrabajo[2]="Contador"; 
		PuestosDeTrabajo[3]="AuxiliarDeContador";
		PuestosDeTrabajo[4]="ResponsableCarteraYCobro"; 
		PuestosDeTrabajo[5]="Cajera"; 
		PuestosDeTrabajo[6]="Facturador"; 
		PuestosDeTrabajo[7]="Secretaria";
		PuestosDeTrabajo[8]="ResponsableBodega";
		PuestosDeTrabajo[9]="Despachador";
		PuestosDeTrabajo[10]="Repartidor1";
		PuestosDeTrabajo[10]="Repartidor2";
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
		
					
    System.out.println("Aspirante 1");
    obj.Aspirante1();
    System.out.println("Aspirante 2");
	obj.Aspirante2();
	if(puntajeAspirante1>puntajeAspirante2) {
		System.out.println("Aspirante 1 Contratado");
	}else if(puntajeAspirante2>puntajeAspirante1) {
		System.out.println("Aspirante 2 Contratado");
	}
	break;
							
	case 2:
		obj.PedirDatos();
				break;
				
	case 3:
				
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


