package task;

public class DigitCount 
{
    public int count(int x) {
        
        int i;
        for ( i = 0; x>0; i++) {
            x = x/10;
        }
        return i;
    }
}
