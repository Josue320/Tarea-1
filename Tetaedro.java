package figuras;

public class Tetaedro extends Figuras {
double Arista;
	public Tetaedro(int Lados, double LongitudDeLados, double Altura,double Arista) {
		super(Lados, LongitudDeLados, Altura);
		this.Arista = Arista;
		System.out.println("Se a creado un tetraedro");
	}
	public void CalcularDimensiones(double Arista) {
		double AreaBase = Math.pow(Arista, 2)*Math.sqrt(3);
		double Volumen = 0.11785*Math.pow(Arista, 3);
		double Altura = Arista*0.816;
		System.out.println("El area del tetraedro es "+AreaBase);
		System.out.println("El volumen del tetraedro es "+Volumen);
		System.out.println("La altura del tetraedro es "+Altura);
	}
	public double getArista() {
		return Arista;
	}
	public void setArista(double arista) {
		Arista = arista;
	}
	

}
