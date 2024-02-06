package application;

import java.util.Locale;
import java.util.Scanner;

import entities.triangulo;


public class Program {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner (System.in); 
			
			 triangulo x, y;
			  x = new triangulo();
			  y = new triangulo();
			
			 System.out.println("Informe a área do primeiro triângulo: "); 
			 x.A = sc.nextDouble();
			 x.B = sc.nextDouble();
			 x.C = sc.nextDouble();
			 System.out.println("Informe a área do segundo triângulo: ");
			 y.A = sc.nextDouble();
			 y.B = sc.nextDouble();
			 y.C = sc.nextDouble();
			 
			  double areax = x.area();
			  double areay = y.area();
			  System.out.printf("area x: %.4f%n", areax);
			  System.out.printf("area y: %.4f%n", areay);
			  if (areax > areay)
				  System.out.println("o triangulo x é maior");
			  else
				 System.out.println("o triangulo y é maior"); 
			  
			sc.close();
	}

}
