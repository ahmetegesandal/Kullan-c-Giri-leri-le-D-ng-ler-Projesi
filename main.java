package odev;

import java.util.Scanner;
import java.util.ArrayList;

public class odev {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] inputs = new String[10]; // kullanının girdiği kadar uzunluktaki bir dizi oluşturmak için arraylist kullanımı daha mantıklıdır.
		int index = 0;
		boolean devam = true;

		while (devam) {
			System.out.print("Devam etmek için 'd', bitirmek için 'b' yazın: ");
			String secim = scanner.nextLine();

			if (secim.equalsIgnoreCase("d") && index < inputs.length) {
				System.out.print("Bir değer giriniz: ");
				String input = scanner.nextLine();
				inputs[index] = input;
				index++;

			} else if (secim.equalsIgnoreCase("b") || index >= inputs.length) {
				devam = false;
			} else {
				System.out.println("Geçersiz giriş! Lütfen 'd' veya 'b' yazın.");
			}
		}

		// For döngüsü ile yazdırma
		System.out.println("For Döngüsü ile Yazdırma:");
		for (int i = 0; i < index; i++) {
			System.out.println(inputs[i]);
		}

		// While döngüsü ile yazdırma
		System.out.println("While Döngüsü ile Yazdırma:");
		{
			int i = 0;
			while (i < index) {
				System.out.println(inputs[i]);
				i++;
			}
		}

		// Foreach döngüsü ile yazdırma
		System.out.println("Foreach Döngüsü ile Yazdırma:");
		for (String i : inputs) {
			System.out.println(i);
		}

	}

}
