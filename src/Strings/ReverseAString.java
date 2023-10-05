package Strings;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String a = scanner.nextLine();
        char[] array1 = a.toCharArray();
        System.out.println("input array : "+ new String(array1));
        char[] newarray = new char[array1.length];
        
        for (int i = 0; i < array1.length; i++) {
            char temp = array1[i];
            newarray[array1.length - 1 - i] = temp;
        }
        
    }
}
