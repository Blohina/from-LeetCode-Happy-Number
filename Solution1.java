package com.company;

public class Solution1 {
    public boolean isHappy(int n) {
        if(n==1) return true;
        /ArrayList<Integer> digits = new ArrayList<>();
        HashSet<Integer> cicleSet = new HashSet<>();
        //split n into digits
        while(n != 0) {
            digits.add(0,n%10);
            n = n/10;
        }
        int sum = 0;
        while (sum != 1) {
            for(Integer e : digits) {
                sum+= e*e;
            }
            if(cicleSet.add(sum) == false) {
                return false;
            }
            if (sum == 1) {
                return true;
            } else {
                digits.clear();
                while(sum != 0) {
                    digits.add(0,sum%10);
                    sum = sum/10;
                }
            }
        }
        return true;

    }
