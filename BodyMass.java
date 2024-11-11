import java.util.Scanner;

public class BodyMass {
public static void main(String[] args) {
   System.out.println("memoli");

   Scanner scanner = new Scanner(System.in);
   System.out.print("Kilonuzu girin: ");
   int kilo = scanner.nextInt();
   System.out.print("Bouyunuzu girin (Örnek: 1,85) ");
   double boy = scanner.nextDouble();

   double bki = kilo / (boy * boy);

   System.out.println("Beden kitle endeksiniz: " + bki);
}



}
