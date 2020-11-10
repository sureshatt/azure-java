package com.sureshatt.azurejava.azurestorage;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.blob.models.BlobItem;

import java.io.FileWriter;
import java.io.IOException;

public class BlobDemo {

    public void runDemo(String connectionString) throws IOException {

        BlobServiceClient blobServiceClient = new BlobServiceClientBuilder().connectionString(connectionString).buildClient();
        blobServiceClient.listBlobContainers().forEach(c -> System.out.println(c.getName()));

        String containerName = "quickstartblobs" + java.util.UUID.randomUUID();
        BlobContainerClient containerClient = blobServiceClient.createBlobContainer(containerName);
        createAndUploadFile(containerClient);
        listBlobs(containerClient);
    }

    private static void listBlobs(BlobContainerClient containerClient) {
        System.out.println("\nListing blobs...");

        for (BlobItem blobItem : containerClient.listBlobs()) {
            System.out.println("\t" + blobItem.getName());
        }
    }

    private static void createAndUploadFile(BlobContainerClient containerClient) throws IOException {
        String localPath = "./data/";
        String fileName = "quickstart" + java.util.UUID.randomUUID() + ".txt";

        FileWriter writer = new FileWriter(localPath + fileName, true);
        writer.write("Hello, World!");
        writer.close();

        BlobClient blobClient = containerClient.getBlobClient(fileName);

        System.out.println("\nUploading to Blob storage as blob:\n\t" + blobClient.getBlobUrl());

        blobClient.uploadFromFile(localPath + fileName);
    }
}
