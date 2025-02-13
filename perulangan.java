import java.util.Scanner;
public class perulangan {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        long nim;
        int n;

        System.out.print("Masukkan NIM: ");
        nim = angka.nextLong();
        n = (int) (nim % 100);
        if(n<10){
            n += 10;
        }

        System.out.println("=====================");
        System.out.println("n : " + n);

        for (int i = 1; i <= n; i++) {
            if(i == 6 || i == 10){
                continue;
            }
            else if(i % 2 == 0){
                System.out.print(i + " ");
            }
            else if(i % 2 != 0){
                System.out.print("* ");
            }
            else{
                break;
            }
        }
    }
}
