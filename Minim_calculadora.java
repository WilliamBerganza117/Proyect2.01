package paquete; // Conjunto del codigo que mantiene a todo el grupo del codigo agrupado //
import java.util.Scanner; //Esta variable permite la utilizacion de escritura por teclado //
public class Minim_calculadora { // 
	private static Scanner s; // Crea una variable estatica en este caso la variable Scanner s que sera asignada  //
	

	public static void main(String[] args) { // Cuerpo del programa//
		int a = 0,b,c,d, x[]; // Declaracion de las variables a usar en el programa
		x= new int [15]; // Asigancion del espacio que tendra el array en el programa
		
			s = new Scanner(System.in); // variable que se usara para la introduccion de datos por teclado
			do{ // Ayuda a crear un ciclo repetido, en este caso para que el menu se repita cada vez que finaliza una operacion
			System.out.println ("Bienvenido al interfaz de la calculadora"); // Imprime el titulo del menu
			System.out.println("¿Que operacion desea hacer?"); // Imprime el sub enu del titulo
			System.out.println("1 = Suma de 2 numeros");//Imprime la Operacion suma
			System.out.println("2 = Resta de 2 numeros"); //Imprime la Operacion resta
			System.out.println("3 = Multiplicacion de 2 numeros"); //Imprime la Operacion multiplicaicon
			System.out.println("4 = Division de 2 numeros"); //Imprime la Operacion division
			System.out.println("5 = Ver bitácora"); //Imprime el historial de las operaciones hechas
			System.out.println("6 = Borrar bitácora "); //Borra el historial de las operaciones hechas
			System.out.println("7 = Salir"); //Cierra el programa
			System.out.print("Ingrese dato "); // Pide al usuario el ingreso por teclado de un dato numerico
				a = s.nextInt();	//Variable que permite el ingreso de datos por teclado
				x[0]=a; //Vertice que guardara la opcion que a escogido el usuario en el menu
		switch (a) //
		{
		case 1: 
		{
			System.out.println("Sumatoria");
			
			System.out.print("Ingrese primera cantidad " ) ;
				b = s.nextInt();
				x[1]=b;
			System.out.print("Ingrese segunda cantidad " ) ;
				c = s.nextInt();
				x[2]=c;
			d = b+c;
				System.out.println("El total de la suma es: " + d ) ;
				x[3]=d;
				System.out.println ("Presione una tecla numeral para desplegar el menu principal ");
				a=s.nextInt();
				break;
		}
		case 2: 
		{
			System.out.println("Resta");
			System.out.print("Ingrese primera cantidad " ) ;
				b = s.nextInt();
				x[4]=b;
			System.out.print("Ingrese segunda cantidad " ) ;
				c = s.nextInt();
				x[5]=c;
			d = b-c;
				System.out.println("El total de la resta es: " + d ) ;
				x[6]=d;
				System.out.println ("Presione una tecla numeral para desplegar el menu principal ");
				a=s.nextInt();
				break;
	}
		case 3: 
		{
			System.out.println("Multiplicacion");
			System.out.print("Ingrese primera cantidad " ) ;
				b = s.nextInt();
				x[7]=b;
			System.out.print("Ingrese segunda cantidad " ) ;
				c = s.nextInt();
				x[8]=c;
			d = b*c;
				System.out.println("El total de la multiplicacion es: " + d ) ;
				x[9]=d;
				System.out.println ("Presione una tecla numeral para desplegar el menu principal ");
				a=s.nextInt();
				break;
	}
		case 4: 
		{
			try {
				System.out.println("Division");
				System.out.print("Ingrese primera cantidad " ) ;
					b = s.nextInt();
					x[10]=b;
				System.out.print("Ingrese segunda cantidad " ) ;
					c = s.nextInt();
					x[11]=c;
				d = b/c;
					System.out.println("El total de la division es: " + d ) ;
					x[12]=d;
			} catch (ArithmeticException ramm)  {
					System.out.println("Error: Dato indefinido " + ramm.getMessage());
					System.out.println ("Presione una tecla numeral para desplegar el menu principal ");
					a=s.nextInt();
					x[13]=a;
					break;				
					} finally {
	}
	}
		case 5: 
		{
			System.out.println("Ver bitácora " );
			if(a == 5){
				System.out.println(" ");
				System.out.println("Opción: Ver Bitácora");
				System.out.println(x[1]+"+"+x[2]+"="+x[3]);
				System.out.println(x[4]+"-"+x[5]+"="+x[6]);
				System.out.println(x[7]+"*"+x[8]+"="+x[9]);
				System.out.println(x[10]+"/"+x[11]+"="+x[12]);
				a=s.nextInt();
				break;
		}}
		case 6: 
		{
			System.out.println("Eliminar bitácora " );
			System.out.println("¿Seguro de elminar la bitácora? " );
			System.out.println ("Presione una tecla numeral para desplegar el menu principal ");
			a=s.nextInt();	
			break;
				
		}
		case 7: 
		{
			System.out.println("Cierre del programa");
				break;
		}
		default:
			System.out.println ("Dato erroneo, numero escogido no se encuentra en la lista");
			System.out.println ("Presione una tecla numeral para desplegar el menu principal ");
			s.nextInt();
			break;
		}			
			}while(a!=7);
			}

}


