package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {

        try {

            //2-We need to open the file in java memory: FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            //3-lOAD the properties object using FileInputStream
            properties.load(file);

            file.close();

        }catch (IOException  e){
            System.out.println("File not found in ConfigurationReader class.");
            e.printStackTrace();

        }


    }


    public static String getProperty(String keyword){
        return properties.getProperty(keyword);


    }




}