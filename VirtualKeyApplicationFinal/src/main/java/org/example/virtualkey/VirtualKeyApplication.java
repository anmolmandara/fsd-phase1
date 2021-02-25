package org.example.virtualkey;
import org.example.virtualkey.screens.WelcomeScreen;



public class VirtualKeyApplication {

    public static void main(String[] args) {
     
        while(true) {
        WelcomeScreen ws = new WelcomeScreen();
        ws.Show();
        ws.GetUserInput();
        }
    } 
}



