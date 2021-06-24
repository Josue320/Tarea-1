package figuras;

import java.util.InputMismatchException;

public class Docaedro extends Figuras{
double Arista;
	public Docaedro(int Lados, double LongitudDeLados, double Altura,double Arista) {
		super(Lados, LongitudDeLados, Altura);
		this.Arista = Arista;
		System.out.println("Se a creado un docaedro");
	}
	public void CalcularDimensiones(double Arista) {
		double AreaBase = 3*Math.pow(Arista, 2)*6.88;
		double Volumen = 0.25*30.65*Math.pow(Arista, 3);
		double Angulo = 2*Math.PI/(2*5);
		double Ap = Arista/(2*Math.tan(Angulo));
		double AreaPentagono = 2.5*Arista*Ap;
		System.out.println("El area del pentagono es "+AreaPentagono);
		System.out.println("El area del docaedro "+AreaBase);
		System.out.println("El volumen es "+Volumen);
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
		Docaedro Docaedro = new Docaedro(0,0,0,Arista);
		Docaedro.CalcularDimensiones(Arista);
	}
	public double getArista() {
		return Arista;
	}
	public void setArista(double arista) {
		Arista = arista;
	}
}
