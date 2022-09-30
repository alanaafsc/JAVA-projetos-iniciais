package application;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class ProgramPensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int N = sc.nextInt();
		Rent[] rooms = new Rent[10];
		
		for(int i = 0; i<N; i++) {
			System.out.println();
			System.out.printf("Rent #%d: %n", i+1);
			System.out.println("Name: ");
			sc.nextLine();
		
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			rooms[room] = new Rent(name, email);
			
		}
		System.out.println();
		
		System.out.println("Busy rooms: ");
		for (int j = 0; j<rooms.length;j++) {
			if(rooms[j]!= null) {
				System.out.println(j + ": " + rooms[j]);
			}
		}
		sc.close();
	}

}
