package main;

public class Main {

	/**
	 * 	Problema de uma empresa de telefonia que deseja criar dois novos tipos de planos p�s-pagos para p�blicos distintos.

		Estes p�blicos est�o tendo dificuldade de encontrarem um plano com cota de transfer�ncia de dados adequada para seu uso. Estes p�blicos s�o: streamers e influencers.

		Fa�a um programa que represente o problema utilizando orienta��o a objetos (incluindo heran�a). Em seu m�todo main() voc� deve criar um plano para cada tipo de p�blico, adicionar diferentes transfer�ncias(informando o aplicativo e tamanho da transferencia em MB), e ao final imprimir a quantidade (em MB) de transfer�ncias GRATUITAS de cada usu�rio.
	 */
	public static void main(String[] args) {

		Transferencia t1 = new Transferencia();
        t1.app = "whatsapp";
        t1.tamanho = 10;
        
        Transferencia t2 = new Transferencia();
        t2.app = "youtube";
        t2.tamanho = 150;
        
        Transferencia t3 = new Transferencia();
        t3.app = "instagram";
        t3.tamanho = 25;
        
        PlanoStreamer ps = new PlanoStreamer();
        ps.transferencias.add(t1);
        ps.transferencias.add(t2);
        ps.transferencias.add(t3);
        
        System.out.println("PLANO STREAMER");
        System.out.println("Transf. gratuitas: " + ps.calculaTransferenciasGratuitas());
        
        
        PlanoInfluencer pi = new PlanoInfluencer();
        pi.transferencias.add(t1);
        pi.transferencias.add(t2);
        pi.transferencias.add(t3);
        
        System.out.println("PLANO INFLUENCER");
        System.out.println("Transf. gratuitas: " + pi.calculaTransferenciasGratuitas());
        
        
		

	}

}
