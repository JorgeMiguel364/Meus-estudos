package exerc4;

public class Exerc4a{
    
    private int val1, val2;
    private float med;
    
    public Exerc4a(int val1Inp, int val2Inp)
    {
        val1=val1Inp;
        val2=val2Inp;
        med=(val1+val2)/2;
    }
    
    public float getMedia()
    {
        return med;
    }
}
