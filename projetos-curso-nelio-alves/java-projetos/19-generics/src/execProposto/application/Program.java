package execProposto.application;

import java.util.InputMismatchException;
import java.util.Scanner;

import execProposto.entities.User;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User teacher = new User();
		
		
		try {
			System.out.print("How many students for course A? ");
			int qntdA = sc.nextInt();
			for(int i = 0; i < qntdA; i++) {
			int idStudent = sc.nextInt();
			teacher.getIdStudents().add(idStudent);
			}
			System.out.print("How many students for course B? ");
			int qntdB = sc.nextInt();
			for(int i = 0; i < qntdB; i++) {
			int idStudent = sc.nextInt();
			teacher.getIdStudents().add(idStudent);
			}
			System.out.print("How many students for course C? ");
			int qntdC = sc.nextInt();
			for(int i = 0; i < qntdC; i++) {
			int idStudent = sc.nextInt();
			teacher.getIdStudents().add(idStudent);
			}
			
			System.out.println("Total students " + teacher.getIdStudents().size());
			
		} catch (InputMismatchException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}


