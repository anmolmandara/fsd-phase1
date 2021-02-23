package org.example.virtualkey.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;
import java.io.File;

import org.example.virtualkey.entities.Directory;

public class DirectoryService {

    private static Directory fileDirectory = new Directory();
    
    public static Directory getFileDirectory() {
        return fileDirectory;
    }

    public static void setFileDirectory(Directory fileDirectory) {
        DirectoryService.fileDirectory = fileDirectory;
    }


    public static void ViewFolder(){
    	 File dir = new File("C:/Users/Player1/Documents/VirtualKeyDataFiles");
    	 for(String filename : dir.list()) {
    		 System.out.println(filename);
    	 }
    }
}