package cn.tac.test.easydev.v23.feature.argvalid;


import cn.tac.framework.easydev.core.exception.biz.ArgumentsValidatingException;
import cn.tac.framework.easydev.web.argsvalid.ErrorsHandler;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

/**
 * @author tac
 * @since 21/09/2017
 */
@Aspect
@Component
public class ValidatingAdvisor {
    @Autowired
    private ErrorsHandler errorsHandler;

    @Pointcut("execution(* cn.tac.test.easydev.v23.controller..*.*(..))")
    public void pointcut() {
    }

    @Around("pointcut()")
    public Object aroundPerform(ProceedingJoinPoint point) throws Throwable {
        for (Object arg : point.getArgs()) {
            if (arg instanceof Errors) {
                Errors errors = (Errors) arg;
                String msg = errorsHandler.extractMsg(errors);
                throw new ArgumentsValidatingException(msg);
            }
        }
        return point.proceed();
    }
}
