import java.util.Scanner;

public class TuLanh extends ThietBi{
	private boolean inverter;
	public TuLanh() {
		// TODO Auto-generated constructor stub
		super(); 
	}
	public TuLanh(boolean inverter) {
		super();
		this.inverter = inverter;
	}
	
//	phuong thuc nhap thong tin cho tu lanh
	public void nhap() {
		super.nhap(); //goi toi phuong thuc nhap cua lop cha
		Scanner scanner= new Scanner(System.in);
		System.out.println("Tu lanh co inverter (true/false): ");
		this.inverter= scanner.nextBoolean();
	}
//	phuong thuc xuat thong tin cho tu lanh
	public void xuat() {
		super.xuat();
		System.out.println(", inverter: "+ this.inverter);
	}
	
//	getter va setter
	public boolean isInverter() {
		return inverter;
	}
	public void setInverter(boolean inverter) {
		this.inverter = inverter;
	}
	
	
}
