package com.bdg.bdgebay;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author William Arustamyan
 */


@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RandomNumber {

    int max();

    int min();
}
