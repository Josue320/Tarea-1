package figuras;

import java.util.InputMismatchException;

public class Esfera extends Figuras {
double Radio;
	public Esfera(int Lados, double LongitudDeLados, double Altura,double Radio) {
		super(Lados, LongitudDeLados, Altura);
		this.Radio = Radio;
		System.out.println("Se a creado una esfera");
	}
	public void CalcularDimensiones(double Radio) {
		double AreaBase = 4*Math.PI*Math.pow(Radio, 2);
		double Volumen = 1.33*Math.PI*Math.pow(Radio, 3);
		System.out.println("El area es "+AreaBase);
		System.out.println("El volumen es "+Volumen);
	}
	public void PedirDatos() {
		do {
			try{
				Repetir = false;
				do {
					System.out.println("ingresar el radio de la esfera ");
					Radio = lector.nextDouble();
				}while(Radio<0);
		} catch(InputMismatchException ex) {
			System.out.println("Ingreso un dato valido");
			lector.next();
			System.out.println("");
			Repetir = true;
		}
		}while(Repetir);
		Esfera Esfera = new Esfera(0,0,0,Radio);
		Esfera.CalcularDimensiones(Radio);
	}
	public double getRadio() {
		return Radio;
	}
	public void setRadio(double radio) {
		Radio = radio;
	}

}
