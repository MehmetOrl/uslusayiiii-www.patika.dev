import com.sun.tools.javac.Main;

import java.util.Scanner;
public class Uslu {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int sayi,us,s1 = 1;
        System.out.println("Sayı Giriniz.:");
        sayi=giris.nextInt();
        System.out.println("Üs  Giriniz.:");
        us=giris.nextInt();
        for(int i=1;i<=us;i++)
            {
                s1=s1*sayi;
            }
        System.out.println(+sayi +"'in"+" "+us+".cü kuvveti.:"+s1);


    }
}
