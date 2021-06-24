package figuras;

import java.util.InputMismatchException;

public class Prisma extends Figuras {
	static int Lados;
	static double Altura;
	public Prisma(int Lados, double LongitudDeLados, double Altura) {
		super(Lados, LongitudDeLados, Altura);
		System.out.println("Se a creado un prisma");
	}
	public void CalcularDimensiones(int Lados, double LongitudDeLados,double Altura) {
		double AreaLateral = Lados*Altura*LongitudDeLados;
		double Ap = Math.sqrt(3*LongitudDeLados*LongitudDeLados/4);
		double AreaBase = (Lados*LongitudDeLados*Ap)/2;
		double AreaTotal = AreaLateral+2*AreaBase;
		double Volumen = AreaBase*Altura;
		System.out.println("El area lateral es "+AreaLateral);
		System.out.println("El area total es "+AreaTotal);
		System.out.println("El volumen es "+Volumen);
	}
	public void PedirDatos(){
		do {
			try{
				Repetir = false;
					do {
						System.out.println("Ingrese el numero de lados del prisma");
						Lados = lector.nextInt();
					}while(Lados<3);
					do {
						System.out.println("Ingrese la Longitud de los lados");
						Longitud = lector.nextDouble();
					}while(Longitud<0);
					do {
						System.out.println("Ingrese la Altura del prisma");
						Altura = lector.nextDouble();
					}while(Altura<0);
		} catch(InputMismatchException ex) {
			System.out.println("Ingreso un dato valido");
			lector.next();
			System.out.println("");
			Repetir = true;
		}
		}while(Repetir);
		Prisma Prisma = new Prisma(Lados,Longitud,Altura);
		Prisma.CalcularDimensiones(Lados, Longitud, Altura);
}

}