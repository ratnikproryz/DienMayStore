import java.util.Scanner;

public class ThietBi {
//	khai bao cac thuoc tinh
	private float chieuDai;
	private float chieuRong;
	private String thuongHieu;
	private float donGia;
	private int soLuong;
	
//	ham khoi tao mac dinh
	public ThietBi() {
		// TODO Auto-generated constructor stub
	}
// ham khoi tao co chua tham so
	public ThietBi(float chieuDai, float chieuRong, String thuongHieu, float donGia, int soLuong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
		this.thuongHieu = thuongHieu;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	
//	phuong thuc nhap thong tin cho objet
	public void nhap() {
		Scanner scanner= new Scanner(System.in); //dung scannner de nhap tu ban phim
		
		System.out.println("Nhap chieu dai:");
		this.chieuDai= Float.parseFloat(scanner.nextLine()); //chong troi lenh
		System.out.println("Nhap chieu rong: ");
		this.chieuRong= Float.parseFloat(scanner.nextLine());
		System.out.println("Nhap ten thuong hieu cua san pham:");
		this.thuongHieu= scanner.nextLine();
		System.out.println("Nhap don gia: ");
		this.donGia= Float.parseFloat(scanner.nextLine());
		System.out.println("Nhap so luong:");
		this.soLuong= Integer.parseInt(scanner.nextLine());
		
	}
//  phuong thuc hien thi thong tin cua object
	public void xuat() {
		String ketQua= "Chieu dai: "+ this.chieuDai + "m, chieu rong: "+this.chieuRong+"m, thuong hieu: "+this.thuongHieu+
				", don gia: "+this.donGia+"VND, so luong: "+this.soLuong+",gia tien: "+this.tinhTien()+"VND";
		System.out.print(ketQua);
	}
	
//	phuong thuc tinh tien: donGia*soLuong
	public float tinhTien() {
		return this.donGia*this.soLuong;
	}
	
//	xay dung cac getter, setter
	public float getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(float chieuDai) {
		this.chieuDai = chieuDai;
	}
	public float getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(float chieuRong) {
		this.chieuRong = chieuRong;
	}
	public String getThuongHieu() {
		return thuongHieu;
	}
	public void setThuongHieu(String thuongHieu) {
		this.thuongHieu = thuongHieu;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
}
