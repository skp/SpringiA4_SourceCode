package concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Administrator on 2017/3/17.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig{
	
	@Bean
	public Audience audience(){
		return new Audience();
	}
}

