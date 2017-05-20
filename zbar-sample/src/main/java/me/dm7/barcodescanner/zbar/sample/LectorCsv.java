package me.dm7.barcodescanner.zbar.sample;

/**
 * Created by jugando on 14-May-17.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class LectorCsv {
    InputStream input;

    public LectorCsv(InputStream input) {
        this.input = input;

    }

    public List read() {

        List<Jobs> jobsList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        try {
            String csvLine;
            while ((csvLine = reader.readLine()) != null) {
                String[] row = csvLine.split(",");
                jobsList.add(new Jobs(row[4], row[5], row[8]));
            }
        } catch (IOException ex) {
            throw new RuntimeException("Error in reading CSV file: " + ex);
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                throw new RuntimeException("Error while closing input stream: " + e);
            }
        }
        return jobsList;
    }

    public void escribeJobs(List<Jobs> listJobs) {
        for (Jobs j : listJobs) {
            System.out.println(j.getProjectName() + " funciona");
        }
    }



}
