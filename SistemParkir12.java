import java.util.Scanner;

public class SistemParkir12 {
    public static void main(String[] args) {
       
        Scanner sc12 = new Scanner(System.in);

String jenisKendaraan = "";
int pilihan, biayaMobil = 3000, biayaMotor = 2000, jam, totalBiaya;

while (true) {
System.out.println("Pilih Jenis Kendaraan: ");
System.out.println("1. Mobil");
System.out.println("2. Motor");
System.out.println("0. Keluar");
System.out.println("Masukkan pilihan (1/2/0): ");
pilihan = sc12.nextInt();

if (pilihan == 0) {
    System.out.print("Program Selesai");
    break;
}

if (pilihan != 1 && pilihan != 2) {
    System.out.println("Pilihan tidak valid. Masukkan pilihan yang valid!");
    continue;
}

System.out.print("Berapa jam Anda akan parkir: ");
jam = sc12.nextInt();

if (pilihan == 1) {
    jenisKendaraan = "Mobil";
    if (jam > 5) {
        totalBiaya = 12500;
    } else {
        totalBiaya = biayaMobil * jam;
    }
} else if (pilihan == 2) {
    jenisKendaraan = "Motor";
    if (jam > 5) {
        totalBiaya = 12500;
    } else {
        totalBiaya = biayaMotor * jam;
    } 
} else {
    System.out.println("Jam yang dimasukkan tidak valid. Masukkan jam yang valid!");
    continue;
}
    System.out.println("Jenis kendaraan: " + jenisKendaraan);
    System.out.println("Total biaya parkir: Rp" + totalBiaya);

        }
    }
}
