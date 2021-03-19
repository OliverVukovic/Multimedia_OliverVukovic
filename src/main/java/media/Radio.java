package media;

public class Radio {
    
    private double fmFrequency;
    private int amFrequency;
    private char band;
    
public Radio() {
    this.fmFrequency = 91.8;
    this.amFrequency = 600;
    this.band = 'F';
}

public double getFmFrequency() {
        return this.fmFrequency;
}

public void setFmFrequency(double newFmFrequency) {
        this.fmFrequency = newFmFrequency;    
}

public int getAmFrequency() {
        return this.amFrequency;
}

public void setAmFrequency (int newAmFrequency) {
        this.amFrequency = newAmFrequency; 
}
    
public char getBand() {
        return this.band;
}     

public void setBand (char newBand) {
        this.band = newBand;
}
    

public Radio(double fmFrequency, int amFrequency, char band) {
    this.fmFrequency = fmFrequency;
    this.amFrequency = amFrequency;
    this.band = band;
}    
    
    
public void info() {
    System.out.println("FM frekvencija: " + getFmFrequency());
    System.out.println("AM frekvencija " + getAmFrequency());
    System.out.println("Trenutni telas je: " + getBand());
}    
    
}
