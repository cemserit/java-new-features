package com.cemserit.java8.java7;

import java.io.Closeable;

/**
 * Created by cemserit on 2019-06-15.
 */
public class TryWithResource {
    public static void main(String[] args) {
        try (Database database = new Database()) {
            database.connect();
            //...
        }
    }
}

class Database implements Closeable {
    void connect() {
        System.out.println("Database connected");
    }

    @Override
    public void close() {
        System.out.println("Database closed");
    }
}
