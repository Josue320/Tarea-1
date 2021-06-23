package figuras;

public class Cilindro extends Figuras{
	private double Radio;
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
	public double getRadio() {
		return Radio;
	}
	public void setRadio(double radio) {
		Radio = radio;
	}

}
