//Has-a
public class Smartphone implements MP3Player, VideoPlayer, Phone {

	@Override
	public void play() {
		System.out.println("Smartphone: Método play()");
		
	}

	@Override
	public void pause() {
		System.out.println("Smartphone: Método pause()");
		
	}

	@Override
	public void stop() {
		System.out.println("Smartphone: Método stop()");
		
	}

	@Override
	public void call(String number) {
		System.out.println("Smartphone: Método call() - " + number);
		
	}

	@Override
	public void disconnect() {
		System.out.println("Smartphone: Método disconnect()");
		
	}

}
