package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@Import({CDPlayerConfig.class})
@EnableAspectJAutoProxy
@ImportResource("classpath:soundsystem-config.xml")
public class SoundSystemConfig{
	
	@Bean
	public TrackCounter trackCounter(){
		return new TrackCounter();
	}
}
