package figuras;

public class Figuras {
	private int Lados;
	private double LongitudDeLados,Altura;
	public Figuras(int Lados, double LongitudDeLados, double Altura) {
		this.Altura = Altura;
		this.Lados = Lados;
		this.LongitudDeLados = LongitudDeLados;
		System.out.println("Se ha creado un cuerpo geometrico");
	}
	public int getLados() {
		return Lados;
	}
	public void setLados(int lados) {
		Lados = lados;
	}
	public double getLongitudDeLados() {
		return LongitudDeLados;
	}
	public void setLongitudDeLados(double longitudDeLados) {
		LongitudDeLados = longitudDeLados;
	}
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		Altura = altura;
	}
	
}
