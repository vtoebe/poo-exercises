package com.vtoebe.even_numbers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /**
         * Escreva um programa que carregue dois valores A e B pelo teclado e imprima todos os números
         * ímpares entre A e B.
         */

        List<Integer> evenNumbers = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNum = scan.nextInt();

        System.out.print("Enter the second number: ");
        int secondNum = scan.nextInt();

        System.out.printf("Even numbers between %d and %d: ", firstNum, secondNum);

        for (int i = firstNum +1; i < secondNum; i += 1){
            if (i%2 != 0){
                evenNumbers.add(i);
            }
        }

        System.out.println(evenNumbers);
    }
}
