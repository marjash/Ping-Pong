package com.knubisoft;

import lombok.SneakyThrows;

public class PingPong implements Runnable {
    final Object MONITOR;
    String name;

    public PingPong(Object MONITOR, String name) {
        this.MONITOR = MONITOR;
        this.name = name;
    }

    @SneakyThrows
    @Override
    public void run() {
        synchronized (MONITOR) {
            while (true) {
                System.out.println(name);
                Thread.sleep(500);
                MONITOR.notify();
                MONITOR.wait(500);
            }
        }
    }
}

