package exercicios;


import java.util.ArrayList;

import util.Teclado;

public class ReajusteFuncionarios {

	public static void main(String[] args) {
		
		String nome = "";
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Integer> cargos = new ArrayList<Integer>();
		ArrayList<Double> salarios = new ArrayList<Double>();
		
		while(true) {
			nome = Teclado.lerTexto("Digite um nome de um funcionario:");
			if (nome.equals("fim"))break;
			nomes.add(nome);
						
			Integer cargo = Teclado.lerInt("Digite o codigo do cargo de "+ nome);
			cargos.add(cargo);
			
			double salario = Teclado.lerDouble("Digite o salario de " + nome +" R$ ");
			salarios.add(salario);
			
			
		}
		System.out.println("Salarios reajustados");
		for (int i = 0; i < nomes.size(); i++) {
			double salario = salarios.get(i);
			if(cargos.get(i) == 1 ) {
				salario += salario*0.05;
				
			}
			else if (cargos.get(i) == 2 ) {
				salario += salario*0.1;
			
			}
			else if (cargos.get(i) == 3 ) {
				salario += salario*0.2;
			
			}
			
			
			System.out.println(nomes.get(i) + " - R$ " + salario);

		}
		

	}

}
