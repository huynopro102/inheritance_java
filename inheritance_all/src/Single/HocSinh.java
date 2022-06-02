package Single;

public class HocSinh extends ConNguoi { 
	// hs dc inheritance phuong thuc va thuoc tinh tu class ConNguoi
	//  co 2 thuc tinh
	private String TenTruong;
	private String TenLop;
	// constructor
	public HocSinh(String ten, int namsinh, String tenTruong, String tenLop) {
		super(ten, namsinh);
		this.TenTruong = tenTruong;
		this.TenLop = tenLop;
	}
	// ham get
	public String getTenTruong() {
		return TenTruong;
	}
	public String getTenLop() {
		return TenLop;
	}
	// ham set
	public void setTenTruong(String tenTruong) {
		TenTruong = tenTruong;
	}
	public void setTenLop(String tenLop) {
		TenLop = tenLop;
	}
	// 1 phuong thuc
	public void LamBaiTap() {
		System.out.println("lam bai tap ");
	}
}
