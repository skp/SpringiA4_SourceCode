package concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.context.annotation.Bean;

/**
 * Created by Administrator on 2017/3/17.
 */
@Aspect
public class EncoreableIntroducer{
	
	@DeclareParents(value = "concert.Performance+", defaultImpl = DefaultEncoreable.class)
	public static Encoreable encoreable;
}
