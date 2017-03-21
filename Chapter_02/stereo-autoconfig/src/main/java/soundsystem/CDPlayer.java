package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
@Primary
public class CDPlayer implements MediaPlayer{
	
	private CompactDisc cd;
	
	@Autowired
	public CDPlayer(CompactDisc cd){
		this.cd = cd;
	}
	
	public void play(){
		cd.play();
	}
}
