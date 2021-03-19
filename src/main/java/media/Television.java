package media;

public class Television {
    private int volume;
    private int currentProgram;
    private boolean turnOn;
    
        
public Television() {
        this.volume = 0;
        this.currentProgram = 1;
        this.turnOn = true;    
}        

public int getVolume() {
        return this.volume;
}

public void setVolume(int newVolume) {
        this.volume = newVolume;    
}

public int getCurrentProgram() {
        return this.currentProgram;
}

public void setCurrentProgram (int newProgram) {
        this.currentProgram = newProgram;
}
    
public boolean getTurnOn () {
        return this.turnOn;
}     

public void setTurnOn (boolean newTurnOn) {
        this.turnOn = newTurnOn;
}
    
    
public Television(int volume, int program, boolean turnOn) {
    this.volume = volume;
    this.currentProgram = program;
    this.turnOn = turnOn;
}


public void info() {
    System.out.println("TV je ukljucen: " + getTurnOn());
    System.out.println("Jacina tone je: " + getVolume());
    System.out.println("Trenutni program je: " + getCurrentProgram());
    System.out.println("");
}    
    
    
    
    
    
}


