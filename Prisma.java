package figuras;

public class Prisma extends Figuras {
	public Prisma(int Lados, double LongitudDeLados, double Altura) {
		super(Lados, LongitudDeLados, Altura);
		System.out.println("Se a creado un prisma");
	}
	public void CalcularDimensiones(int Lados, double LongitudDeLados,double Altura) {
		double AreaLateral = Lados*Altura*LongitudDeLados;
		double Ap = Math.sqrt(3*LongitudDeLados*LongitudDeLados/4);
		double AreaBase = (Lados*LongitudDeLados*Ap)/2;
		double AreaTotal = AreaLateral+2*AreaBase;
		double Volumen = AreaBase*Altura;
		System.out.println("El area lateral es "+AreaLateral);
		System.out.println("El area total es "+AreaTotal);
		System.out.println("El volumen es "+Volumen);
	}

}
