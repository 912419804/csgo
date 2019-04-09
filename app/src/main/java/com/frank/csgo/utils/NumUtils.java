package com.frank.csgo.utils;

import java.util.Random;

public class NumUtils {
    private static Random random = new Random();
    public static String getRandom(int min, int max){
        int s = random.nextInt(max) % (max - min + 1) + min;
        return String.valueOf(s);
    }
}
