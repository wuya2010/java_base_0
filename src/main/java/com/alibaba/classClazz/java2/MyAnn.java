package com.alibaba.classClazz.java2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


//Retention:保留
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnn {

	String name() default "abc";
}
