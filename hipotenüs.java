import java.util.Scanner;

public class hipotenüs {

    public static void main(String[] args) {
        System.out.println("kerem");

        Scanner scanner = new Scanner(System.in);
        System.out.print("birinci kenar: ");
        int bir = scanner.nextInt();

        System.out.print("ikinci kenar: ");
        int iki = scanner.nextInt();

        double hip = Math.sqrt(bir * bir + iki * iki);        
        System.out.println("Hipotenüs = " + hip );
    }
}
