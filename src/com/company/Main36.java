package com.company;

public class Main36 {
    public static void main(String[] args){
        //task 36
        String name = "Vadim Zadorozhnyuk";
        System.out.println(name);
        symbol(name);
        System.out.println();
        System.out.println(number(name));

    }
    static int number(String name){
        int sum=0;

        for(int i=0;i<name.length();i++){
            if(name.charAt(i)!=' '){
                sum+=name.charAt(i);
            }
        }
        return sum;
    }
    static void symbol(String name){
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)!=' '){
                System.out.print((int)name.charAt(i)+", ");
            }
        }
    }
}

