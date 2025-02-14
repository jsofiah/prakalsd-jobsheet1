import java.util.Scanner;
public class tugas3 {
    static int mainMenu, subMenu;
    static Scanner jadwal = new Scanner(System.in);
    static int jml = 0, sks[], sms[];
    static String hari[], matKul[];

    static void dataMatkul() {
        System.out.println("=======================================");
        System.out.println("\tInput Data Mata Kuliah");
        System.out.println("=======================================");
        System.out.print("Masukkan jumlah mata kuliah: ");
        jml = jadwal.nextInt();
        
        if (jml < 1) {
            System.out.println("Jumlah mata kuliah harus lebih dari 0");
            return;
        }

        matKul = new String[jml];
        hari = new String[jml];
        sks = new int[jml];
        sms = new int[jml];

        jadwal.nextLine();

        for (int i = 0; i < jml; i++) {
            System.out.println("Mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            matKul[i] = jadwal.nextLine();
            System.out.print("Jumlah SKS: ");
            sks[i] = jadwal.nextInt();
            System.out.print("Semester: ");
            sms[i] = jadwal.nextInt();
            jadwal.nextLine();
            System.out.print("Hari: ");
            hari[i] = jadwal.nextLine();
        }
        System.out.println();
    }

    static void jadwalKuliah() {
        if (jml == 0) {
            System.out.println("Data masih belum terisi. Silakan input data terlebih dahulu.");
            return;
        }

        System.out.println("========================================================");
        System.out.println("\t\tMenampilkan Berdasarkan Pilihan");
        System.out.println("========================================================");
        System.out.println("1. Menampilkan seluruh jadwal kuliah");
        System.out.println("2. Menampilkan jadwal kuliah berdasarkan hari tertentu");
        System.out.println("3. Menampilkan jadwal kuliah berdasarkan semester");
        System.out.println("========================================================");
        System.out.print("Masukkan menu yang dipilih (angka): ");
        subMenu = jadwal.nextInt();
        jadwal.nextLine();

        switch (subMenu) {
            case 1:
                seluruhJadwal();
                break;
            case 2:
                jadwalHari();
                break;
            case 3:
                jadwalSms();
                break;
            default:
                System.out.println("Menu tidak valid");
        }
    }

    static void seluruhJadwal() {
        System.out.println("========================================================");
        System.out.println("\t\tSeluruh Jadwal Kuliah");
        System.out.println("========================================================");
        System.out.printf("%-25s%-5s%-15s%-10s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        for (int i = 0; i < jml; i++) {
            System.out.printf("%-25s%-5d%-15d%-10s\n", matKul[i], sks[i], sms[i], hari[i]);
        }
        System.out.println();
    }

    static void jadwalHari() {
        if (jml == 0) {
            System.out.println("Data masih belum terisi.");
            return;
        }

        System.out.print("Masukkan nama hari: ");
        String keyHari = jadwal.nextLine();
        boolean ditemukan = false;

        System.out.println("========================================================");
        System.out.printf("%-25s%-5s%-15s%-10s\n", "Mata Kuliah", "SKS", "Semester", "Hari");

        for (int i = 0; i < jml; i++) {
            if (keyHari.equalsIgnoreCase(hari[i])) {
                System.out.printf("%-25s%-5d%-15d%-10s\n", matKul[i], sks[i], sms[i], hari[i]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Hari yang dicari tidak ditemukan.");
        }
    }

    static void jadwalSms() {
        if (jml == 0) {
            System.out.println("Data masih belum terisi.");
            return;
        }

        System.out.print("Masukkan semester: ");
        int keySms = jadwal.nextInt();
        boolean ditemukan = false;

        System.out.println("========================================================");
        System.out.printf("%-25s%-5s%-15s%-10s\n", "Mata Kuliah", "SKS", "Semester", "Hari");

        for (int i = 0; i < jml; i++) {
            if (keySms == sms[i]) {
                System.out.printf("%-25s%-5d%-15d%-10s\n", matKul[i], sks[i], sms[i], hari[i]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Semester yang dicari tidak ditemukan.");
        }
    }

    static void cariMatkul() {
        if (jml == 0) {
            System.out.println("Data masih belum terisi.");
            return;
        }

        System.out.print("Masukkan nama mata kuliah: ");
        String keyMatkul = jadwal.nextLine();
        boolean ditemukan = false;

        System.out.println("========================================================");
        System.out.printf("%-25s%-5s%-15s%-10s\n", "Mata Kuliah", "SKS", "Semester", "Hari");

        for (int i = 0; i < jml; i++) {
            if (keyMatkul.equalsIgnoreCase(matKul[i])) {
                System.out.printf("%-25s%-5d%-15d%-10s\n", matKul[i], sks[i], sms[i], hari[i]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah yang dicari tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("=======================================");
            System.out.println("\tProgram Jadwal Kuliah");
            System.out.println("=======================================");
            System.out.println("1. Memasukkan data mata kuliah");
            System.out.println("2. Menampilkan jadwal kuliah");
            System.out.println("3. Mencari mata kuliah");
            System.out.println("4. Keluar");
            System.out.println("=======================================");
            System.out.print("Masukkan menu yang dipilih (angka): ");
            mainMenu = jadwal.nextInt();
            jadwal.nextLine();

            if (mainMenu == 1) {
                dataMatkul();
            }
            else if (mainMenu == 2) {
                jadwalKuliah();
            }
            else if (mainMenu == 3) {
                cariMatkul();
            }
            else if (mainMenu == 4) {
                break;
            }
            else {
                System.out.println("Menu tidak valid");
            }
        }
        jadwal.close();
    }
}
