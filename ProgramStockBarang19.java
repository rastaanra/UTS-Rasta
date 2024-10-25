import java.util.Scanner;
public class ProgramStockBarang19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String namaBarang, input;
        double totalStock = 0, hargaSatuan = 0, jumlahNilaiStock = 0, permintaanBarang = 0;
        double sisaStock = 0;

        while (true) {
            System.out.println("Masukkan Nama Barang (ketik 'Selesai' untuk keluar): ");
            namaBarang = sc.nextLine();

            if (namaBarang.equalsIgnoreCase("selesai")) {
                break;
            }
            System.out.println("Masukkan Jumlah Stock Untuk " + namaBarang + ": ");
            totalStock = sc.nextDouble();
            System.out.println("Masukkan Harga per Satuan Untuk " + namaBarang + ": " );
            hargaSatuan = sc.nextDouble();
            sc.nextLine();

            jumlahNilaiStock = totalStock * hargaSatuan;
            System.out.println("Total Nilai Stock Untuk " + namaBarang + ": " + jumlahNilaiStock);

            System.out.println("Masukkan Jumlah Permintaan Barang Untuk " + namaBarang + ": ");
            permintaanBarang = sc.nextDouble();
            sc.nextLine();

            if (permintaanBarang <= totalStock) {
                System.out.println("Permintan Dapat Dikerjakan");
                totalStock -= permintaanBarang;

                sisaStock = totalStock - permintaanBarang;
                System.out.println("Sisa Stock Untuk " + namaBarang + ": " + sisaStock);
            
            } else {
                System.out.println("Stock Tidak Cukup. Permintaan Tidak Dapat Dikerjakan");
            }

        }
        System.out.println("Program Telah Selesai");
    }
}