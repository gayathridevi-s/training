package call;

public class Call {

	public static void main(String[] args) {
		Audiocall arun=new Audiocall();
		Videocall akshaya=new Videocall();
		arun.call();
		arun.mute();
		arun.disconnect();
		akshaya.call();
		akshaya.mute();
		akshaya.disconnect();
	}

}
