package com.directi.training.dip.exercise;

import java.io.IOException;

public class DatabaseWriterImpl implements IWriter {
    private MyDatabase database;

    public DatabaseWriterImpl(MyDatabase database) {
        this.database = database;
    }

    @Override
    public void write(String data) throws IOException {
        database.write(data);
    }
}
