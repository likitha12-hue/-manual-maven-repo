package com.devops.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogAnalyzer {

    public static void main(String[] args) {

        String filePath = "app.log";

        int errorCount = 0;
        int warningCount = 0;
        int infoCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            while((line = reader.readLine()) != null){

                if(line.contains("ERROR")){
                    errorCount++;
                }
                else if(line.contains("WARNING")){
                    warningCount++;
                }
                else if(line.contains("INFO")){
                    infoCount++;
                }

            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("Log Analysis Report");
        System.out.println("-------------------");
        System.out.println("Errors   : " + errorCount);
        System.out.println("Warnings : " + warningCount);
        System.out.println("Info     : " + infoCount);
    }
}
