package controller;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		double nota, notaacc, notaalta, media;
		int qtd, aprovado;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Entre com a quantidade de alunos:");
		qtd = leitor.nextInt();
		notaalta = 0;
		notaacc = 0;
		aprovado = 0;
		media = 0;
		
		for (int i = 1; i <= qtd; i++) {
			System.out.println("Entre com a nota do aluno "+ i + " :");
			nota = leitor.nextDouble();
			notaacc = notaacc + nota;
			if (nota > notaalta) {
				notaalta = nota;
			}
			if (nota >= 7) {
				aprovado = aprovado + 1;
			}
			
		}
		media = notaacc / qtd;
		
		leitor.close();
		
		System.out.println("A media da turma foi :" + media);
		System.out.println("A nota mais alta foi :"+ notaalta);
		System.out.println("A quantidade de alunos aprovados:" + aprovado);

	}

}
