
public interface MP3Player extends Player{

	/**
	 * Método estático, utilizado sem instância
	 */
	public static void versao() {
        System.out.println("MP3Player: Versão 1.0");
    }
	
	/**
	 * Método default, compartilhado com as classes que implementem MP3Player e sejam instanciadas
	 */
	public default void filesize() {
        System.out.println("MP3Player: Método filesize() para verificar tamanho do arquivo de mídia");
    }
	
}
