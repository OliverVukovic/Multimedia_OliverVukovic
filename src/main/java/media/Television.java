package media;

public class Television {
    public int volume;
    public int currentProgram;
    private boolean turnOn;
    
        
public Television() {
        this.volume = 0;
        this.currentProgram = 1;
        this.turnOn = false;    
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
    
    
    
    
    
    
    
    
}


