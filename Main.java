package com.rajesh;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
      /*  int[] arr = {5,9,3,7,1,6,8,2};
        System.out.println(LinearSearch.find(arr,0));
        System.out.println(LinearSearch.contains(arr,8));

        String name = "Rajesh";
        System.out.println(LinearSearch.find(name,'r'));
        System.out.println(LinearSearch.contains(name,'h'));

        int[][] twoDarr = {
                {9,2,4},
                {1,6,7},
                {5,3,11}
        };
        System.out.println(Arrays.toString(LinearSearch.find(twoDarr,7)));
        System.out.println(LinearSearch.findMax(twoDarr));
        System.out.println(LinearSearch.findMin(twoDarr));



        int[] arr1 ={1,3,5,6,10,12,15,20,21,28};
        int[] arr2 ={29,28,27,26,15,14,13,12,11,1,6};
        System.out.println(BinarySearch.search(arr1,21));
        System.out.println(BinarySearch.search(arr2,1));*/

        int[] arr ={1,3,5,6};
//        int start = 0;
//        int end = arr.length-1;
//        int mid = (start+end)/2;
//        System.out.println(mid);
        System.out.println(BinarySearch.search(arr,5));
        System.out.println(BinarySearch.search(arr,2));
        System.out.println(BinarySearch.search(arr,7));
        System.out.println(BinarySearch.insertpostion(arr,7));







    }
}
