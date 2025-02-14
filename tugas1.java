import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner kode = new Scanner(System.in);
        String plat[] = {"A", "B", "D", "E", "F", "G", "H", "L", "N", "T"};
        String kota[][] = {
            {"B", "A", "N", "T", "E", "N"},
            {"J", "A", "K", "A", "R", "T", "A"},
            {"B", "A", "N", "D", "U", "N", "G"},
            {"C", "I", "R", "E", "B", "O", "N"},
            {"B", "O", "G", "O", "R"},
            {"P", "E", "K", "A", "L", "O", "N", "G", "A", "N"},
            {"S", "E", "M", "A", "R", "A", "N", "G"},
            {"S", "U", "R", "A", "B", "A", "Y", "A"},
            {"M", "A", "L", "A", "N", "G"},
            {"T", "E", "G", "A", "L"}
        };
        String cari;
        boolean ditemukan = false;

        System.out.print("Masukkan kode plat nomor yang dicari: ");
        cari = kode.nextLine();
        for (int i = 0; i < kota.length; i++) {
            if(cari.equalsIgnoreCase(plat[i])){
                System.out.print("Kode plat nomor " + cari + " merupakan kode Kota ");
                for (int j = 0; j < kota[i].length; j++) {
                    System.out.print(kota[i][j]);
                }
                ditemukan = true;
                break;
            }
        }
        if(ditemukan == false){
            System.out.println("Kode plat nomor yang dicari tidak ditemukan");
        }

    }
}
