package matrizes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProgramMatrizes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[][] mat = new int[M][N];
		
		for(int i = 0; i<M; i++) {
			for(int j=0; j<N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int number = sc.nextInt();
		List<Integer> index = new ArrayList<>();
		
		for(int k = 0; k<M; k++) {
			for(int y = 0; y<N; y++) {
				if(mat[k][y] == number) {
					index.add(k);
					index.add(y);
				}
			}
		}
		
		int lengthList = index.size()/2;
		for(int r = 0; r<lengthList+1; r = r + 2) {
			int indexLinha = index.get(r);
			int indexColuna = index.get(r+1);
			
			int left = 0;
			int right = 0;
			int down = 0;
			int up = 0;
			System.out.printf("Position %d,%d: %n", indexLinha, indexColuna);
			
			if(indexColuna - 1 >= 0) {
				left = mat[indexLinha][indexColuna-1];
			}
			if(indexColuna+1 < N) {
				right = mat[indexLinha][indexColuna+1];
			}
			if(indexLinha+1 < M) {
				down = mat[indexLinha+1][indexColuna];
			}
			if(indexLinha - 1 >= 0) {
				up = mat[indexLinha-1][indexColuna];
			}
			if(left != 0) {
			System.out.println("Left: " +left);
			}
			if(right != 0) {
				System.out.println("Right: " +right);
			}
			if(up != 0) {
				System.out.println("Up: " +up);
			}
			if(down != 0) {
				System.out.println("Down: " +down);
			}
		}
		
		
		sc.close();
	}

}
