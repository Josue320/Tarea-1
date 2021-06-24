package figuras;

import java.util.InputMismatchException;

public class Piramide extends Figuras{
	static double Altura;
	static int Lados;
double Base;
	public Piramide(int Lados, double LongitudDeLados, double Altura,double Base) {
		super(Lados, LongitudDeLados, Altura);
		this.Base = Base;
		System.out.println("Se a creado una piramide");
	}
	public void CalcularDimensiones(int Lados, double Base,double Altura) {
		double Perimetro = Lados*Base;
		double Ap = Lados/2;
		double ApotemaP = Altura+Ap;
		double AreaLateral = Perimetro*ApotemaP/2;
		double AreaBase = Lados*Base*Ap/2;
		double AreaTotal = AreaLateral+AreaBase;
		double Volumen = AreaBase*Altura/3;
		
		System.out.println("El area lateral es "+AreaLateral);
		System.out.println("El area total es "+AreaTotal);
		System.out.println("El volumen es "+Volumen);
	}
	public void PedirDatos(){
		do {
			try{
				Repetir = false;
				do {
					System.out.println("ingrese la altura");
					Altura = lector.nextDouble();
				}while(Altura<0);
				do {
					System.out.println("ingrese el numero de lados");
					Lados = lector.nextInt();
				}while(Lados<3);
				do {
					System.out.println("ingrese la longitud de la base");
					Longitud = lector.nextDouble();
				}while(Longitud<0);
		} catch(InputMismatchException ex) {
			System.out.println("Ingreso un dato valido");
			lector.next();
			System.out.println("");
			Repetir = true;
		}
		}while(Repetir);
		Piramide Piramide = new Piramide(Lados,0,Altura,Longitud);
		Piramide.CalcularDimensiones(Lados, Longitud, Altura);
	}
	public double getBase() {
		return Base;
	}
	public void setBase(double base) {
		Base = base;
	}

}
