package soundsystem;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoundSystemConfig.class)
public class TrackCounterTest{
	
	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	
	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private TrackCounter trackCounter;
	
	@Test
	public void testTrackCount(){
		cd.playTrack(1);
		cd.playTrack(2);
		cd.playTrack(3);
		cd.playTrack(3);
		cd.playTrack(7);
		cd.playTrack(7);
		cd.playTrack(7);
		
		assertEquals(1, trackCounter.getPlayCount(1));
		assertEquals(1, trackCounter.getPlayCount(2));
		assertEquals(2, trackCounter.getPlayCount(3));
		assertEquals(0, trackCounter.getPlayCount(4));
		assertEquals(3, trackCounter.getPlayCount(7));
	}
}
