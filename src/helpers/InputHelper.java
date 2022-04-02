package helpers;

import java.util.Scanner;

public class InputHelper {

    public static  Integer lerID (String mensagem) {
         System.out.println(mensagem);

         Scanner scan = new Scanner(System.in);
         return Integer.parseInt(scan.nextLine());
    }

    public static String lerTexto (String mensagem) {
        System.out.println(mensagem);

        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    public static Double lerValor (String mensagem) {
        System.out.println(mensagem);

        Scanner scan = new Scanner(System.in);
        return Double.parseDouble(scan.nextLine());

    }
    public static  Integer lerNumeroInteiro (String mensagem) {
        System.out.print(mensagem);

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }
}
