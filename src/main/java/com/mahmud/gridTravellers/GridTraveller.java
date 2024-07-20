package com.mahmud.gridTravellers;

public class GridTraveller {
    public static double travel(int m, int n){
        if (m==1 && n==1) return 1;
        if (m==0 || n==0) return 0;
        return travel(m-1,n) + travel(m,n-1);
    }
    public static void main(String[] args) {
        System.out.println(travel(1,1));
        System.out.println(travel(2,3));
        System.out.println(travel(3,2));
        System.out.println(travel(3,3));
        System.out.println(travel(18,18));
    }
}
