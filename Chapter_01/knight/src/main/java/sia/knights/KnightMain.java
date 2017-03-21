package sia.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain{
	
	public static void main(String[] args) throws Exception{
//		System.out.println(System.getProperties());
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}
}
