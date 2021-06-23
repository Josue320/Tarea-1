package figuras;

public class Cono extends Figuras {
	double Radio;
	public Cono(int Lados, double LongitudDeLados, double Altura,double Radio) {
		super(Lados, LongitudDeLados, Altura);
		this.Radio = Radio;
		System.out.println("Se a creado un cono");
	}
	public void CalcularDimensiones(int Lados, double LongitudDeLados,double Altura,double Radio) {
		double Generatriz= Math.sqrt(Math.pow(Altura, 2)+Math.pow(Radio, 2));
		double AreaLateral = Math.PI*Radio*Generatriz;
		double AreaTotal = Math.PI*Radio*(Generatriz*Radio);
		double AreaBase = Math.PI*Math.pow(Radio, 2);
		double Volumen = AreaBase*Altura/3;
		System.out.println("El area lateral es "+AreaLateral);
		System.out.println("El area total es "+AreaTotal);
		System.out.println("El volumen es "+Volumen);
	}
	public double getRadio() {
		return Radio;
	}
	public void setRadio(double radio) {
		Radio = radio;
	}

}
