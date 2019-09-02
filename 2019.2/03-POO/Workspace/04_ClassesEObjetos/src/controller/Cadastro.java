package controller;

import model.Carro;
import model.Funcionario;
import model.Livro;

public class Cadastro {

	public static void main(String[] args) {

		Carro gol = new Carro();
		Carro uno = new Carro();
		Carro versa = new Carro();

		gol.fabricante = "VW";
		gol.modelo = "Gol 1.6 Turbo";
		gol.cor = "Vermelho";
		gol.ano = 2017;
		
		uno.fabricante = "FIAT";
		uno.modelo = "Uno Mille";
		uno.cor = "Prata";
		uno.ano = 2010;

		versa.fabricante = "NISSAN";
		versa.modelo = "Versa SV 1.6 CVT";
		versa.cor = "Branca";
		versa.ano = 2019;

		
		System.out.println("--- CARRO 1:");		
		System.out.println("Fabricante: " 
				+ gol.fabricante 
				+ "\nModelo....: " + gol.modelo
				+ "\nCor.......: " + gol.cor
				+ "\nAno.......: " + gol.ano);

		System.out.println("--- CARRO 2:");		
		System.out.println("Fabricante: " 
				+ uno.fabricante 
				+ "\nModelo....: " + uno.modelo
				+ "\nCor.......: " + uno.cor
				+ "\nAno.......: " + uno.ano);

		System.out.println("--- CARRO 3:");		
		System.out.println("Fabricante: " 
				+ versa.fabricante 
				+ "\nModelo: " + versa.modelo
				+ "\nCor: " + versa.cor
				+ "\nAno: " + versa.ano);

		
		System.out.println(" ");


		Funcionario pedro = new Funcionario();
		Funcionario maria = new Funcionario();
		Funcionario joao = new Funcionario();
		
		pedro.matricula = 123;
		pedro.nome = "Pedro Coelho";
		pedro.cpf = "111.111.111-11";
		
		maria.matricula = 456;
		maria.nome = "Maria Josefina";
		maria.cpf = "222.222.222-22";
		
		joao.matricula = 789;
		joao.nome = "Jo�o da Silva";
		joao.cpf = "333.333.333-22";
		
		System.out.println("--- FUNCIONARIOS:");
		
		System.out.println("Matricula: " + pedro.matricula);
		System.out.println("Nome.....: " + pedro.nome);
		System.out.println("CPF......: " + pedro.cpf);
				
		System.out.println("----------------");
		
		System.out.println("Matricula: " + maria.matricula);
		System.out.println("Nome.....: " + maria.nome);
		System.out.println("CPF......: " + maria.cpf);
				
		System.out.println("----------------");
		
		System.out.println("Matricula: " + joao.matricula);
		System.out.println("Nome.....: " + joao.nome);
		System.out.println("CPF......: " + joao.cpf);
				
		System.out.println("----------------");
		
		System.out.println(" ");
		
		Livro lv1 = new Livro ();
		Livro lv2 = new Livro ();
		Livro lv3 = new Livro ();
		
		lv1.isbn = 97885;
		lv1.nome = "O PEQUENO PRINCIPE";
		lv1.autor = "Antoine de Saint-Exup�ry";
		lv1.editora = "Reynal & Hitchcock, Gallimard";
		
		lv2.isbn = 85805;
		lv2.nome = "Fundamentos de Circuitos El�tricos - 5� Ed. 2013";
		lv2.autor = "Alexander,Charles, Sadiku,Matthew N. O.";
		lv2.editora = "AMGH";
		
		lv3.isbn = 85352;
		lv3.nome = "Introdu��o a sistemas de bancos de dados";
		lv3.autor = "C. J. Date";
		lv3.editora = "Elsevier";

		System.out.println("--- LIVROS:");
		
		System.out.println("ISBN.....: " + lv1.isbn);
		System.out.println("Nome.....: " + lv1.nome);
		System.out.println("Autor.. .: " + lv1.autor);
		System.out.println("Editora .: " + lv1.editora);
				
		System.out.println("----------------");

		System.out.println("ISBN.....: " + lv2.isbn);
		System.out.println("Nome.....: " + lv2.nome);
		System.out.println("Autor.. .: " + lv2.autor);
		System.out.println("Editora .: " + lv2.editora);
				
		System.out.println("----------------");
		
		System.out.println("ISBN.....: " + lv3.isbn);
		System.out.println("Nome.....: " + lv3.nome);
		System.out.println("Autor.. .: " + lv3.autor);
		System.out.println("Editora .: " + lv3.editora);
				
		System.out.println("----------------");
		

		
	}

}