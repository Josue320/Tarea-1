package figuras;

import java.util.InputMismatchException;

public class Icosaedro extends Figuras{
double Arista;
	public Icosaedro(int Lados, double LongitudDeLados, double Altura,double Arista) {
		super(Lados, LongitudDeLados, Altura);
		this.Arista = Arista;
		System.out.println("Se a creado un icosaedro");
	}
	public void CalcularDimensiones(double Arista) {
		double AreaBase = 5*Math.pow(Arista, 2)*Math.sqrt(3);
		double Volumen = 0.416*(3+Math.sqrt(5)*Math.pow(Arista, 3));
		System.out.println("El area del icosaedro es "+AreaBase);
		System.out.println("El volumen del icosaedro es "+Volumen);
	}
	public void PedirDatos(){
		do {
			try{
				Repetir = false;
				do {
					System.out.println("ingrese la arista ");
					Arista = lector.nextDouble();
				}while(Arista<0);
		} catch(InputMismatchException ex) {
			System.out.println("Ingreso un dato valido");
			lector.next();
			System.out.println("");
			Repetir = true;
		}
		}while(Repetir);
		Icosaedro Icosaedro = new Icosaedro(0,0,0,Arista);
		Icosaedro.CalcularDimensiones(Arista);
	}
	public double getArista() {
		return Arista;
	}
	public void setArista(double arista) {
		Arista = arista;
	}

}
