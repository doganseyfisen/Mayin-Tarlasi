import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int row, column;
		System.out.println("<<< Mayın Tarlası >>>");
		System.out.println("Oynamak istediğiniz boyutları giriniz.");
		System.out.print("Satır sayısı= ");
		row = input.nextInt();
		System.out.print("Sütun sayısı= ");
		column = input.nextInt();
		
		MineSweeper mayin = new MineSweeper(row, column);
		mayin.run();
	}

}
