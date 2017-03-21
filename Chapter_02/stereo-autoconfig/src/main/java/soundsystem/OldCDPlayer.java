package soundsystem;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class OldCDPlayer implements MediaPlayer{
	
	private CompactDisc cd;
	
	@Inject
	public OldCDPlayer(CompactDisc cd){
		this.cd = cd;
	}
	
	public void play(){
		cd.play();
	}
}
