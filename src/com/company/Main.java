package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String sss = "1266666623334444";
        int count = 1;
        int bestCount = 0;
        for (int i = 0; i<sss.length();i++)
        {
            if (i>0) {
                if (sss.charAt(i) == sss.charAt(i - 1)) {
                    ++count;
                    if (bestCount < count) bestCount = count;
                } else count = 1;
            }
        }
        System.out.println("Best count is - " + bestCount);
    }
}
