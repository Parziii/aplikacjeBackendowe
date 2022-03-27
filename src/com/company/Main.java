package com.company;


import java.io.*;
import java.util.Scanner;


import static com.company.ThirdJob.searchForNumber;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        //FirstJob
        FirstJob.getTxt();


        //SecondJob
        System.out.println("Wpisz jakiś tekst");

        Scanner input = new Scanner(System.in);
        String strToWrite = input.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/file.txt"))) {
            writer.write(strToWrite);
        } catch (IOException e) {
            System.out.println(e.toString());
        }

        //ThirdJob
        int[] arr = new int[]{4, 5, 7, 11, 12, 15, 15, 21, 40, 45};
        System.out.println(searchForNumber(arr,11));

        //

        //FifthJob
        FifthJob.returnLocalTime();
        FifthJob.returnGlobalTime();

        //SixthJob

    }
}
