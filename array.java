import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner ipk = new Scanner(System.in);
        String[] mataKuliah = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matermatika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        double nilai[] = new double[mataKuliah.length];
        double sks[] = {2, 2, 2, 3, 2, 2, 3, 2};
        String nilaiHuruf[] = new String[mataKuliah.length];
        double IP, bobotNilai[] = new double[mataKuliah.length];
        double jumlah = 0, totalSKS = 0;

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");
        for (int i = 0; i < sks.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilai[i] = ipk.nextDouble();
            if(nilai[i] > 80 && nilai[i] <= 100){
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if(nilai[i] > 73 && nilai[i] <= 80){
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if(nilai[i] > 65 && nilai[i] <= 73){
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if(nilai[i] > 60 && nilai[i] <= 65){
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if(nilai[i] > 50 && nilai[i] <= 60){
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if(nilai[i] > 39 && nilai[i] <= 50){
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else if(nilai[i] <= 39){
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            } else{
                nilaiHuruf[i] = "Nilai anda tidak valid";
                bobotNilai[i] = 0;
            }
        }

        for (int i = 0; i < mataKuliah.length; i++) {
            jumlah += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }
        IP = jumlah / totalSKS;

        System.out.println("==============================");
        System.out.println("     Hasil Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-40s%-20s%-20s%-20s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-40s%-20s%-20s%-20s\n", mataKuliah[i], nilai[i], nilaiHuruf[i], bobotNilai[i]);
        }

        System.out.println("==============================");
        System.out.println("IP : " + IP);
        System.out.println("==============================");
        

    }
}
