package com.poojahshah.example.chaper.three;

public @interface MyCustomAnnotation {

    int priority() default 1;

    String[] tags() default {};
}
