package com.bridgelabz.generics;

public class Generics<T extends Comparable<T>> {

    //Method To Compare Values
    public T getMax(T str1, T str2, T str3) {
        T max = str1;
        if (str2.compareTo(max) > 0)
            max = str2;
        if (str3.compareTo(max) > 0)
            max = str3;
        return max;
    }

    public static void main(String[] args) {
        //Create Object
        Generics generics = new Generics();

        //Integer Type values
        Integer num1 = 4;
        Integer num2 = 6;
        Integer num3 = 2;
        int maxNumberInt = (int) generics.getMax(num1, num2, num3);
        System.out.println("Maximum Integer Number is " + maxNumberInt);

        //Float Type Values
        Float number1 = 4.5f;
        Float number2 = 3.5f;
        Float number3 = 5.6f;
        float maxNumberFloat = (float) generics.getMax(number1, number2, number3);
        System.out.println("Maximum Float Number is " + maxNumberFloat);

        //Strings Type Values
        String str1 = "Apple";
        String str2 = "Peach";
        String str3 = "Banana";
        String maxString = (String) generics.getMax(str1, str2, str3);
        System.out.println("Maximum String is " + maxString);
    }
}
