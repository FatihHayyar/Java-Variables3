package day02Variables;

import java.util.Scanner;

public class C04_Scanner2 {
    public static void main(String[] args) {
        Scanner unit=new Scanner(System.in);
//        System.out.println("dort basamakli bir sayi girin");
//        int sayi= unit.nextInt();
//        int ilksayi=sayi%10;
//        int sonsayi=sayi/1000;
//        System.out.println("ilk ve son rakam toplam="+(ilksayi+sonsayi));
//        System.out.println("uc basamakli bir sayi girin");
//        int sayi= unit.nextInt();
//        int ilksayi=sayi%10;
//        int ikisayi=(sayi/10)%10;
//        int ucsayi=sayi/100;
//        System.out.println("birler basamagi="+ilksayi);
//        System.out.println("onlar basamagi="+ikisayi);
//        System.out.println("yuzler basamagi="+ucsayi);
        System.out.println("bes basamakli bir sayi girin");
        int sayi= unit.nextInt();
        int bsayi=sayi%10;
        int osayi=(sayi/10)%10;
        int ysayi=(sayi/1000)%10;
        int bnsayi=sayi/10000;
        System.out.println("toplam="+(bsayi+osayi+ysayi+bnsayi));









    }

}
