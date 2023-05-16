package org.example.HW7;


import java.util.Arrays;
import java.util.stream.IntStream;

import static org.example.HW7.Array.arrayMass;

public class HW7 {
    public static void main(String[] args) {
        int [] a= {1, 2, 4, 5};
        int key=3;

        //передаем определенную позицию
        int index= 2;


        if (index<0 || index >=a.length){
            a=arrayMass(a,key);
            System.out.println("new array without index "+ Arrays.toString(a));


        }

        else {
            a= arrayMass(a,key, index);
            System.out.println("new array with index " + Arrays.toString(a));



        }


        
    }




}
