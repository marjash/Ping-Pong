package com.knubisoft;

import lombok.SneakyThrows;

public class Main {

    public static final Object MONITOR = new Object();

    public static void main(String[] args) {
        Object MONITOR = new Object();
        Thread ping = new Thread(new PingPong(MONITOR, "ping"));
        Thread pong = new Thread(new PingPong(MONITOR, "pong"));
        ping.start();
        pong.start();
    }
}


