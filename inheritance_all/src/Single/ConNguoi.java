package Single;

public class ConNguoi {
	// 2 thuoc tinh
	protected String ten;
	protected int NamSinh;
	// constructor co tham so
	public ConNguoi(String ten,int namsinh) {
		this.ten = ten;
		this.NamSinh = namsinh;
	}
	// constructor khong co tham so
	public ConNguoi() {
		
	}
	// ham get 
	public String getTen() {
		return this.ten;
	}
	public int getNamSinh() {
		return this.NamSinh;
	}
	// ham set 
	public void setNamSinh(int a) {
		this.NamSinh = a;
	}
	public void setTen(String a) {
		this.ten =a;
	}
	// co 2 phuong thuc
	public void an() {
		System.out.println("mam mam");
	}
	public void ngu() {
		System.out.println("kho kho ");
	}
}
