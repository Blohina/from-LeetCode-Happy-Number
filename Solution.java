package com.company;
import java.util.*;

public class Solution {
    public static  boolean isHappy(int n) {
        HashSet<Integer> cicleSet = new HashSet<>(); // повтор суммы, значит зациклилось
        //split n into digits
        int sum = 0;
        int lastDigit;
        while(n != 0) {
            lastDigit = n%10;
            sum+= lastDigit*lastDigit;
            n = n/10;
        }
        if (sum == 1) {
            return true;
        }
        while (sum != 1) {
            if(cicleSet.add(sum) == false) {
                return false;
            }
            n = sum;
            sum = 0;
            while(n != 0) {
                lastDigit = n%10;
                sum+= lastDigit*lastDigit;
                n = n/10;
            }
        }
        return true;
    }
}
