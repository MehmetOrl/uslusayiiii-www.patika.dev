import java.util.Scanner;
public class Combination {
    public static void main(String[] args) {
        Scanner gd=new Scanner(System.in);
            int n,r ;
            int nfak=1,rfak=1,eksifark=1,kombinasyon;

        System.out.print("Eleman Sayısı Giriniz.:");
        n=gd.nextInt();
        System.out.print("Seçme Sayısı Giriniz.:");
        r=gd.nextInt();
        while(r>n)
        {
            System.out.print("seçme sayısı eleman sayısından büyük olamaz tekrardan  giriniz.:");
            r=gd.nextInt();
        }

            for(int i=n;i>=2;i--)
                {
                    nfak*=i;
                }
            for(int i=r;i>=2;i--)
            {
                rfak*=i;

            }
            for(int i=n-r;i>=2;i--)
            {
                eksifark*=i;
            }

            kombinasyon=nfak/(rfak*(eksifark));
            System.out.println("C("+n+","+r+")="+kombinasyon);
        }

}


