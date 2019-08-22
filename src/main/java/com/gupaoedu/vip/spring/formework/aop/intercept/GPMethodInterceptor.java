package com.gupaoedu.vip.spring.formework.aop.intercept;

/**
 * Created by yzy
 */
public interface GPMethodInterceptor {
    Object invoke(GPMethodInvocation invocation) throws Throwable;
}
