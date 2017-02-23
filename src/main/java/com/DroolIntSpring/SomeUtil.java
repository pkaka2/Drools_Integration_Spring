package com.DroolIntSpring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author Pradeep Chandra
 *
 */
public final class SomeUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(SomeUtil.class);

    private SomeUtil(){
        throw new UnsupportedOperationException("SomeUtil is a utility class that should not be instantiated");
    }

    public static String replaceAWithB(String input){
        LOGGER.debug("Executing some logic");
        return input.toLowerCase().replaceAll("a", "b");
    }

}