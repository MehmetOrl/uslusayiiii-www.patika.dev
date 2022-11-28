import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int sayi;
        System.out.print("Sayi giriniz.:");
        sayi=ip.nextInt();

        for(int i=1;i<=sayi; i*=4 )
        {
            System.out.println("4 in kuvvetleri.:"+i);

        }
        System.out.println();
        for(int j=1;j<=sayi;j*=5)
            {
                System.out.println("5 in kuvvetleri.:"+j);
            }
    }
}
