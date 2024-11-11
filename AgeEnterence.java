import java.util.Scanner;

public class AgeEnterence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mroe");
        System.out.print("lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        if (yas < 18){

            System.out.print("bu siteye giremezsiniz");
        }

        else{

            System.out.print("bravo! Siteye girmeye hak kazandınız");
        }


    }
}
