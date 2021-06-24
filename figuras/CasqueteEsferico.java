package figuras;

import java.util.InputMismatchException;

public class CasqueteEsferico extends Figuras{
private double Radio;
static double Altura;
	public CasqueteEsferico(int Lados, double LongitudDeLados, double Altura,double Radio) {
		super(Lados, LongitudDeLados, Altura);
		this.Radio = Radio;
	}
	public void CalcularDimensiones(double Altura,double Radio) {
		AreaBase = 2*Math.PI*Radio*Altura;
		double Volumen = Math.PI*Math.pow(Altura, 2)*(3*Radio-Altura)/3;
		System.out.println("El area del casquete es "+AreaBase);
		System.out.println("El volumen del casquete es "+Volumen);
	}
	public void PedirDatos() {
		do {
			try{
				Repetir = false;
				do {
					System.out.println("ingresa el radio");
					Radio = lector.nextDouble();
				}while(Radio<0);
				do {
					System.out.println("ingresa la altura");
					Altura = lector.nextDouble();
				}while(Altura<0);
		} catch(InputMismatchException ex) {
			System.out.println("Ingreso un dato valido");
			lector.next();
			System.out.println("");
			Repetir = true;
		}
		}while(Repetir);
		CasqueteEsferico CasqueteEsferico = new CasqueteEsferico(0,0,Altura,Radio);
		CasqueteEsferico.CalcularDimensiones(Altura, Radio);
	}
	public double getRadio() {
		return Radio;
	}
	public void setRadio(double radio) {
		Radio = radio;
	}

}
