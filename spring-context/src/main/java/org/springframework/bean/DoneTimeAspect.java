package org.springframework.bean;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.DoneTime;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

/**
 * @projectName: study-demo
 * @package: com.hundsun.dubbodemo.common.aop
 * @className: DoneTimeAspect
 * @description:
 * @author: h1123
 * @createDate: 2022/5/22 16:44
 */

@Aspect
@Service
public class DoneTimeAspect {

	// @Pointcut("execution(* com.hundsun.demo.*.*(..))")
	public void point() {

	}

	@Pointcut("@annotation(doneTime)")
	public void point2(DoneTime doneTime) {

	}

	@Around(value = "point2(doneTime)")
	public Object around(ProceedingJoinPoint joinPoint, DoneTime doneTime) throws Throwable {

		// 计时器
		StopWatch stopWatch = new StopWatch();
		// 方法参数
		Object[] param = joinPoint.getArgs();

		try {
			stopWatch.start();
			return joinPoint.proceed();
		} finally {
			stopWatch.stop();
			System.out.println("this is donetimeaspect");
		}

	}
}
