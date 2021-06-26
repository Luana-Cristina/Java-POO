
public class Main {

	public static void main(String[] args) {

		Smartphone sp = new Smartphone();
		
		sp.play();
		sp.pause();
		sp.stop();
		sp.filesize();
		
		//Chama método estático, não precisa de instância
		MP3Player.versao();
		
		sp.call("9999-9999");
		sp.disconnect();

	}

}
