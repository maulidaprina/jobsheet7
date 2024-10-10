import java.util.Scanner;

public class SiakadFor12 {
    public static void main(String[] args) {
       
        Scanner sc12 = new Scanner(System.in);

double nilai, tertinggi = 0, terendah = 100;

for (int i = 1; i <= 10; i++){
    System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
    nilai = sc12.nextDouble();
    if (nilai > tertinggi) {
        tertinggi = nilai;
    }
    if (nilai < terendah){
        terendah = nilai;
    }

    System.out.println("Nilai tertinggi: " + tertinggi);
    System.out.println("Nilai Terendah: " + terendah);
}

    }
}
