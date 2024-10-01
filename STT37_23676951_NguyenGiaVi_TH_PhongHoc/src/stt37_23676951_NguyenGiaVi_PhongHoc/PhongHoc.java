package stt37_23676951_NguyenGiaVi_PhongHoc;

public abstract class PhongHoc {
	protected String maPhong, dayNha;
	protected float dienTich;
	protected int soBongDen;
	
	
	public PhongHoc(String maPhong, String dayNha, float dienTich, int soBongDen) {
		super();
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}


	public String getMaPhong() {
		return maPhong;
	}


	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}


	public String getDayNha() {
		return dayNha;
	}


	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}


	public float getDienTich() {
		return dienTich;
	}


	public void setDienTich(float dienTich) {
		this.dienTich = dienTich;
	}


	public int getSoBongDen() {
		return soBongDen;
	}


	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}


	@Override
	public String toString() {
		return "PhongHoc: maPhong=" + maPhong + ", dayNha=" + dayNha + ", dienTich=" + dienTich + ", soBongDen="
				+ soBongDen+ ", ";
	}
	
	protected boolean duAnhSang() {
        return (dienTich / soBongDen >= 10); 
    }


	protected abstract boolean datChuan();
	
	
	
	

}
