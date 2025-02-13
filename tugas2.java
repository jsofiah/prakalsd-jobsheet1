import java.util.Scanner;
public class tugas2 {
    static int v, lp, k, sisi;
    static int menu;
    static void volume(int sisi){
        v = sisi * sisi * sisi;
        System.out.println("Volume Kubus: " + v);
    }
    static void luaspermukaan(int sisi){
        lp = 6 * sisi * sisi;
        System.out.println("Luas Permukaan Kubus: " + lp);
    }
    static void keliling(int sisi){
        k = 12 * sisi;
        System.out.println("Keliling Kubus: " + k);
    }

    public static void main(String[] args) {
        Scanner kubus = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("\tMenghitung Kubus Otomatis");
        System.out.println("======================================");
        System.out.println("1. Volume Kubus");
        System.out.println("2. Luas Permukaan Kubus");
        System.out.println("3. Keliling Kubus");
        System.out.println("======================================");
        System.out.print("Menu (angka): ");
        menu = kubus.nextInt();
        System.out.print("Sisi        : ");
        sisi = kubus.nextInt();

        if(menu == 1){
            volume(sisi);
        } else if(menu == 2){
            luaspermukaan(sisi);
        } else if(menu == 3){
            keliling(sisi);
        } else{
            System.out.println("Menu tidak valid");
        }

    }
}
