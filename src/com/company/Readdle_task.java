package com.company;


public class Readdle_task {
    public static void main(String[] args) {
        String str1 = "Sunday";
        String str2 = "Saturday";
        char del = 'd';
        char ins = 'i';
        char repl = 's';
        String result = actionsMin(str1, str2, del, ins, repl);

        if (result == "") {
            System.out.println("Without changes");
        } else {
            System.out.println(result);
        }

    }

    static String actionsMin(String str1, String str2, char del, char ins, char repl) {
        String operations = "";
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    operations += repl;
                }
            }
            return operations;
        } else if (str1.length() > str2.length()) {
            int n = str1.length() - str2.length();
            int k = 1;
            for (int i = 1; i < str1.length() - n; i++) {
                if (str1.charAt(i - 1) != str2.charAt(k - 1) && str1.charAt(i) != str2.charAt(k) && n > 0) {
                    operations += del;
                    n--;
                } else if (str1.charAt(i - 1) != str2.charAt(k - 1) && str1.charAt(i) == str2.charAt(k)) {
                    operations += repl;
                    k++;
                } else if (str1.charAt(i - 1) == str2.charAt(k - 1) && str1.charAt(i) == str2.charAt(k)) {
                    k += 2;
                    i++;
                } else if (str1.charAt(i - 1) == str2.charAt(k - 1) && str1.charAt(i) != str2.charAt(k)) {
                    k++;
                } else if (str1.charAt(i - 1) != str2.charAt(k - 1) && str1.charAt(i) != str2.charAt(k) && n == 0) {
                    operations += repl;
                    operations += repl;
                    k += 2;
                    i++;
                }
            }
            if (n > 0) {
                for (int j = 0; j < n; j++) {
                    operations += del;
                }
            }
            return operations;
        } else if (str1.length() < str2.length()) {
            int n = str2.length() - str1.length();
            int k = 1;
            for (int i = 1; i < str2.length() - n; i++) {
                if (str1.charAt(k - 1) != str2.charAt(i - 1) && str1.charAt(k) != str2.charAt(i) && n > 0) {
                    operations += ins;
                    n--;
                } else if (str1.charAt(k - 1) != str2.charAt(i - 1) && str1.charAt(k) == str2.charAt(i)) {
                    operations += repl;
                    k++;
                } else if (str1.charAt(k - 1) == str2.charAt(i - 1) && str1.charAt(k) == str2.charAt(i)) {
                    k += 2;
                    i++;
                } else if (str1.charAt(k - 1) == str2.charAt(i - 1) && str1.charAt(k) != str2.charAt(i)) {
                    k++;
                } else if (str1.charAt(k - 1) != str2.charAt(i - 1) && str1.charAt(k) != str2.charAt(i) && n == 0) {
                    operations += repl;
                    operations += repl;
                    k += 2;
                    i++;
                }
            }
            if (n > 0) {
                for (int j = 0; j < n; j++) {
                    operations += ins;
                }
            }
            return operations;
        }
        return "";
    }

}



