import java.util.Scanner;

public class Jurnal01{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int angka1 = input.nextInt();
		int angka2 = input.nextInt();
		//panggil method rekursif
		System.out.println(cariFPB(angka1,angka2));
	}	
	//untuk mencari, FPB angka yang besar dibagi "Modulus" angka yang kecil
	//method mencari FPB
	static int cariFPB (int angka1, int angka2)
	{
		if(angka2 <= angka1 && angka1 % angka2 == 0){ //test for base case
			return angka2;// base case
		}else if(angka1 < angka2){//recursion step
			return cariFPB(angka2, angka1);//jika angka1 lebih kecil, maka dibalik
		}else{ //recursion step
			return cariFPB(angka2, angka1 % angka2);
		}
		
	}
}