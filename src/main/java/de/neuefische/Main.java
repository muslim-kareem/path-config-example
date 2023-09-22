package de.neuefische;


import java.util.Properties;

public class Main {
    // die PATH_CONFIG variable musste als environment variable gesetzt werden
    // und ist enthält absolut path von application.properties Datei
    private static Properties prop =  PathConfiguration.getPropsByFilePath(System.getenv("PATH_CONFIG"));
    private final static String BASIC_URI = prop.getProperty("basic.uri");
    private final static String AUTH_URI = prop.getProperty("auth.uri");
    public static void main(String[] args) {
        System.out.println(BASIC_URI);
        System.out.println(AUTH_URI);
    }
}