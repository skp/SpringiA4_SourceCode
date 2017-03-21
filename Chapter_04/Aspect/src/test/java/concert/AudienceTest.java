package concert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/3/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:encoreable-config.xml")
public class AudienceTest{
	
	@Autowired
	private Performance Performer;
	
	@Test
	public void perform(){
		Performer.perform();
	}
}
