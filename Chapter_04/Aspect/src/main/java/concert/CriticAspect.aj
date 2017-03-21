package concert;

import org.aspectj.lang.annotation.AfterThrowing;

/**
 * Created by Administrator on 2017/3/17.
 */
public aspect CriticAspect{
	
	public CriticAspect(){}
	
	private CriticismEngine criticismEngine;
	
	pointcut performance() : execution(* perform(..));
	
	after() returning : performance(){
		System.out.println(criticismEngine.getCriticism());
	}
	
	public void setCriticismEngine(CriticismEngine criticismEngine){
		this.criticismEngine = criticismEngine;
	}
}
