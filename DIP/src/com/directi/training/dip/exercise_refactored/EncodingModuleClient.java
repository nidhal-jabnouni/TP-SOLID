package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        // Create encoder
        IEncoder encoder = new Base64Encoder();
        
        // Scenario 1: Encode with files
        IReader fileReader = new FileReaderImpl("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        IWriter fileWriter = new FileWriterImpl("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        EncodingModule fileEncodingModule = new EncodingModule(fileReader, fileWriter, encoder);
        fileEncodingModule.encode();
        
        // Scenario 2: Encode based on network and database
        IReader networkReader = new NetworkReaderImpl("http://myfirstappwith.appspot.com/index.html");
        IWriter databaseWriter = new DatabaseWriterImpl(new MyDatabase());
        EncodingModule networkEncodingModule = new EncodingModule(networkReader, databaseWriter, encoder);
        networkEncodingModule.encode();
    }
}
