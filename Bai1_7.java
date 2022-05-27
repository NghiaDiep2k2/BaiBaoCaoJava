import java.util.Scanner;;

public class Bai1_7{
    public static void main(String[] args){
        String Chuoi;
		String mang[];
		mang = new String[]{"Nghia","long","Hoan","nghia","trung","Nhan", "Nghia","Manh","toan"};
        Scanner scanner = new Scanner(System.in);

		int Count=0;
		for (int i = 0; i < mang.length; i++) {
			if(mang[i].charAt(0)<91){
				Count++;
			}
		}
		System.out.println("So chuoi co ki tu dau tien duoc viet hoa trong mang la: "+Count);

        System.out.print("Nhap vao 1 chuoi bat ki: ");
		Chuoi = scanner.nextLine();
		for (int i = 0; i < mang.length; i++) {
			if(mang[i].equals(Chuoi)==true){
				System.out.println("Vi tri xuat hien lan thu 2 cua mot chuoi trong mang: "+i);
			}	
		}
		
        System.out.println("Cac chuoi co chua 1 chuoi cho truoc: ");
		for (int i = 0; i < mang.length; i++){			
			if(mang[i].contains(Chuoi)==true){
				System.out.println(mang[i]);
			}
		}
        scanner.close();
	}
}
