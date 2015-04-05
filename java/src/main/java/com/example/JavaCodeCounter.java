package com.example;

import org.apache.commons.lang3.StringUtils;

public class JavaCodeCounter
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public int count(String validJavaSource) {

        if (StringUtils.isEmpty(validJavaSource) || isWhitespace(validJavaSource)) {
            return 0;
        }

        return 1;
    }

    private boolean isWhitespace(String javaSource) {
        return javaSource.trim().isEmpty();
    }
}
