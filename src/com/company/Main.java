package com.company;

public class Main {
    public static void main(String[] args) {
        returnBool(10);
        printBool(10,20);
        printSistem(10);
        forSistem(100);
        boolSwitch(10);
	// write your code here
    }
    public static boolean printBool(int b, int n) {
        if (b + n >= 10 && b + n <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void printSistem(int a){
        if(a>=0){
            System.out.println("Положительное");
        }
        else{
            System.out.println("Отрицательное");
        }

    }
    public static boolean returnBool(int c) {
        if (c<0) {
            return true;
        } else {
            return false;
        }
    }
    public static void forSistem(int p){
        String string;
        for (int i=p; i>0; i--){
            System.out.println("string");
        }

    }
    private static void boolSwitch(int v){
        switch(v){
            case 4:
            case 8:
            case 12:
            case 16:
            case 20:
            case 24:
            case 28:
            case 32:
            case 36:
            case 40:
            case 44:
            case 48:
            case 52:
            case 56:
            case 60:
            case 64:
            case 68:
            case 72:
            case 76:
            case 80:
            case 84:
            case 88:
            case 92:
            case 96:
            case 400:
            System.out.println("Високосный год");
            break;
            default:
                System.out.println("Невисокосный год");

        }
    }
}
