package tabuada;
import javax.swing.JOptionPane;

public class tabuada {
	public static void main(String[] args) {

		int i;

		try {
			String mult = JOptionPane.showInputDialog("Digite o numero do multiplicador: ");
			i = Integer.parseInt(mult);
			
			for (int multiplicador = 0; multiplicador <= 10; multiplicador++) {
				System.out.println(i + " x " + multiplicador + " = " + i * multiplicador);
			}	
		} catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro: " +ex);
		}
	}
}