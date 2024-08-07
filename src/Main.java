import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
  Scanner inp = new Scanner(System.in);
  int n;
  int a=0,b=1,c;
        System.out.print("Sayıyı giriniz:");
        n = inp.nextInt();
if(n >=1){
    System.out.print(a+" ");

}
if(n >= 2){
    System.out.print(b+ " ");
}
        for(int i = 3;i<=n;i++){
            c = a + b;
            System.out.print(c+ " ");

             a = b;
            b = c;
        }


    }
}