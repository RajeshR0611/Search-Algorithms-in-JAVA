package com.rajesh;

public class BinarySearch { //order agnostic binary search
    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean asec = false;
        if(arr[start] < arr[end]){
            asec=true;
        }
        while(start<=end){
            int mid = (start+end)/2;
            if(asec){                       //ascending ordered array
                if(target>arr[mid]){        //focus on right
                    start = mid+1;
                }else if(target<arr[mid]){  //focus on left
                    end=mid-1;
                }else
                    return mid;
            }else{                         //descending ordered array
                if(target>arr[mid]){       //focus on left
                    end = mid-1;
                }else if(target<arr[mid]){ //focus on right
                    start=mid+1;
                }else
                    return mid;
            }


        }
        return -1;                  //element not present

    }

    public static int insertpostion(int[] arr, int target){  // return the postion where the new element need to inserted
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > arr[mid]) {        //focus on right
                start = mid + 1;
            } else if (target < arr[mid]) {  //focus on left
                end = mid - 1;
            } else {
                return mid;
            }

        }
        if (start == end) {
            if (target > start) {
                return start+1 ;
            }
        }
        return start ;
    }

}
