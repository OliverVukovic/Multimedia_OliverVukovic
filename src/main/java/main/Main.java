package main;

import media.Television;
import media.Radio;        

public class Main {
    
    public static void main(String[] args) {
       
        
    Television samsung = new Television();   
    samsung.info();
    
    samsung.setTurnOn(true);
    samsung.setVolume(30);
    samsung.setCurrentProgram(2);
    
    samsung.info();
    
    
    Radio carRadio = new Radio(103.6, 700, 'A');
    carRadio.info();
    
    carRadio.setFmFrequency(100.9);
    carRadio.setAmFrequency(300);
    carRadio.setBand('F');
    
    carRadio.info();
    
    
    
        
        
        
        
        
        
        
    }
    
}
