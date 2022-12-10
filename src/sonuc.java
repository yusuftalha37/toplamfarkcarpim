import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class sonuc {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen iki adet  sayı giriniz :");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
       int toplam ;
        toplam = sayi2 +sayi1;
        System.out.println("Toplam " + toplam);
       if (sayi1>sayi2 ){
           int fark1;
           fark1 = sayi1-sayi2;
           System.out.println("Fark " + fark1);
       }
       if (sayi2 >sayi1){
           int fark2;
           fark2 = sayi2 -sayi1;
           System.out.println("Fark "+ fark2);
       }
       int çarpım;
       çarpım = sayi1 * sayi2;
        System.out.println( "Çarpım " + çarpım);




    }
}
