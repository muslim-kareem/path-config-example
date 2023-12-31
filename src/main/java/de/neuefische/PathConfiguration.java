package de.neuefische;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PathConfiguration {
    public static Properties getPropsByFilePath(String url) {
        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream(url);
            prop.load(input);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return prop;
    }
}
