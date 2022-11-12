import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i,total=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Bir sayı giriniz: ");
            i = input.nextInt();
            if(i%2==0 || i%4==0){
                total +=i;

            }
        }while(i>0);
        System.out.println("Sayıların toplamı: "+total);

    }
}