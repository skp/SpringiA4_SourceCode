package soundsystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CDPlayerConfig {
  
  @Bean
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }
  
  @Bean
  public MediaPlayer cdPlayer(CompactDisc compactDisc) {
    return new CDPlayer(compactDisc);
  }
  
  @Bean
  @Primary
  public MediaPlayer oldCdPlayer(CompactDisc compactDisc) {
    return new OldCDPlayer(compactDisc);
  }

}
