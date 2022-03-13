package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FirstJob {


    public static void getTxt() throws FileNotFoundException {

        FileInputStream input = new FileInputStream("inputSomething.txt");
        try(input){

            int data = input.read();

            while (data != -1){
                System.out.print((char)data);
                data = input.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
