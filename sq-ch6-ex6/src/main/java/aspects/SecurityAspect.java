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
@Order(value = 0)
public class SecurityAspect {
    private final Logger logger = LoggerFactory.getLogger(SecurityAspect.class);


    @Around("@annotation(annotations.ToLog)")
    public Object validateUser(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Method will execute: " + joinPoint.getSignature().toString());
        Object returnedValue =  joinPoint.proceed();
        logger.info("Method executed");
        return returnedValue;
    }
}
