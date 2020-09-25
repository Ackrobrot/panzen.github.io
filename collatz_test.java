public class collatz {
    public static void main(String[] args) {
        int x=98765432;
        while (x!=1){
            if (x%2==0)
            x=x/2;
            else
            x=x*3+1;
            System.out.println ("Das Ergebnis ist: " + x);
        }
        System.out.println("Die 1 hat gewonnen");
    }
}
