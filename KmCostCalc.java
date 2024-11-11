import java.util.Scanner;

public class KmCostCalc {
    public static void main(String[] args){
        System.out.println("mrfe");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aracınız kilometrede kaç tl yakıyor? ");
        double tl = scanner.nextDouble();
        System.out.print("Kaç kilometre yol aldınız? ");
        int km = scanner.nextInt();

        System.out.println("Ödemeniz gereken tutar: " + tl * km);
    }
}
