package com.company;

import java.util.Scanner;

public class Main38 {
    public static void main(String[] args){
      //task 38
        Scanner ms = new Scanner(System.in);

      char[] table ={'а','б','в','г','д','о','1','2','3','4','5','6','7','8','9','-','0'};
        System.out.print("Enter symbols here - ");
        String user = ms.nextLine();
        char[] result = encrypt(table, user);

        System.out.println(result);

    }
    static char[] encrypt(char[] table, String user){
    char[] symbol = new char[user.length()];
        for (int i = 0; i < user.length(); i++) {
            for (int k = 0; k < table.length; k++) {
                if (user.charAt(i)==table[k]){
                    symbol[i]=table[(k+5)%table.length];
                }
            }
        }
        return symbol;
        }

}
