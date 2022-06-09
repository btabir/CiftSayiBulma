package Hesaplamalar;

import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi Giriniz");
        k=input.nextInt();


        for (int i=0; i<=k; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }



    }
}