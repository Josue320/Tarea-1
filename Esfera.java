package figuras;

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
	public double getRadio() {
		return Radio;
	}
	public void setRadio(double radio) {
		Radio = radio;
	}

}
