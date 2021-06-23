package figuras;

public class Octaedro extends Figuras {
double Arista;
	public Octaedro(int Lados, double LongitudDeLados, double Altura, double Arista) {
		super(Lados, LongitudDeLados, Altura);
		this.Arista = Arista;
		System.out.println("Se a creado un octaedro");
	}
	public void CalcularDimensiones(double Arista) {
		double AreaBase = 2*Math.pow(Arista, 2)*Math.sqrt(3);
		double Volumen = 0.47*Math.pow(Arista, 3);
		System.out.println("El area del octaedro es "+AreaBase);
		System.out.println("El volumen del octaedro es "+Volumen);
	}
}
