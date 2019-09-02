package controller;


//import java.util.Locale;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {

		double vrx, acc, fin;

		//Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com o valor da Xerox:");
		vrx = ler.nextDouble();
		acc = 1;
		ler.close();
		
		for ( int a = 1 ; a <= 20; a++) {
			for ( int b = 1; b <= 10; b++) {
				fin = vrx * acc;
				System.out.print(" | ");
				System.out.printf("%.2f", acc);
				System.out.print(" = ");
				System.out.printf("%.2f",fin);
				System.out.print(" ");
				
				//System.out.print(" "+ df.format(acc) + " = " + df.format(fin));
				acc = acc+1;
			} // fim b
			System.out.println(" " );
			
		}//fim a

	}

}
