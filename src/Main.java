import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.0, kdvTutar = 0.0, kdvliFiyat = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();

        if (tutar > 0) {
            if (tutar < 1000) {
                kdvOran = 0.18;
            } else {
                kdvOran = 0.08;
            }
            kdvTutar = tutar * kdvOran;
            kdvliFiyat = tutar + kdvTutar;

            System.out.println("KDV'siz Tutar : " + tutar);
            System.out.println("KDV Oranı : " + kdvOran);
            System.out.println("KDV'li Fiyat : " + kdvliFiyat);
            System.out.println("KDV Tutarı : " + kdvTutar);
        } else {
            System.out.println("Negatif bir değer girdiniz.");
        }

    }
}