package introJava;

import javax.swing.JOptionPane;

public class Switch {

	public static void main(String[] args) {
		
		String strMes;
		int intMes;
		
		try {
			
			strMes = JOptionPane.showInputDialog("Digite o numero do m�s (1 a 12): ");
			intMes = Integer.parseInt(strMes);
			
			switch (intMes) {
			case 1: strMes = "Janeiro";
			break;
			case 2: strMes = "Fevereiro";
			break;
			case 3: strMes = "Mar�o";
			break;
			case 4: strMes = "Abril";
			break;
			case 5: strMes = "Maio";
			break;
			case 6: strMes = "Junho";
			break;
			case 7: strMes = "Julho";
			break;
			case 8: strMes = "Agosto";
			break;
			case 9: strMes = "Setembro";
			break;
			case 10: strMes = "Outubro";
			break;
			case 11: strMes = "Novembro";
			break;
			case 12: strMes = "Dezembro";
			break;
			default:
				strMes = "desconhecido";
			}
			
			JOptionPane.showMessageDialog(null, "O m�s � " + strMes, "Informa��o", JOptionPane.INFORMATION_MESSAGE);
			
		} catch(Exception ex) {
			System.out.println("Erro de execu��o: " + ex);
		}
	}

}
