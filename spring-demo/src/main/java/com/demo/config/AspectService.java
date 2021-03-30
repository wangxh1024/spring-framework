package com.demo.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectService {

	@Pointcut("execution(* com.demo.service.CalcService.*(..))")
	public void pointcut(){}

	@Before("pointcut()")
	public void before(JoinPoint joinPoint){
		System.out.println("before");
	}

	@After("pointcut()")
	public void after(JoinPoint joinPoint){
		System.out.println("after");
	}

	@AfterReturning(value = "pointcut()", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result){
		System.out.println("afterReturning result:" + result);
	}

	@AfterThrowing(value = "pointcut()", throwing = "ex")
	public void afterThrowing(Throwable ex){
		System.out.println("afterThrowing:" + ex.getMessage());
	}

}
