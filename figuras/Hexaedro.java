package figuras;

import java.util.InputMismatchException;

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
	public void PedirDatos() {
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
		Hexaedro Hexaedro = new Hexaedro(0,0,0,Arista);
		Hexaedro.CalcularDimensiones(Arista);
	}
	public double getArista() {
		return Arista;
	}
	public void setArista(double arista) {
		Arista = arista;
	}
	

}
