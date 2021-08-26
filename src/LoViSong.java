import java.util.Scanner;

public class LoViSong extends ThietBi{
	private boolean nuong; //chuc nang nuong
	
	public LoViSong() {
		// TODO Auto-generated constructor stub
		super();
	}

	public LoViSong(boolean nuong) {
		super();
		this.nuong = nuong;
	}
//	phuong thuc nhap thong tin
	public void nhap() {
		super.nhap();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lo vi song co chuc nang nuong khong? (true/false)");
		this.nuong= scanner.nextBoolean();
	}
	
//	phuong thuc xuat thong tin
	public void xuat() {
		super.xuat();
		System.out.println(", chuc nang nuong: "+ this.nuong);
	}

	public boolean isNuong() {
		return nuong;
	}

	public void setNuong(boolean nuong) {
		this.nuong = nuong;
	}
	
	

}
