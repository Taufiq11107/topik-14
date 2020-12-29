import java.util.Scanner;

public class Jurnal02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int banyakCakram = input.nextInt();
		//panggil method rekursifnya
		menaraHanoi(banyakCakram, 'A', 'C', 'B');
	}
	//method rekursif untuk perpindahan setiap cakram
	private static void menaraHanoi(int cakram, char kiri, char kanan, char tengah){
		if (cakram == 1) {//base case, untuk memindahkan 1 cakram dari kiri ke kanan
		    System.out.println("Cakram " + cakram + " dipindahkan dari " + kiri + " ke " + kanan);
		} else {
		    menaraHanoi(cakram - 1, kiri, tengah, kanan);//recursion step
			System.out.println("Cakram " + cakram + " dipindahkan dari " + kiri + " ke " + kanan);
			menaraHanoi(cakram - 1, tengah, kanan, kiri);
		}
	}
}