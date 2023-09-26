package main;

import multithread.MultiThread;

public class Main {
    public static void main(String[] args) {

        new Thread(new MultiThread()).start();
        new Thread(new MultiThread()).start();

    }
}
