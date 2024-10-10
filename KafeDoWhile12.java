import java.util.Scanner;

public class KafeDoWhile12 {
    public static void main(String[] args) {
       
        Scanner sc12 = new Scanner(System.in);

int kopi, teh, roti;
String namaPelanggan;
double totalHarga, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

do {
    System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
    namaPelanggan = sc12.nextLine();
    if (namaPelanggan.equalsIgnoreCase("batal")){
        System.out.println("Transaksi dibatalkan.");
        break;
    }
System.out.print("Jumlah kopi: ");
kopi = sc12.nextInt();
System.out.print("Jumlah teh: ");
teh = sc12.nextInt();
System.out.print("Jumlah roti: ");
roti = sc12.nextInt();

totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
System.out.println("Total yang harus dibayar: Rp " + totalHarga);
sc12.nextLine();
} while (true);

System.out.println("Semua transaksi selesai.");

    }
}