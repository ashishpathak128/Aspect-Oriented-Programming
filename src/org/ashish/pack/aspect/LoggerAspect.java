package org.ashish.pack.aspect;

import org.ashish.pack.model.Circle;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggerAspect {

	/* @Before("allGetters()") */
	@Around("@annotation(org.ashish.pack.aspect.Loggable)")
	public void log(ProceedingJoinPoint pjp) {
		/* System.out.println(joinPoint.toString()); */
		try {
			pjp.proceed();
			System.out.println("Around advice");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		System.out.println("After Finnally");
		
		//Circle circle = (Circle) joinPoint.getTarget();

	}

	
	  @Before("allGetters()") public void logSecond() {
	  System.out.println("Logging the imp stuff for the second time ."); }
	  
	  
	  @Pointcut("execution(* org.ashish.*.get*())")
	  public void allGetters() {}
	 
}
