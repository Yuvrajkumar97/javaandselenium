package pkg_1;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		System.out.println("TAble of no");
		Scanner A = new Scanner(System.in);
    int Num= A.nextInt();		
		for (int i=1;i<=10;i++) {
			System.out.println("Output of table" +    Num*i );
		}

	}

}
