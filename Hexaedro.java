package figuras;

public class Hexaedro extends Figuras {
double Arista;
	public Hexaedro(int Lados, double LongitudDeLados, double Altura,double Arista) {
		super(Lados, LongitudDeLados, Altura);
		this.Arista = Arista;
		System.out.println("Se a creado un hexaedro");
	}
	public void CalcularDimensiones(double Arista) {
		double AreaBase = 6*Math.pow(Arista, 2);
		double Volumen = Math.pow(Arista, 3);
		double Diagonal = Arista*Math.sqrt(3);
		System.out.println("El area del hexaedro es "+AreaBase);
		System.out.println("El volumen del hexaedro es "+Volumen);
		System.out.println("La diagonal del hexaedro es "+Diagonal);
	}
	public double getArista() {
		return Arista;
	}
	public void setArista(double arista) {
		Arista = arista;
	}
	

}
