package org.example.virtualkey.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class Directory {

    String name;

    //TODO: Possibly use a HashMap?
    ArrayList<File> files = new ArrayList<File>();

//    //TODO: Possibly use a HashMap?
//    ArrayList<Directory> directories = new ArrayList<Directory>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }
//
//    public ArrayList<Directory> getDirectories() {
//        return directories;
//    }
//
//    public void setDirectories(ArrayList<Directory> directories) {
//        this.directories = directories;
//    }



//    public void DeleteFile(File file) {
//        //TODO: Delete file
//    }
//    public void AddFile(File file) {
//        //TODO: Add file
//        files.add(file);
// 
//    }
//    
//    public void DeleteDirectory(Directory directory) {
//        //TODO: Delete directory
//    }
//    public void AddDirectory(Directory directory) {
//        //TODO: Add directory
//    }



}