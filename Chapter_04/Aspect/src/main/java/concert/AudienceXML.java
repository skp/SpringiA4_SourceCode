package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by Administrator on 2017/3/17.
 */
public class AudienceXML{
	
	public void watchPerformance(ProceedingJoinPoint pjp){
		silenceCellPhones();
		takeSeats();
		try{
//			pjp.proceed();
		}catch(Throwable throwable){
			demandRefund();
//			throwable.printStackTrace();
		}
		applause();
	}
	
	public void silenceCellPhones(){
		System.out.println("Silence cell phones");
	}
	
	public void takeSeats(){
		System.out.println("就坐.");
	}
	
	public void applause(){
		System.out.println("鼓掌 鼓掌 啪啪啪.");
	}
	
	public void demandRefund(){
		System.out.println("退票.");
	}
}

