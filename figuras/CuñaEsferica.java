package figuras;

import java.util.InputMismatchException;

public class CuñaEsferica extends Figuras {
private double Grados, Radio;
	public CuñaEsferica(int Lados, double LongitudDeLados, double Altura,double Grados,double Radio) {
		super(Lados, LongitudDeLados, Altura);
		this.Grados = Grados;
		this.Radio = Radio;
	}
	public void CalcularDimensiones(double Grados,double Radio) {
		double Volumen = 1.33*(Math.PI*Math.pow(Radio, 3)*Grados)/360;
		System.out.println("El volumen de la cuña esferica es "+Volumen);
	}
	public void PedirDatos() {
	do {
		try{
			Repetir = false;
			do {
				System.out.println("ingrese el radio");
				Radio = lector.nextDouble();
			}while(Radio<0);
			do {
				System.out.println("ingresa los grados");
				Grados = lector.nextDouble();
			}while(Grados<0);
	} catch(InputMismatchException ex) {
		System.out.println("Ingreso un dato valido");
		lector.next();
		System.out.println("");
		Repetir = true;
	}
	}while(Repetir);
	CuñaEsferica CuñaEsferica = new CuñaEsferica(0,0,0,Grados,Radio);
	CuñaEsferica.CalcularDimensiones(Grados, Radio);
	}
	public double getGrados() {
		return Grados;
	}
	public void setGrados(double grados) {
		Grados = grados;
	}
	public double getRadio() {
		return Radio;
	}
	public void setRadio(double radio) {
		Radio = radio;
	}

}
