package stt37_23676951_NguyenGiaVi_PhongHoc;

public class PhongThucHanh extends PhongHoc {
	private int soMayTinh;

	public PhongThucHanh(String maPhong, String dayNha, float dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("So may tinh=%d", soMayTinh);
	}
	
	
	public boolean datChuan() {
		return (duAnhSang() && (dienTich/soMayTinh >= 1.5f));
	}

}
