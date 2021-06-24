package figuras;

import java.util.InputMismatchException;

public class Cilindro extends Figuras{
	private double Radio;
	static double Altura;
	public Cilindro(int Lados, double LongitudDeLados, double Altura,double Radio) {
		super(Lados, LongitudDeLados, Altura);
		this.Radio = Radio;
		System.out.println("Se a creado un cilindro");
	}
	public void CalcularDimensiones( double Radio,double Altura) {
		double Perimetro = 2*Math.PI*Radio;
		double AreaBase = Math.PI*Radio*Radio;
		double AreaLateral = Perimetro*Altura;
		double AreaTotal = AreaLateral+2*AreaBase;
		double Volumen = AreaBase*Altura;
		System.out.println("El area lateral es "+AreaLateral);
		System.out.println("El area total es "+AreaTotal);
		System.out.println("El volumen es "+Volumen);
	}
	public void PedirDatos() {
		do {
			try{
				Repetir = false;
				do {
					System.out.println("ingresar la altura del clindro");
					Altura = lector.nextDouble();
				}while(Altura<0);
				do {
					System.out.println("ingresar el radio");
					Radio = lector.nextDouble();
				}while(Radio<0);	
		} catch(InputMismatchException ex) {
			System.out.println("Ingreso un dato valido");
			lector.next();
			System.out.println("");
			Repetir = true;
		}
		}while(Repetir);
		Cilindro Cilindro = new Cilindro(0,0,Altura,Radio);
		Cilindro.CalcularDimensiones(Radio, Altura);
	}
	public double getRadio() {
		return Radio;
	}
	public void setRadio(double radio) {
		Radio = radio;
	}

}
