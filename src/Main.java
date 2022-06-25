import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sorgulayacaginiz Sayiyi Giriniz:  ");
        int number = input.nextInt();
        int tempNumber = number;
        int numberCounter = 0;
        int basSayiDeg = 0;
        int basPow = 1;
        int result = 0;
        int totalBasDegeri=0;

        while (tempNumber != 0) {

            tempNumber /= 10;
            numberCounter++;


        }
        tempNumber = number;
        while (tempNumber != 0) {
            basPow = 1;
            for (int i = 1; i <= numberCounter; i++) {

                basSayiDeg = tempNumber % 10;
                basPow *= basSayiDeg;


            } totalBasDegeri+=basSayiDeg;
            tempNumber /= 10;
            result += basPow;

        }
        if (result == number) {

            System.out.println("Girilen " +number+" Sayisi Armstrong Bir Sayidir.");
        } else {
            System.out.println("Girilen " +number+" Sayisi 'Armstrong' Bir Sayi Degildir");
        }

        System.out.println("Toplam Basamak Sayi Degeri: "+totalBasDegeri);


    }


}
