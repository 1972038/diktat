import java.util.Scanner;
public class NO1 {
public static void main(String[] args){
	int deposit,lama  ;
	float bunga ,bd , akhir;
	Scanner input = new Scanner(System.in);
	System.out.print("Masukkan uang yang hendak didepositokan: ");
	deposit = input.nextInt();
	System.out.print("Masukkan lama deposito (tahun): ");
	lama = input.nextInt();
	System.out.print("Masukkan bunga deposito: ");
	bunga = input.nextFloat();
	bd= (bunga/100) * deposit * lama;
	akhir= deposit+bd;
	System.out.println("saldo akhir: "+ (int) akhir);
	
	
}
}
