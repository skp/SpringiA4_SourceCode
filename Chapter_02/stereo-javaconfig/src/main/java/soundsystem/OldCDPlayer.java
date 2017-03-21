package soundsystem;

public class OldCDPlayer implements MediaPlayer{
	
	private CompactDisc cd;
	
	public OldCDPlayer(CompactDisc cd){
		this.cd = cd;
	}
	
	public void play(){
		cd.play();
	}
}
