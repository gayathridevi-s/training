package call;

public class Videocall implements Whatsappcall{
	public void call() {
	System.out.println("Videocall is connected!");
	}
	public void mute() {
	System.out.println("videocall is muted!");
	}
	public void disconnect() {
	System.out.println("video call is disconnected");
	}
}
