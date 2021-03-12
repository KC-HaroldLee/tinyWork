package complement_calc;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {

		// input
		int a = 215;
		int b = 15;

		int[] sq = { 1, 2, 4, 8, 16, 32, 64, 128 };
		int[] sqT = { 1, 2, 4, 8, 16, 32, 64, 128 };

		int[] aBin = new int[8];
		int[] bBin = new int[8];

		// to bin

		aBin[0] = a / 128; // 2^7
		aBin[1] = (a - aBin[0] * 128) / 64; // 2^6
		aBin[2] = (a - aBin[0] * 128 - aBin[1] * 64) / 32; // 2^5
		aBin[3] = (a - aBin[0] * 128 - aBin[1] * 64 - aBin[2] * 32) / 16; // 2^4
		aBin[4] = (a - aBin[0] * 128 - aBin[1] * 64 - aBin[2] * 32 - (aBin[3]) * 16) / 8; // 2^3
		aBin[5] = (a - aBin[0] * 128 - aBin[1] * 64 - aBin[2] * 32 - (aBin[3]) * 16 - (aBin[4]) * 8) / 4; // 2^2
		aBin[6] = (a - aBin[0] * 128 - aBin[1] * 64 - aBin[2] * 32 - (aBin[3]) * 16 - (aBin[4]) * 8 - (aBin[5]) * 4)
				/ 2; // 2^1
		aBin[7] = a % 2; // 2^0

		System.out.println(Arrays.toString(aBin));

		bBin[0] = b / 128; // 2^7
		bBin[1] = (b - bBin[0] * 128) / 64; // 2^6
		bBin[2] = (b - bBin[0] * 128 - bBin[1] * 64) / 32; // 2^5
		bBin[3] = (b - bBin[0] * 128 - bBin[1] * 64 - bBin[2] * 32) / 16; // 2^4
		bBin[4] = (b - bBin[0] * 128 - bBin[1] * 64 - bBin[2] * 32 - (bBin[3]) * 16) / 8; // 2^3
		bBin[5] = (b - bBin[0] * 128 - bBin[1] * 64 - bBin[2] * 32 - (bBin[3]) * 16 - (bBin[4]) * 8) / 4; // 2^2
		bBin[6] = (b - bBin[0] * 128 - bBin[1] * 64 - bBin[2] * 32 - (bBin[3]) * 16 - (bBin[4]) * 8 - (bBin[5]) * 4)
				/ 2; // 2^1
		bBin[7] = b % 2; // 2^0

		System.out.println(Arrays.toString(bBin));

		// plus
		int[] cBin = new int[8];
		for (int i = 7; i >= 0; i--) {
			cBin[i] = cBin[i] + aBin[i] + bBin[i];
			if (cBin[i] == 2) {
				cBin[i] = 0;
				cBin[i - 1] = 1;

			}
			if (cBin[i] == 3) {
				cBin[i] = 1;
				cBin[i - 1] = 1;

			}
		}

		System.out.println(Arrays.toString(cBin));

		// to dex
		int c = 0;
		int k = 1;

		for (int i = 7; i >= 0; i--) {
			if (cBin[i] == 1) {
				c = c + k;
			}
			k *= 2;
		}
		System.out.println(c);
	}
}
