package call;

public class Audiocall implements Whatsappcall{
	public void call() {
	System.out.println("audio call is connected!");
	}
	public void mute() {
	System.out.println("audio call is muted!");
	}
	public void disconnect() {
	System.out.println("audio call is disconnected!");
	}
}
