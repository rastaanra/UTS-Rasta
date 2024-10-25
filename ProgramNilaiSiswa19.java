import java.util.Scanner;
public class ProgramNilaiSiswa19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jumlahsiswa = 0, jumlahNilai = 0, lebihRataRata = 0, kurangRataRata = 0;
        String nama;
        double nilai, ratarata = 0, RataRataAkhir = 0;
        do {
            System.out.print("Masukkan nama siswa (ketik 'selesai' untuk keluar): ");
            nama = sc.nextLine();

            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }
                do {
                    System.out.println("Masukkan nilai siswa untuk " + nama + ": ");
                    nilai = sc.nextDouble();
                    sc.nextLine();
  
                    jumlahsiswa++;
                    jumlahNilai += nilai;
                    ratarata = jumlahNilai / jumlahsiswa;
        
                    if ( nilai > ratarata) {
                       
                        lebihRataRata++;
                    } else if ( nilai < ratarata) {
                        
                        kurangRataRata++;
                    } 
                } while (true);
            
            
        } while (true);
        
        RataRataAkhir = jumlahNilai / jumlahsiswa;
        System.out.println("\nRata Rata Nilai Kelas: " + RataRataAkhir);
        System.out.println("Jumlah Siswa Yang Nilainya di Atas Rata-Rata: " + lebihRataRata);
       
        System.out.println("Jumlah Siswa Yang Nilainya di Bawah Rata-Rata: " + kurangRataRata );
        

        if (lebihRataRata > (jumlahsiswa / 2)) {
            System.out.println("Mayoritas Siswa Yang Nilainya di Atas Rata-Rata: ");
        } else {
            System.out.println("Mayoritas Siswa Yang Nilainya di Bawah Rata-Rata: ");
        }
    }
}
