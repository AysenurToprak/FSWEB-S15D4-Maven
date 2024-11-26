package org.example;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean checkForPalindrome(String text) {
        String str = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        LinkedList<Character> charList = new LinkedList<>();

        for (char c : str.toCharArray()) {
            charList.add(c);
        }
        while (charList.size() > 1) {
            if (!charList.pollFirst().equals(charList.pollLast())) {
                return false;
            }
        }

        return true;
    }


    public static String convertDecimalToBinary(int decimal){
        LinkedList<Integer> list=new LinkedList<>();

        while(decimal>0){
            int remainder=decimal%2;
            list.addFirst(remainder);
            decimal/=2;
        }
        StringBuilder stringBuilder=new StringBuilder();

        for(int digit:list){
            stringBuilder.append(digit);
        }
        return stringBuilder.toString();
    }

}