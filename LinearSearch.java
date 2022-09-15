package com.rajesh;

import java.util.Locale;

public class LinearSearch {  // find a no(int) in a int array
    public static int find(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static boolean contains(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }

    public static int find(String val, char target){   // find a character in a string
        String str = val.toLowerCase();
        for(char i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(String val, char target){  //find a string presents in the given string or not
        String str = val.toLowerCase(Locale.ROOT);
        for(char i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }

    public static int[] find(int[][] arr,int target){   //to find the given element in the matrix
        for(int row =0; row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
    public static int findMax(int[][] arr){   //to find the max element in the matrix
        int Max_Value = Integer.MIN_VALUE;
        for(int row =0; row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>Max_Value){
                    Max_Value=arr[row][col];
                }
            }
        }
        return Max_Value;
    }
    public static int findMin(int[][] arr){   //to find the min element in the matrix
        int Min_Value = Integer.MAX_VALUE;
        for(int row =0; row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]<Min_Value){
                    Min_Value=arr[row][col];
                }
            }
        }
        return Min_Value;
    }



}
