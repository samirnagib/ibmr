package controller;

public class ExemploTypeCast {

	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		int c;
		
		c = a / b;
		
		System.out.println("Valor de C: "+ c);
		
		double d;
		d = a / b;
		System.out.println("Valor de D: "+ d); // conversao implicita com erros
		
		double e;
		
		e = (double) a / b; // conversao explicita
		System.out.println("Valor de E: "+ e); 

	}

}
