package org.example.virtualkey;

import org.example.virtualkey.entities.*;
import org.example.virtualkey.screens.WelcomeScreen;
import org.example.virtualkey.services.DirectoryService;

import java.util.Optional;


public class VirtualKeyApplication {


    public static String Greeting() {
        return("Hello World!");
    }

    public static void main(String[] args) {
        System.out.println(Greeting());
        
        //DirectoryService.AddTestData();
        while(true) {
        WelcomeScreen ws = new WelcomeScreen();
        ws.Show();
        ws.GetUserInput();
        }
       
    }
    
}



