package es.Studium.Longitud;
import java.util.Scanner;
public class Longitud 
{

	public static void main(String[] args)
	{
				Scanner teclado = new Scanner(System.in);
				String frase;
				int longitudConEspacios,longitudSinEspacios;
				System.out.println("indique una frase");
				frase=teclado.nextLine();
				
				longitudConEspacios=calcularLongitud(frase);
				System.out.println("Longitud "+longitudConEspacios);
				longitudSinEspacios=calcularLongitud2(frase);
				System.out.println("Longitud "+longitudSinEspacios);
				teclado.close();
				
			}
			public static int calcularLongitud(String cadena)
			{
				int resultado=0;
						//resultado=cadena.length();
				for(int i=0;i<cadena.length();i++)
					{
						resultado++;
					}
				return resultado;
			}
			public static int calcularLongitud2(String cadena)
			{
				int resultado=0;
				for(int i=0;i<cadena.length();i++)
				{
					if(cadena.charAt(i)!=' ')
					{
						resultado++;
					}
				}
				return resultado;
			}
				
		}
