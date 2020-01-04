package com.company;

import Some.Some;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String sss = "11222333345555566666611111111111111";
        LinkedList<Some> lst  = new LinkedList<Some>();
        boolean checked;
        for (int i = 0; i<sss.length();i++)
        {
            checked = false;
            for (Some some:lst)
            {
                if (some.value==sss.charAt(i))
                {
                    ++some.count;
                    checked = true;
                }
            }
            if (!checked)
                lst.add(new Some(sss.charAt(i)));
        }

        if (!lst.isEmpty()) {
            char bestOfTheBest = ' ';
            int bestCount=0;
            for (Some some:lst)
            {
                if (bestCount<some.count) {
                    bestCount = some.count;
                    bestOfTheBest = some.value;
                }
            }
            System.out.println("Best symbol is - "+String.valueOf(bestOfTheBest)+". It's count is - " + bestCount);
        }

    }
}
