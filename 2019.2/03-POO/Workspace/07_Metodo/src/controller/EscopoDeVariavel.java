package controller;

public class EscopoDeVariavel {
	
	static int x = 1; //variavel global

	public static void main(String[] args) {
		int x = 5;
		System.out.println("x no inicio do main() é " + x);
		metodoA();
		metodoB();
		metodoA();
		metodoB();
		metodoB(x);

	} // fim do main()
	
	public static void metodoA() {
		int x = 25;
		System.out.println("Variavel local x ao entrar no metodoA é " + x);
		x = x + 1;
		System.out.println("Variavel local x ao sair no metodoA é " + x);
		
	} //fim do metodoA
	
	public static void metodoB() {
		System.out.println("Variavel local x ao entrar no metodoB é " + x + " global.");
		x = x * 10;
		System.out.println("Variavel local x ao sair no metodoB é " + x);
		
	} //fim do metodoB
	
	public static void metodoB(int x) {
		System.out.println("Variavel local x ao entrar no metodoB é " + x + " global.");
		x = x * 10;
		System.out.println("Variavel local x ao sair no metodoB é " + x);
		
	} //fim do metodoB(x)

} //fim da classe
