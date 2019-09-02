package controller;

import util.Teclado;

/*
 * Um atleta ol�mpico corre em uma pista circular. Escreva um
programa que leia o raio da pista e a dist�ncia percorrida pelo atleta
e imprima na tela a quantidade de voltas que esse atleta percorreu
(esta quantidade pode ser decimal, por exemplo, 2,4 voltas).
 */
public class Questao01 {

	public static void main(String[] args) {
		double r1;
		double distancia;
		double voltas;
		double pista;
		
		
		
		r1 = Teclado.lerDouble("Entre com o valor do raio da pista:");
		distancia = Teclado.lerDouble("Entre com a distancia percorrida pelo atleta:");
		pista = circulo(r1);
		
		voltas = (pista / distancia);
		
		System.out.print("O atleta deu ");
		System.out.printf("%.2f", voltas);
		System.out.print(" voltas.");
		
		
		
		

	}
	
	public static double circulo (double raio) {
		double pi = 3.14;
		
		return pi * (raio * raio);
	}

}
