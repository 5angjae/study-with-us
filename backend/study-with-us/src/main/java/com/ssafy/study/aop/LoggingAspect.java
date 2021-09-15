package com.ssafy.study.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    // com.ssafy.study.api 밑에 있는 모든 클래스의 메서드에 실행 이전에 이 aspect를 적용하겠다!
    @Before(value="execution(* com.ssafy.study.api..*.*(..))")
    public void loggin(JoinPoint jp){
        logger.debug("메서드 선언부 : {} 전달 파라미터 : {}", jp.getSignature(), Arrays.toString(jp.getArgs()));
    }
}
