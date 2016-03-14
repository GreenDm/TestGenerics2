package com.epam;

/**
 * Created by m18 on 14.03.2016.
 */
public class MyTestMethod {

    public static <T extends Comparable>int calcNum(T[] arr,T elem){
        int count = 0;
        for(T arrayElement: arr){
            if (arrayElement.compareTo(elem)>0){
                count++;
            }

        }
return count;

    }
}
