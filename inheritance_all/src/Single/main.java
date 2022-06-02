package Single;

public class main {
public static void main(String[] args) {
	HocSinh hs = new HocSinh("nguyen  van b ", 2990, "hutech", "21dthb2");
	ConNguoi cn = new ConNguoi("nguyen van av ", 2000);
	hs.LamBaiTap();
	hs.an();
	hs.ngu();
	hs.getTen();
	hs.getNamSinh();
	System.out.println(hs.getTen());
	System.out.println(hs.getNamSinh());
	
}
}
