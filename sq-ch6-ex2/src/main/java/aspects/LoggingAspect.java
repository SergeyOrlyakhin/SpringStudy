package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.slf4j.simple.SimpleLoggerFactory;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {
    private final Logger logger = new SimpleLoggerFactory().getLogger(LoggingAspect.class.getSimpleName());

    @Around("execution(* services.*.*(..))")
    public Boolean log(ProceedingJoinPoint joinPoint) throws Throwable {
        var signature = joinPoint.getSignature().getName();
        var objects = joinPoint.getArgs();

        logger.info("Method will execute: " + joinPoint.getSignature().toString());
        logger.info("With parameters: " + Arrays.asList(objects));
        var result = (Boolean) joinPoint.proceed();
        logger.info("Method executed and return: " + result);
        return !result;
    }

}
