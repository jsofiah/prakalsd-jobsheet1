public class fungsi {
    static int[][] stockBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    static int harga[] = {75000, 50000, 60000, 10000};
    static int pendapatan[] = new int[stockBunga.length];
    static String bunga[] = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

    static void catatanBunga(){
        System.out.println("\t\tCatatan Stock Bunga");
        System.out.println("======================================================");
        System.out.println("Cabang           Aglonema   Keladi   Alocasia   Mawar");
        System.out.println("======================================================");
        for (int i = 0; i < stockBunga.length; i++) {
            System.out.printf("RoyalGarden %-2d    %-10d %-8d %-9d %-6d\n", i + 1, stockBunga[i][0], stockBunga[i][1], stockBunga[i][2], stockBunga[i][3]);
        }

    }

    static void penjualan(){
        System.out.println("====================================================");
        System.out.println("\n\t\tPendapatan Tiap Cabang");
        System.out.println("====================================================");
        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 0; j < stockBunga[i].length; j++) {
                pendapatan[i] += stockBunga[i][j] * harga[j];
            }
            System.out.println("RoyalGarden " + (i+1) + ": " + pendapatan[i]);
        }
        
    }

    static void sisaStock(){
        System.out.println("====================================================");
        System.out.println("\n\t\tPerubahan Stock Bunga");
        System.out.println("====================================================");
        int bungaMati[] = {1, 2, 0, 5};
        int sisaStockBunga[] = new int[stockBunga.length];
        for (int i = 0; i < sisaStockBunga.length; i++) {
            sisaStockBunga[i] = stockBunga[3][i] - bungaMati[i];
        }
        System.out.printf("%-12s %-8s %-12s %-12s\n", "Bunga", "Stock", "Bunga Mati", "Bunga Tersisa");
        for (int i = 0; i < sisaStockBunga.length; i++) {
            System.out.printf("%-12s %-8d %-12d %-12d\n", bunga[i], stockBunga[3][i], bungaMati[i], sisaStockBunga[i]);
        }

    }
    public static void main(String[] args) {
        catatanBunga();
        penjualan();
        sisaStock();
    }
}
