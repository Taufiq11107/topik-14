import java.util.Scanner;

public class Fibonacci{
	public static void main(String[] args){
		//Scanner untuk input user
		//meminta input dari user kemudian mencetak nilai fibonaccinya
		Scanner input = new Scanner (System.in);
		int angka = input.nextInt();
		
		System.out.println(fibonacci(angka));
	}
	private static int fibonacci (int angka){
		if ((angka == 0)||(angka==1))
			return angka;//base case
			//output tetap 0 dan 1 karena fibonacci merupakan penjumlahan 2 suku sebelumnya
		else //recursion step
			return fibonacci(angka-1) + fibonacci(angka-2);
		//rumus fibonacci, hasil bilangan fibonacci = 0 1 1 2 3 5 8 13 21... n
		//angka input kita -1 dan -2, kemudian kedua angka itu kita jumlahkan
	
	}	
}