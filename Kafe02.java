import java.util.Scanner;
public class Kafe02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keanggotaan; int jmlKopi, jmlTeh, jmlRoti;
        double totalharga;
        double nominalBayar;
        double hargakopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0; 
        float diskon = 10/100f;
        System.out.print("Masukkan keanggotan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();
        totalharga = (jmlKopi * hargakopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        nominalBayar = totalharga - (diskon * totalharga);
        System.out.println("Keanggotaan pelanggan "+ keanggotaan);
        System.out.println("Item pembelian + jmlKopi + kopi, " + jmlTeh + "teh," + jmlRoti + "roti");
        System.out.println("Nominal bayar Rp" + nominalBayar);



    }
    
}