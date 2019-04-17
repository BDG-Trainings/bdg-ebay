package com.bdg.bdgebay;

import org.springframework.stereotype.Component;

/**
 * @author William Arustamyan
 */

@Component
public class RandomIntGenerator {

    @RandomNumber(max = 1000, min = 100)
    private int number;

    public int getNumber() {
        return this.number;
    }
}
