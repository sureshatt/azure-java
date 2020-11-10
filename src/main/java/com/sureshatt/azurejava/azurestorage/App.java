package com.sureshatt.azurejava.azurestorage;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.blob.models.BlobItem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        System.out.println("Azure Blob storage v12 - Java quickstart sample\n");

        String connectStr = System.getenv("AZURE_STORAGE_CONNECTION_STRING");

        BlobServiceClient blobServiceClient = new BlobServiceClientBuilder().connectionString(connectStr).buildClient();


        blobServiceClient.listBlobContainers().forEach(c -> System.out.println(c.getName()));

        // String containerName = "quickstartblobs" + java.util.UUID.randomUUID();
//        blobServiceClient.listBlobContainers().forEach(containers -> blobServiceClient.getBlobContainerClient(containers.getName()).listBlobs().forEach(blob -> System.out.println(blob.getName())));
//        BlobContainerClient containerClient = blobServiceClient.createBlobContainer(containerName);
        // createAndUploadFile(containerClient);
        // listBlobs(containerClient);
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
        File localFile = new File(localPath + fileName);

        FileWriter writer = new FileWriter(localPath + fileName, true);
        writer.write("Hello, World!");
        writer.close();

        BlobClient blobClient = containerClient.getBlobClient(fileName);

        System.out.println("\nUploading to Blob storage as blob:\n\t" + blobClient.getBlobUrl());

        blobClient.uploadFromFile(localPath + fileName);
    }
}