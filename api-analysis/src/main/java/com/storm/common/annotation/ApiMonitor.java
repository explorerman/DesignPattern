package com.storm.common.annotation;

import java.lang.annotation.*;


@Target({ElementType.METHOD}) //声明自定义的注解使用在方法上
@Retention(RetentionPolicy.RUNTIME)//注解不仅被保存到class文件中，jvm加载class文件之后，仍然存在
@Documented
public @interface ApiMonitor {
    String apiName() default "";

    String time() default "";

}
