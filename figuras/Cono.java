package figuras;

import java.util.InputMismatchException;

public class Cono extends Figuras {
	static double Altura;
	double Radio;
	public Cono(int Lados, double LongitudDeLados, double Altura,double Radio) {
		super(Lados, LongitudDeLados, Altura);
		this.Radio = Radio;
		System.out.println("Se a creado un cono");
	}
	public void CalcularDimensiones(double Altura,double Radio) {
		double Generatriz= Math.sqrt(Math.pow(Altura, 2)+Math.pow(Radio, 2));
		double AreaLateral = Math.PI*Radio*Generatriz;
		double AreaTotal = Math.PI*Radio*(Generatriz*Radio);
		double AreaBase = Math.PI*Math.pow(Radio, 2);
		double Volumen = AreaBase*Altura/3;
		System.out.println("El area lateral es "+AreaLateral);
		System.out.println("El area total es "+AreaTotal);
		System.out.println("El volumen es "+Volumen);
	}
	public void PedirDatos() {
		do {
			try{
				Repetir = false;
				do {
					System.out.println("ingrese el radio del cono ");
					Radio = lector.nextDouble();
				}while(Radio<0);
				do {
					System.out.println("ingrese la altura del cono");
					Altura = lector.nextDouble();
				}while(Altura<0);
		} catch(InputMismatchException ex) {
			System.out.println("Ingreso un dato valido");
			lector.next();
			System.out.println("");
			Repetir = true;
		}
		}while(Repetir);
		Cono Cono = new Cono(0,0,Altura,Radio);
		Cono.CalcularDimensiones(Altura, Radio);
	}
	public double getRadio() {
		return Radio;
	}
	public void setRadio(double radio) {
		Radio = radio;
	}

}
