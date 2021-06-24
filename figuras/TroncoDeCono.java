package figuras;

import java.util.InputMismatchException;

public class TroncoDeCono extends Figuras {
double RadioMayor;
double RadioMenor;
static double Altura;
	public TroncoDeCono(int Lados, double LongitudDeLados, double Altura,double RadioMayor,double RadioMenor) {
		super(Lados, LongitudDeLados, Altura);
		this.RadioMayor = RadioMayor;
		this.RadioMenor = RadioMenor;
		System.out.println("Se a creado un tronco de cono");
	}
	public void CalcularDimensiones(double Altura, double RadioMayor, double RadioMenor) {
		double Generatriz = Math.sqrt(Math.pow(Altura, 2)+Math.pow((RadioMayor-RadioMenor), 2));
		double AreaLateral = Math.PI*Generatriz*(RadioMayor+RadioMenor);
		double AreaTotal = AreaLateral+Math.PI*(Math.pow(RadioMayor, 2)+Math.pow(RadioMenor, 2));
		double Volumen = 0.33*Math.PI*Altura*(Math.pow(RadioMayor, 2)+Math.pow(RadioMenor, 2)+RadioMayor*RadioMenor);
		System.out.println("El area lateral es "+ AreaLateral);
		System.out.println("El area total es "+AreaTotal);
		System.out.println("El volumen es "+Volumen);
	}
	public void PedirDatos() {
		do {
			try{
				Repetir = false;
				do {
					System.out.println("ingrese la altura ");
					Altura = lector.nextDouble();
				}while(Altura<0);
				do {
					System.out.println("ingresa el radio menor");
					Radio = lector.nextDouble();
				}while(Radio<0);
				do {
					System.out.println("ingresa el radio mayor");
					RadioM = lector.nextDouble();
				}while(RadioM<0);
		} catch(InputMismatchException ex) {
			System.out.println("Ingreso un dato valido");
			lector.next();
			System.out.println("");
			Repetir = true;
		}
		}while(Repetir);
		TroncoDeCono TroncoDeCono = new TroncoDeCono(0,0,Altura,RadioM,Radio);
		TroncoDeCono.CalcularDimensiones(Altura, RadioM, Radio);
	}
	public double getRadioMayor() {
		return RadioMayor;
	}
	public void setRadioMayor(double radioMayor) {
		RadioMayor = radioMayor;
	}
	public double getRadioMenor() {
		return RadioMenor;
	}
	public void setRadioMenor(double radioMenor) {
		RadioMenor = radioMenor;
	}
	
	

}
