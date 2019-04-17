package com.bdg.bdgebay;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Random;

/**
 * @author William Arustamyan
 */

@Configuration
public class RandomNumberAnnotationProcessor implements BeanPostProcessor {


    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {


        if (bean instanceof RandomIntGenerator) {
            for (Field field : bean.getClass().getDeclaredFields()) {
                for (Annotation annotation : field.getAnnotations()) {
                    if (annotation instanceof RandomNumber) {

                        field.setAccessible(true);
                        try {

                            int max = ((RandomNumber) annotation).max();
                            int min = ((RandomNumber) annotation).min();


                            field.setInt(bean, new Random().nextInt(max) - new Random().nextInt(min));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        System.out.println("ann : " + annotation);
                    }
                }
            }

        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
