package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(value = 1)
public class LoggingAspect {
    private final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Around("@annotation(annotations.ToLog)")
    public Object logByAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Method will execute: " + joinPoint.getSignature().toString());
        Object returnedValue =  joinPoint.proceed();
        logger.info("Method executed");
        return returnedValue;
    }
}
