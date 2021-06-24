package figuras;

import java.util.InputMismatchException;

public class ZonaEsferica extends Figuras {
private double Radio,RadioM;
static double Altura;
	public ZonaEsferica(int Lados, double LongitudDeLados, double Altura,double RadioM,double Radio) {
		super(Lados, LongitudDeLados, Altura);
		this.Radio = Radio;
		this.RadioM = RadioM;
		System.out.println("Se a creado una zona esferica");
	}
	public void CalcularDimensiones(double Altura, double RadioM, double Radio) {
		AreaBase = 2*Math.PI*RadioM*Altura;
		double Volumen = Math.PI*Altura*(Math.pow(Altura, 2)+3*Math.pow(Radio, 2)+3*Math.pow(Radio, 2))/6;
		System.out.println("El area de la zona es "+AreaBase);
		System.out.println("El volumen de la zona es "+Volumen);
	}
	public void PedirDatos() {
		do {
			try{
				Repetir = false;
				do {
					System.out.println("Ingresa el radio mayor");
					RadioM = lector.nextDouble();
				}while(RadioM<0);
				do {
					System.out.println("ingresa el radio menor");
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
		ZonaEsferica ZonaEsferica = new ZonaEsferica(0,0,Altura,RadioM,Radio);
		ZonaEsferica.PedirDatos();
	}
	public double getRadioM() {
		return RadioM;
	}
	public void setRadioM(double radioM) {
		RadioM = radioM;
	}
	public double getRadio() {
		return Radio;
	}
	public void setRadio(double radio) {
		Radio = radio;
	}

}
