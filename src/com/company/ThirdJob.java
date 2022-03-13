package com.company;

public class ThirdJob {
    public static int searchForNumber(int[] arr, int value){
        int index = 0;
        int limit = arr.length - 1;

        while(index<=limit){

            int point = (index + limit) /2;
            int entry = arr[point];

            if(value > entry){
                index = point + 1;
            }
            if (value < entry) {
                limit = point - 1;
            }
            return point; // value == entry
        }
        return -1;
    }
}
