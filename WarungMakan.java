package koding;

import java.util.Scanner;

public class WarungMakan {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				int pilihan,jumlah,total;
	
				Scanner input = new Scanner(System.in);
				System.out.println("Warung Makan");
				System.out.println("Rindu Nasi");
				System.out.println("---------------");
				System.out.println("1. Nasi Goreng");
				System.out.println("2. Nasi Uduk");
				System.out.println("3. Nasi Kuning");
				System.out.println("4. Nasi Kucing");
				System.out.println("5. Nasi Orak-arik");
				System.out.println("6. Nasi Magelangan");
				System.out.println("7. Keluar");
				System.out.println("----------------");
				System.out.print("Pilih [1-7] :");
				pilihan = input.nextInt();
				
				
				switch(pilihan) {
				
				case 1 :
					System.out.print("Nasi Goreng, beli berapa porsi =");
					jumlah = input.nextInt();
					total = jumlah*10000;
					System.out.println("Nasi Goreng yang anda pesan seharga = Rp. " + total);
					break;
					
				case 2 :
					System.out.print("Nasi Uduk, beli berapa porsi =");
					jumlah = input.nextInt();
					total = jumlah*8000;
					System.out.println("Nasi Uduk yang anda pesan seharga = Rp. " + total);
					break;
					
				case 3 :
					System.out.print("Nasi Kuning, beli berapa porsi =");
					jumlah = input.nextInt();
					total = jumlah*9500;
					System.out.println("Nasi Kuning yang anda pesan seharga = Rp. " + total);
					break;
					
				case 4 :
					System.out.print("Nasi Kucing, beli berapa porsi =");
					jumlah = input.nextInt();
					total = jumlah*2000;
					System.out.println("Nasi Kucing yang anda pesan seharga = Rp. " + total);
					break;
					
				case 5 :
					System.out.print("Nasi Orak-Arik, beli berapa porsi =");
					jumlah = input.nextInt();
					total = jumlah*9000;
					System.out.println("Nasi Orak-Arik yang anda pesan seharga = Rp. " + total);
					break;
					
				case 6 :
					System.out.print("Nasi Magelangan, beli berapa porsi =");
					jumlah = input.nextInt();
					total = jumlah*12000;
					System.out.println("Nasi Magelangan yang anda pesan seharga = Rp. " + total);
					break;
					
				case 7 :
					System.out.print("Pesanan Selesai, Sistem Keluar");
					System.exit(0);
					
				}
					
					
					do {
						System.out.print("Pilihan lain [1-7] : ");
						pilihan = input.nextInt();
						
						switch(pilihan) {
						
						case 1 :
							System.out.print("Nasi Goreng, beli berapa porsi =");
							jumlah = input.nextInt();
							total = jumlah*10000;
							System.out.println("Nasi Goreng yang anda pesan seharga = Rp. " + total);
							break;
							
						case 2 :
							System.out.print("Nasi Uduk, beli berapa porsi =");
							jumlah = input.nextInt();
							total = jumlah*8000;
							System.out.println("Nasi Uduk yang anda pesan seharga = Rp. " + total);
							break;
							
						case 3 :
							System.out.print("Nasi Kuning, beli berapa porsi =");
							jumlah = input.nextInt();
							total = jumlah*9500;
							System.out.println("Nasi Kuning yang anda pesan seharga = Rp. " + total);
							break;
							
						case 4 :
							System.out.print("Nasi Kucing, beli berapa porsi =");
							jumlah = input.nextInt();
							total = jumlah*2000;
							System.out.println("Nasi Kucing yang anda pesan seharga = Rp. " + total);
							break;
							
						case 5 :
							System.out.print("Nasi Orak-Arik, beli berapa porsi =");
							jumlah = input.nextInt();
							total = jumlah*9000;
							System.out.println("Nasi Orak-Arik yang anda pesan seharga = Rp. " + total);
							break;
							
						case 6 :
							System.out.print("Nasi Magelangan, beli berapa porsi =");
							jumlah = input.nextInt();
							total = jumlah*12000;
							System.out.println("Nasi Magelangan yang anda pesan seharga = Rp. " + total);
							break;
							
						case 7 :
							System.out.print("Pesanan Selesai, Sistem Keluar");
							System.exit(0);
						
						}

												
					
					} while (pilihan < 7 && pilihan >= 1 );
					
					
	}
	
}
			

		
				



