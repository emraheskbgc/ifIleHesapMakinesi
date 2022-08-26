import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi1, sayi2, islem;

        Scanner input = new Scanner(System.in);

        System.out.println("İlk Sayıyı Giriniz : ");
        sayi1= input.nextInt();
        System.out.println("ikinci Sayıyı Giriniz :");
        sayi2= input.nextInt();

        System.out.println("1-Toplama\n 2-Çıkarma \n 3-Çarpma\n 4-Bölme\n");
        System.out.println("seçiminiz : ");
        islem= input.nextInt();

        if (islem == 1 ){
            System.out.println("Toplam : " + (sayi1 + sayi2) );
        }else if (islem == 2 ){
            System.out.println("Çıkarma : " + (sayi1 - sayi2) );
        }else if (islem == 3 ){
            System.out.println("Çarpma : " + (sayi1 * sayi2) );
        }else if (islem == 4 ){
            System.out.println("Bölme : " + (sayi1 / sayi2) );
        }


    }
}
