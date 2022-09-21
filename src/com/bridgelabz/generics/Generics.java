package com.bridgelabz.generics;

public class Generics {
    public float maximumFloat(Float num1, Float num2, Float num3) {
        float max = num1;
        if (num2.compareTo(max) > 0)
            max = num2;
        if (num3.compareTo(max) > 0)
            max = num3;
        return max;
    }

    public static void main(String[] args) {
        float num1 = 4.5f;
        float num2 = 3.5f;
        float num3 = 5.6f;

        Generics generics = new Generics();
        float maxNumber = generics.maximumFloat(num1, num2, num3);
        System.out.println("Maximum Number is " + maxNumber);
    }
}
