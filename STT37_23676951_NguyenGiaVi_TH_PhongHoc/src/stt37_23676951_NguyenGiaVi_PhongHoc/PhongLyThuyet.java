package stt37_23676951_NguyenGiaVi_PhongHoc;

public class PhongLyThuyet extends PhongHoc {
	private boolean coMayChieu;

	public PhongLyThuyet(String maPhong, String dayNha, float dienTich, int soBongDen, boolean coMayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.coMayChieu = coMayChieu;
	}

	public boolean isCoMayChieu() {
		return coMayChieu;
	}

	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}

	@Override
	public String toString() {
	String mayChieu = (coMayChieu)?"Co may chieu": "Khong co may chieu";
		return super.toString() + String.format("%10s", mayChieu);
	}
	
	public boolean datChuan() {
		return (duAnhSang() && coMayChieu);
	}
	
}
