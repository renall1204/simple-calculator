import java.util.Scanner;

public class SoalKalkulator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int operator, angka1, angka2, jumlah;

        System.out.println("Pilih operasi aritmatika: \n 1 - Penjumlahan (+) \n 2 - Pengurangan (-) \n 3 - Perkalian (x) \n 4 - Pembagian (:)");
        operator = input.nextInt();
        System.out.println("Angka Pertama: ");
        angka1 = input.nextInt();
        System.out.println("Angka Kedua: ");
        angka2 = input.nextInt();

        switch(operator){
            case 1:
                jumlah = angka1 + angka2;
                System.out.println("Hasilnya: " + jumlah);
                break;
            case 2:
                jumlah = angka1 - angka2;
                System.out.println("Hasilnya: " + jumlah);
                break;
            case 3:
                jumlah = angka1 * angka2;
                System.out.println("Hasilnya: " + jumlah);
                break;
            case 4:
                jumlah = angka1 / angka2;
                System.out.println("Hasilnya: " + jumlah);
                break;
            default:
                System.out.println("Index Operator Error");
                break;
        }
    }
}
