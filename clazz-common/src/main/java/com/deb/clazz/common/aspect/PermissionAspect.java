package com.deb.clazz.common.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Description
 * @Author Deb
 * @Date 2021/3/20 12:53
 * @ProjectName clazz
 **/
@Aspect
public class PermissionAspect {


    /**
     * 设置切入点
     */
    @Pointcut("@annotation(com.deb.clazz.common.annotation.RequirePermission)")
    public void putCut() {

    }

    /**
     * 设置环绕通知
     */
    @Around("putCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        return point.proceed();
    }


    @AfterThrowing(pointcut = "putCut()", throwing = "throwable")
    public void afterThrowing(JoinPoint point, Throwable throwable) {

    }

}
