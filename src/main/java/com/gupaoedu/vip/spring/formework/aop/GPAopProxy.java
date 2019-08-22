package com.gupaoedu.vip.spring.formework.aop;

/**
 * Created by yzy.
 */
public interface GPAopProxy {


    Object getProxy();


    Object getProxy(ClassLoader classLoader);
}
