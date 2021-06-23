package figuras;

public class Piramide extends Figuras{
double Base;
	public Piramide(int Lados, double LongitudDeLados, double Altura,double Base) {
		super(Lados, LongitudDeLados, Altura);
		this.Base = Base;
		System.out.println("Se a creado una piramide");
	}
	public void CalcularDimensiones(int Lados, double Base,double Altura) {
		double Perimetro = Lados*Base;
		double Ap = Lados/2;
		double ApotemaP = Altura+Ap;
		double AreaLateral = Perimetro*ApotemaP/2;
		double AreaBase = Lados*Base*Ap/2;
		double AreaTotal = AreaLateral+AreaBase;
		double Volumen = AreaBase*Altura/3;
		
		System.out.println("El area lateral es "+AreaLateral);
		System.out.println("El area total es "+AreaTotal);
		System.out.println("El volumen es "+Volumen);
	}
	public double getBase() {
		return Base;
	}
	public void setBase(double base) {
		Base = base;
	}

}
