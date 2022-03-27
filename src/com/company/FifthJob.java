package com.company;

import java.time.Instant;
import java.time.LocalDateTime;

public class FifthJob {

    public static void returnLocalTime(){

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }
    public static void returnGlobalTime(){

        System.out.println(Instant.now());
    }
}
