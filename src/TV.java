import java.util.Scanner;

public class TV extends ThietBi {
	private String loai;	
	public TV() {
		// TODO Auto-generated constructor stub
		super(); //goi toi constructor mac dinh cua lop cha
	}
	public TV(String loai) {
		super();
		this.loai = loai;
	}
//	phuong thuc nhap thong tin TV
	public void nhap() {
		super.nhap(); //goi toi phuong thuc nhap cua lop cha
		Scanner scanner= new Scanner(System.in);
		System.out.println("Nhap loai TV: ");
		this.loai= scanner.nextLine();
	}
//	phuong thuc hien thi thong tin TV
	public void xuat() {
		super.xuat(); // goi toi phuong thc lop cha
		System.out.println(", Loai: "+ this.loai);
	}
	
//	getter va setter
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	
	
}
