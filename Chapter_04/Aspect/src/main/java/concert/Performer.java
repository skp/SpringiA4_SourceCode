package concert;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/3/17.
 */
@Component
public class Performer implements Performance{
	
	@Override
	public void perform(){
		System.out.println("演奏中");
	}
}
