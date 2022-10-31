package HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {
    static int num1;
    static int num2;

        HesapMakinesi(int num1, int num2){
        HesapMakinesi.num1 = num1;
        HesapMakinesi.num2 = num2;
    }

        public static int toplama(){
            return num2 + num1;
    }

        public static int cikarma(){
            return num1 - num2;
        }

        public static int carpma(){
            return num2 * num1;
        }

        public static int bolme(){
            return num1 / num2;
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz:");
        int sayi1 = scan.nextInt();
        num1 = sayi1;
        System.out.println("İkinci sayıyı giriniz:");
        int sayi2 = scan.nextInt();
        num2 = sayi2;

        System.out.println("Toplama :" + toplama());
        System.out.println("Çıkarma :" + cikarma());
        System.out.println("Çarpma : " + carpma());
        System.out.println("Bölme :" + bolme());

    }

}
