package figuras;

public class TroncoDeCono extends Figuras {
double RadioMayor;
double RadioMenor;
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
