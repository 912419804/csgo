package com.frank.csgo.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadUtils {

    public static ExecutorService THREAD =  Executors.newFixedThreadPool(100);
}
