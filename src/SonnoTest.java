import java.util.Scanner;
import java.io.*;

public class SonnoTest {
    public static void main(String[] args) {

        Onde mieOnde = new Onde();

        Scanner scan = new Scanner(System.in);
        System.out.println("Ora ti descrivero' delle onde sonore e le correlero' ad una canzone (anch'essa correlata ad un gruppo di frequenze).");
        System.out.print("Inserisci una frequenza in Hertz (da 0,1 a 42): ");
        mieOnde.numFrequenza = scan.nextDouble();

        mieOnde.mostraFrequenzeOnde();
    }
}

//l'intento è quello di far partire una canzone a determinate frequenze, quindi con un input direttamente cerebrale
//con EEG e dei database per le frequenze e le canzoni che chiaramente al momento è impossibile avere :(