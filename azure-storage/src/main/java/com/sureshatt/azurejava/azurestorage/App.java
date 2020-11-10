package com.sureshatt.azurejava.azurestorage;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        System.out.println("Azure Storage account sample");

        String connectStr = System.getenv("AZURE_STORAGE_CONNECTION_STRING");

        BlobDemo blobDemo = new BlobDemo();
        blobDemo.runDemo(connectStr);
    }


}