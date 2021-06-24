package figuras;

import java.util.*;


public class Main {
	static boolean Repetir;
	static Scanner lector = new Scanner(System.in);
	static int Continuar,Figura;
	public static void main(String[] args) {
		do {
			do {
				try{
					Repetir = false;
					do {
						System.out.println("Bienvenido");
						System.out.println("Ingrese la figura que desea realizar");
						System.out.println("Prisma(1)");
						System.out.println("Cilindro(2)");
						System.out.println("Cono(3)");
						System.out.println("Esfera(4)");
						System.out.println("Hexaedro(5)");
						System.out.println("Icosaedro(6)");
						System.out.println("Octaedro(7)");
						System.out.println("Piramide(8)");
						System.out.println("Tetraedro(9)");
						System.out.println("Docaedro(10)");
						System.out.println("Tronco de cono(11)");
						System.out.println("Tronco de piramide(12)");
						System.out.println("Zona esferica(13)");
						System.out.println("Cuña esferica(14)");
						System.out.println("Huso esferico(15)");
						System.out.println("Casquete esferico(16)");
						Figura = lector.nextInt();
					}while(Figura<1 || Figura>16);
					if(Figura>0 || Figura<16) {
						switch(Figura) {
						case 1:
							Prisma Prisma = new Prisma(0,0,0);
							Prisma.PedirDatos();
							break;
						case 2:
							Cilindro Cilindro = new Cilindro(0,0,0,0);
							Cilindro.PedirDatos();
							break;
						case 3:
							Cono Cono = new Cono(0,0,0,0);
							Cono.PedirDatos();
							break;
						case 4:
							Esfera Esfera = new Esfera(0,0,0,0);
							Esfera.PedirDatos();
							break;
						case 5:
							Hexaedro Hexaedro = new Hexaedro(0,0,0,0);
							Hexaedro.PedirDatos();
							break;
						case 6:
							Icosaedro Icosaedro = new Icosaedro(0,0,0,0);
							Icosaedro.PedirDatos();
							break;
						case 7:
							Octaedro Octaedro = new Octaedro(0,0,0,0);
							Octaedro.PedirDatos();
							break;
						case 8:
							Piramide Piramide = new Piramide(0,0,0,0);
							Piramide.PedirDatos();
							break;
						case 9:
							Tetaedro Tetaedro = new Tetaedro(0,0,0,0);
							Tetaedro.PedirDatos();
							break;
						case 10:
							Docaedro Docaedro = new Docaedro(0,0,0,0);
							Docaedro.PedirDatos();
							break;
						case 11:
							TroncoDeCono TroncoDeCono = new TroncoDeCono(0,0,0,0,0);
							TroncoDeCono.PedirDatos();
							break;
						case 12:
							TroncoDePiramide TroncoDePiramide = new TroncoDePiramide(0,0,0,0,0,0,0);
							TroncoDePiramide.PedirDatos();
							break;
						case 13:
							ZonaEsferica ZonaEsferica = new ZonaEsferica(0,0,0,0,0);
							ZonaEsferica.PedirDatos();
							break;
						case 14:
							CuñaEsferica CuñaEsferica = new CuñaEsferica(0,0,0,0,0);
							CuñaEsferica.PedirDatos();
							break;
						case 15:
							HusoEsferico HusoEsferico = new HusoEsferico(0,0,0,0,0);
							HusoEsferico.PedirDatos();
							break;
						case 16:
							CasqueteEsferico CasqueteEsferico = new CasqueteEsferico(0,0,0,0);
							CasqueteEsferico.PedirDatos();
							break;
						}
					}
					do {
						System.out.println("Desea continuar usando la app");
						System.out.println("Si(1)");
						System.out.println("No(0)");
						Continuar = lector.nextInt();
					}while(Continuar<0 || Continuar>1);
			} catch(InputMismatchException ex) {
				System.out.println("Ingreso un dato valido");
				lector.next();
				System.out.println("");
				Repetir = true;
			}
			}while(Repetir);
		}while(Continuar==1);
		System.out.println("Vuelva pronto");
		lector.close();
	}

}
