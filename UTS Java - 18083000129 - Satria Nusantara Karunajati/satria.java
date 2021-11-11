import.java.util.Scanner;
public class satria {
	public static void main(String[]args){
		String barang[]= new String[];
		int harga[]= new int[]
		Scanner br1= new Scanner(System.in);
		Scanner hr1= new Scanner(System.in);

		System.out.printIn();
		System.out.printIn("|=======================================|");
		System.out.printIn("|                SATRIA MART            |");
		System.out.printIn("|					KASIR				|");
		System.out.printIn("|=======================================|");
		System.out.printIn();

		System.out.print("Silahkan Masukan Nama Barang Pertama : ");
		barang[0]=br1.nextLine();
		System.out.print("Silahkan Masukan Harga Barang Pertama :");
		harga[0]=hr1.nextInt();
		System.out.print("Silahkan Masukan Nama Barang Kedua :");
		barang[1]=br1.nextLine();
		System.out.print("Silahkan Masukan Harga Barang Kedua :");
		harga[1]=hr1.nextInt();
		System.out.print("Silahkan Masukan Nama Barang Ketiga :");
		barang[2]=br1.nextLine();
		System.out.print("Silahkan Masukan Harga Barang Ketiga :");
		harga[2]=hr1.nextInt();

		total=harga[0] + harga[1] + harga [2]

		System.out.printIn("		List Barang						Harga barang		");
		System.out.printIn("		"+barang[0]+"					Rp. "+harga[0]);
		System.out.printIn("		"+barang[1]+"					Rp. "+harga[1]);
		System.out.printIn("		"+barang[2]+"					Rp. "+harga[2]);
		System.out.printIn("			Total				Rp. "+total[0]);

		System.out.printIn("Masukan Pembayaran :");
		int bayar;
		System.out.printIn("Kembalian : Rp. "+(bayar-total));
		System.out.printIn();

	}
}
