import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.FRANCE);

        System.out.print("Inteiro: ");
        int i = scanner.nextInt();
        System.out.print("Booleano: ");
        boolean b = scanner.nextBoolean();
        System.out.print("Double: ");
        double d = scanner.nextDouble();
        System.out.print("Palavra: ");
        String s = scanner.next();
        scanner.nextLine();
        System.out.print("Linha: ");
        String line = scanner.nextLine();

        System.out.println(i);
        System.out.println(b);
        System.out.println(d);
        System.out.println(s);
        System.out.println(line);

        scanner.close();
    }
}
