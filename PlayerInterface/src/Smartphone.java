//Has-a
public class Smartphone implements MP3Player, VideoPlayer, Phone {

	@Override
	public void play() {
		System.out.println("Smartphone: M�todo play()");
		
	}

	@Override
	public void pause() {
		System.out.println("Smartphone: M�todo pause()");
		
	}

	@Override
	public void stop() {
		System.out.println("Smartphone: M�todo stop()");
		
	}

	@Override
	public void call(String number) {
		System.out.println("Smartphone: M�todo call() - " + number);
		
	}

	@Override
	public void disconnect() {
		System.out.println("Smartphone: M�todo disconnect()");
		
	}

}
