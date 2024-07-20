package com.mahmud.gridTravellers;

import java.util.HashMap;
import java.util.Map;

public class GridTraveller {
    public static double travel(int m, int n){
        if (m==1 && n==1) return 1;
        if (m==0 || n==0) return 0;
        return travel(m-1,n) + travel(m,n-1);
    }

    public static double travelDp (int m, int n, Map<Map<Integer,Integer>,Double> memo) {
        if (m==1 && n==1) return 1;
        if (m==0 || n==0) return 0;
        Map<Integer,Integer> key = new HashMap<>();
        key.put(m,n);
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        memo.put(key, travelDp(m-1,n,memo) + travelDp(m,n-1,memo) );
        return memo.get(key);
    }

    public static void main(String[] args) {
//        System.out.println(travel(1,1));
//        System.out.println(travel(2,3));
//        System.out.println(travel(3,2));
//        System.out.println(travel(3,3));
//        System.out.println(travel(18,18));
        Map<Map<Integer,Integer>,Double> memo = new HashMap<>();

        System.out.println(travelDp(2,3, memo));
        System.out.println(travelDp(2,3, memo));
        System.out.println(travelDp(3,2, memo));
        System.out.println(travelDp(3,3, memo));
        System.out.println(travelDp(18,18, memo));
    }
}
