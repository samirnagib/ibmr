package controller;

public class Exemplo {

	public static void main(String[] args) {
		String txt;
		javax.swing.JOptionPane.showMessageDialog(null, "BIBLIOTECA", "Exemplo GUI", 1);
		
		javax.swing.JOptionPane.showConfirmDialog(null, "Quer aumento de salário?", "Salário", javax.swing.JOptionPane.YES_NO_OPTION);
		
		txt = javax.swing.JOptionPane.showInputDialog("Entre com o texto:");
		
		System.out.println(txt.toUpperCase());

	}

}
