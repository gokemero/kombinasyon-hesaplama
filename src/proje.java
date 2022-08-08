import java.util.Scanner;
public class proje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kümenin eleman sayısını giriniz :");
        int x = input.nextInt();
        System.out.print("Kaç elemanlı kğme sayısı bulunsun :");
        int y = input.nextInt();
        int a =1,b=1,c=1,t=x-y;
        while(x>1){
        a*=x;
        x--;}
        while(y>1){
            b*=y;
            y--;
        }
        while(t>1){
            c*=t;
            t--;
        }
        int sonuc = a/(b*c);
        System.out.println(sonuc);

    }
}
