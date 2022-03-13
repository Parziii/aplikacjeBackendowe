package com.company;

import java.io.FileNotFoundException;

import static com.company.ThirdJob.searchForNumber;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        int[] arr = new int[]{4, 5, 7, 11, 12, 15, 15, 21, 40, 45};
        System.out.println(searchForNumber(arr,11));

        FirstJob.getTxt();
    }
}
