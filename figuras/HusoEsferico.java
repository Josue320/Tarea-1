package figuras;

import java.util.InputMismatchException;

public class HusoEsferico extends Figuras{
double Radio;
double Grados;
	public HusoEsferico(int Lados, double LongitudDeLados, double Altura,double Radio,double Grados) {
		super(Lados, LongitudDeLados, Altura);
		this.Radio = Radio;
		this.Grados = Grados;
		System.out.println("Se a creado un huso esferico");
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
		HusoEsferico HusoEsferico = new HusoEsferico(0,0,0,Radio,Grados);
		HusoEsferico.CalcularDimensiones(Radio, Grados);
	}
	public double getGrados() {
		return Grados;
	}
	public void setGrados(double grados) {
		Grados = grados;
	}
	public void CalcularDimensiones(double Radio, double Grados) {
		double AreaBase = (4*Math.PI*Math.pow(Radio, 2)*Grados)/360;
		System.out.println("El area del huso esferico es "+AreaBase);
	}
	public double getRadio() {
		return Radio;
	}
	public void setRadio(double radio) {
		Radio = radio;
	}

}
