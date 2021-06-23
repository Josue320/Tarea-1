package figuras;

public class HusoEsferico extends Figuras{
double Radio;
double Grados;
	public HusoEsferico(int Lados, double LongitudDeLados, double Altura,double Radio,double Grados) {
		super(Lados, LongitudDeLados, Altura);
		this.Radio = Radio;
		this.Grados = Grados;
		System.out.println("Se a creado un huso esferico");
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
