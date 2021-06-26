
public interface MP3Player extends Player{

	/**
	 * M�todo est�tico, utilizado sem inst�ncia
	 */
	public static void versao() {
        System.out.println("MP3Player: Vers�o 1.0");
    }
	
	/**
	 * M�todo default, compartilhado com as classes que implementem MP3Player e sejam instanciadas
	 */
	public default void filesize() {
        System.out.println("MP3Player: M�todo filesize() para verificar tamanho do arquivo de m�dia");
    }
	
}
