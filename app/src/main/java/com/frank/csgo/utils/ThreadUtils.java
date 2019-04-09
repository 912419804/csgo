package com.frank.csgo.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadUtils {

    public static ExecutorService THREAD =  Executors.newFixedThreadPool(4);
}
