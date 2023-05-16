package org.example.HW7;



public class Array {
    public static int [] arrayMass(int [] a, int key) {
        int[] newa=new int[a.length+1];
        newa[0]=key;

        for (int i= 0;i<a.length;i++){
            newa[i+1]= a[i];
        }


        return newa;

    }
    public static int [] arrayMass(int [] a,int key, int index){
        int[] newa= new int[a.length+1];
        for (int i=0; i<index; i++){
            newa [i]= a[i];
        }
        newa[index]= key;

        for (int i= index+1;i<=a.length;i++){
            newa[i]= a[i-1];
        }
        return newa;

    }
}
