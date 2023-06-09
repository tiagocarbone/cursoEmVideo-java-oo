import java.util.concurrent.CancellationException;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Nic", "Amarelo", 0.4f);
        c1.status();
        System.out.println("");
        Caneta c2 = new Caneta("KK", "Laranja", 0.7f);
        c2.status();

    }
}