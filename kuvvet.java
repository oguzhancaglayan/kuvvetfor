import java.util.Scanner;
public class kuvvet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Sınır sayısını giriniz : ");
        n= input.nextInt();
        for(int i=1;i<=n;i*=(4)){

            System.out.println("4ün kuvvetleri : " +i);


            } for(int j=1;j<=n;j*=5){
            System.out.println("5in kuvvetleri : "+j);

        }

    }
}
