import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyThietBI {

	ArrayList<ThietBi> tBList= new ArrayList<ThietBi>();// tao danh sach thiet bi luu cac doi tuong
	
	public QuanLyThietBI() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("Cau 2: Nhap, Xuat thong tin.");
		nhap();
		xuat();
		System.out.println("\nCau 3:");
		isTV();
		System.out.println("\nCau 4:");
		isTuLanh();
		System.out.println("\nCau 5:");
		System.out.println("Tong gia tri hoa don= "+ this.hoaDon()+" VND");
		System.out.println("\nCau 6:");
		maxPrice();
	}
//	phuong thuc tao cac doi tuong cua cac class
	public void nhap() {
//		tao 3 doi tuong
		ThietBi tv= new TV();
		tBList.add(tv); // them doi tuong vao danh sach
		ThietBi tuLanh= new TuLanh();
		tBList.add(tuLanh);
		ThietBi loViSong= new LoViSong();
		tBList.add(loViSong);
		
		System.out.println("Nhap thong tin cho TV");
		tv.nhap();
		System.out.println("Nhap thong tin cho Tu Lanh");
		tuLanh.nhap();
		System.out.println("Nhap thong tin cho Lo vi song");
		loViSong.nhap();
		
	}
	
	public void xuat() {
		int size= tBList.size(); //lay kich thuoc cua danh sach
//		hien thi thong tin tung san pham
		System.out.println("\nDanh sach san pham:");
		for (int i = 0; i < size; i++) {
			tBList.get(i).xuat();;
		}
	}
	
//	phuong thuc kiem tra mot san pham la TV hay khong
	public void isTV() {
		int size= tBList.size();
		int check=0;
//		duyet qua danh sach, in ra san pham la TV
		
		System.out.println("San pham la TV trong danh sach: ");
		for (int i = 0; i < size; i++) {
			if(tBList.get(i) instanceof TV) {
				tBList.get(i).xuat();
				check=1;
			}
		}
		if(check==0) {
			System.out.println("Khong co san pham TV phu hop voi yeu cau!");
		}
	}
	
	public void isTuLanh() {
		int size= tBList.size();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Nhap ten hang tu lanh: ");
		String hang=scanner.nextLine(); //nhap vao ten hang tu lanh
		int check=0;
		//duyet qua cac phan tu cua danh sach
		//neu phan tu do la 1 the hien cua class TuLanh
		//va thuong hieu (hang) cua san pham do giong voi hang nhap vao thi in thong tin san pham do ra
		for (int i = 0; i < size; i++) {
			if(tBList.get(i) instanceof TuLanh) {
				if(tBList.get(i).getThuongHieu().equals(hang)) {
					tBList.get(i).xuat();
					check=1;
				}
			}
		}
		if(check==0) {
			System.out.println("Khong co san pham tu lanh phu hop voi yeu cau!");
		}
	}
	
//	phuong thuc tinh hoa don phieu nhap
	public float hoaDon() {
		float total=0;
		int size= tBList.size();
		for (int i = 0; i < size; i++) {
			total+= tBList.get(i).tinhTien();	//tinh tien tung san pham roi cong vao total
		}
		return total;
	}
//	phuong thuc tim san pham co gia tri cao nhat
	
	public void maxPrice() {
		int index=0;
		int size=tBList.size();
//		duyet qua cac phan tu cua mang, index chua vi tri cua san pham cao nhat hien tai
//		neu san pham thu i dat hon san pham cao nhat hien tai thi gan index =i;
		for (int i = 1; i < size-1; i++) {
			if(tBList.get(i).tinhTien() > tBList.get(index).tinhTien()) {
				index=i;
			}
		}
		System.out.println("San pham co gia tri lon nhat trong phieu nhap:" );
		tBList.get(index).xuat();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new QuanLyThietBI();
		
	}
	
//	

}
