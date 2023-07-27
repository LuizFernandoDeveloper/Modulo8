import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota:");
        float fristNote = sc.nextFloat();
        System.out.print("Digite a segunda nota:");
        float secondNote = sc.nextFloat();
        System.out.print("Digite a terceira nota:");
        float thirdNote = sc.nextFloat();
        System.out.print("Digite a quarta nota:");
        float fourthNote = sc.nextFloat();
        sc.close();

        System.out.println("A media é: " + averade(fristNote, secondNote, thirdNote, fourthNote));
    }

    public static float averade(float fristNote, float secondNote, float thirdNote, float fourthNote ) {
        float total = (fristNote + secondNote + thirdNote + fourthNote) / 4;
        return total;
    }
}

