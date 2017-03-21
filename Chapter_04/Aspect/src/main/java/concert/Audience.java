package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by Administrator on 2017/3/17.
 */
@Aspect
public class Audience{
	
	@Pointcut("execution(* concert.Performance.perform())")
	public void performance(){}
	
	@Pointcut("execution(* concert.Performance.perform(String))")
	public void performance1(){}
	
	@Around("performance()")
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
	
	@Before("performance1()")
	public void silenceCellPhones(){
		System.out.println("Silence cell phones");
	}
	
	@Before("performance1()")
	public void takeSeats(){
		System.out.println("就坐.");
	}
	
	@AfterReturning("performance1()")
	public void applause(){
		System.out.println("鼓掌 鼓掌 啪啪啪.");
	}
	
	@AfterThrowing("performance1()")
	public void demandRefund(){
		System.out.println("退票.");
	}
}

