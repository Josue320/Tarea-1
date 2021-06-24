package figuras;

import java.util.InputMismatchException;

public class TroncoDePiramide extends Figuras {

static double Altura;
private double ApotemaBase,ApM,Arista,AristaM;
public TroncoDePiramide(int Lados, double LongitudDeLados, double Altura,double ApotemaBase,double ApM, double Arista, double AristaM) {
	super(Lados, LongitudDeLados, Altura);
	this.ApM = ApM;
	this.ApotemaBase = ApotemaBase;
	this.Arista = Arista;
	this.AristaM = AristaM;
	System.out.println("Se a creado un tronco de piramide");
}
public void CalcularDimensiones(double Altura,double ApotemaBase,double ApM,double Arista,double AristaM) {
	PerimetroM = 4*AristaM;
	Perimetro = 4*Arista;
	Ap = Math.sqrt(Altura*Altura+Math.pow(ApM-ApotemaBase, 2));
	double AreaLateral = ((PerimetroM+Perimetro)/2)*Ap;
	AreaBaseM = Math.pow(AristaM, 2);
	AreaBase = Math.pow(Arista, 2);
	double AreaTotal = AreaLateral+AreaBaseM+AreaBase;
	double Volumen = 0.33 * Altura*(AreaBaseM+AreaBase+Math.sqrt(AreaBaseM*AreaBase));
	
	System.out.println("El area lateral del tronco de la piramide es "+AreaLateral);
	System.out.println("El area total del tronco de la piramide es "+AreaTotal);
	System.out.println("El volumen del tronco de la piramide es "+Volumen);
}
public void PedirDatos() {
		do {
			try{
				Repetir = false;
				do {
					System.out.println("Ingresa el apotema de la base menor");
					ApotemaBase = lector.nextDouble();
				}while(ApotemaBase<0);
				do {
					System.out.println("ingresa el apotema de la base mayor");
					ApM = lector.nextDouble();
				}while(ApM<0);
				do {
					System.out.println("ingrese la altura");
					Altura = lector.nextDouble();
				}while(Altura<0);
				do {
					System.out.println("ingrese la longitud de la arista menor");
					Arista = lector.nextDouble();
				}while(Arista<0);
				do {
					System.out.println("ingresa la longitud de la arista mayor");
					AristaM = lector.nextDouble();
				}while(AristaM<0);
		} catch(InputMismatchException ex) {
			System.out.println("Ingreso un dato valido");
			lector.next();
			System.out.println("");
			Repetir = true;
		}
		}while(Repetir);
		TroncoDePiramide TroncoDePiramide = new TroncoDePiramide(0,0,Altura,ApotemaBase,ApM,Arista,AristaM);
		TroncoDePiramide.CalcularDimensiones(Altura, ApotemaBase, ApM, Arista, AristaM);
}

	public double getApotemaBase() {
	return ApotemaBase;
}

public void setApotemaBase(double apotemaBase) {
	ApotemaBase = apotemaBase;
}

public double getApM() {
	return ApM;
}

public void setApM(double apM) {
	ApM = apM;
}

public double getArista() {
	return Arista;
}

public void setArista(double arista) {
	Arista = arista;
}

public double getAristaM() {
	return AristaM;
}

public void setAristaM(double aristaM) {
	AristaM = aristaM;
}

	

}
