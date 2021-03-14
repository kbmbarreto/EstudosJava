package introJava;

// Vetor que calcula a média de temperatura dos ultimos cinco dias

public class VetorMedia {
	public static void main(String[] args) {
		
		int intDia;
		float fltMedia;
		float fltTemperatura[] = new float[5];
		byte btValor[] = new byte[10];
		
		System.out.println("Média de temperatura");
		System.out.println("");
		
		for(intDia = 0; intDia < 5; intDia++)
			fltTemperatura[intDia] = 0;
		
		try {
			for(intDia = 0; intDia < 5; intDia++) {
				System.out.println("Digite a "+(intDia+1)+"a. temperatura: ");
				System.in.read(btValor);
				String strBuffer = new String(btValor);
				String strValor = new String(strBuffer.trim());
				
				fltTemperatura[intDia] = Float.parseFloat(strValor);
				
				fltMedia = (fltTemperatura[0] + fltTemperatura[1] + fltTemperatura[2] + fltTemperatura[3] + fltTemperatura[4])/5;
				System.out.println("");
				System.out.println("A média das temperaturas é: " + fltMedia);
			}
		} catch(Exception ex) {
			System.out.println("Erro: " + ex);
		}
	}
}
