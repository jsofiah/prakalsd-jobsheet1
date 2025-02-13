import java.util.Scanner;
public class pemilihan {
    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);
        String nilaiHuruf = "", kelulusan = "";
        double nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        double ketentuanTugas = 0.20, ketentuanKuis = 0.20, ketentuanUTS = 0.30, ketentuanUAS = 0.30, nilaiAkhir;

        System.out.println("Program Menghitung Nilai AKhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = nilai.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = nilai.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = nilai.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS = nilai.nextDouble();
        System.out.println("==============================");
        System.out.println("==============================");

        if(nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100){
            System.out.println("Nilai tidak valid");
            System.out.println("==============================");
            System.out.println("==============================");
        } else {
            nilaiAkhir = ((nilaiTugas * ketentuanTugas) + (nilaiKuis * ketentuanKuis) + (nilaiUTS * ketentuanUTS) + (nilaiUAS * ketentuanUAS));
    
            if(nilaiAkhir > 80 && nilaiAkhir <= 100){
                nilaiHuruf = "A";
                kelulusan = "LULUS";
            } else if(nilaiAkhir > 73 && nilaiAkhir <= 80){
                nilaiHuruf = "B+";
                kelulusan = "LULUS";
            } else if(nilaiAkhir > 65 && nilaiAkhir <= 73){
                nilaiHuruf = "B";
                kelulusan = "LULUS";
            } else if(nilaiAkhir > 60 && nilaiAkhir <= 65){
                nilaiHuruf = "C+";
                kelulusan = "LULUS";
            } else if(nilaiAkhir > 50 && nilaiAkhir <= 60){
                nilaiHuruf = "C";
                kelulusan = "LULUS";
            } else if(nilaiAkhir > 39 && nilaiAkhir <= 50){
                nilaiHuruf = "D";
                kelulusan = "TIDAK LULUS";
            } else if(nilaiAkhir <= 39){
                nilaiHuruf = "E";
                kelulusan = "TIDAK LULUS";
            } else{
                nilaiHuruf = "Nilai anda tidak valid";
                kelulusan = "TIDAK LULUS";
            }
    
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
    
            System.out.println("==============================");
            System.out.println("==============================");
    
            if(nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")){
                System.out.println("SELAMAT ANDA " + kelulusan);
            } else{
                System.out.println("MAAF ANDA " + kelulusan);
            }
        }
    }
}