import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
//            byte a = 100;
//            short b = a;
//
//            double c = 10001.0;
//            float d = (float) c;
//        System.out.println(""+ d);
        //Otomatik tip dönüşümü ve casting işlemi ile alakalı bir deneme...
        int a, b;
        double c;
        Scanner giris = new Scanner(System.in);
        System.out.print("İlk Sayıyı giriniz: ");
        a = giris.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        b= giris.nextInt();
        c= Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs: "+c);
    }
}