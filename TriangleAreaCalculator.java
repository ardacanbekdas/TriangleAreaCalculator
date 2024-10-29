package PatikaOdevlerVePratikler;

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("1. kenarı giriniz:");
        a = input.nextInt();

        System.out.print("2. kenarı giriniz:");
        b = input.nextInt();

        System.out.print("3. kenarı giriniz:");
        c = input.nextInt();

        double u;
        u = (a + b + c) / 2;

        double alan;
        alan = Math.sqrt(u *(u - a) * (u - b) * (u - c));
        System.out.println(alan);


    }
}

/*
Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/