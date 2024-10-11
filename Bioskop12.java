import java.util.Scanner;

public class Bioskop12 {
    public static void main(String[] args) {
       
        Scanner sc12 = new Scanner(System.in);

int totalTiketTerjual = 0, jumlahTiket;
double totalPenjualan = 0, hargaTiket = 50000, totalHarga;

while (true) {
    System.out.print("Masukkan jumlah tiket (ketik 0 untuk selesai): ");
    jumlahTiket = sc12.nextInt();

if (jumlahTiket == 0) {
    break;
}
if (jumlahTiket < 0) {
    System.out.println("Jumlah tiket tidak valid. Masukkan jumlah tiket yang valid!");
    continue;
}

totalHarga = jumlahTiket * hargaTiket;

if (jumlahTiket > 4) {
    System.out.println("Anda mendapatkan diskon sebesar 10%");
    totalHarga *= 0.90;
} else if (jumlahTiket > 10) {
    System.out.println("Anda mendapatkan diskon sebesar 15%");
    totalHarga *= 0.85;
}

totalTiketTerjual += jumlahTiket;
totalPenjualan += totalHarga;

System.out.println("Total harga: " + totalHarga);
System.out.println("Total tiket terjual: " + totalTiketTerjual);
System.out.println("Total penjualan tiket: Rp " + totalPenjualan);
}   
    }
}
