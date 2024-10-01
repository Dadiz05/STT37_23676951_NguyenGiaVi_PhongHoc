package stt37_23676951_NguyenGiaVi_PhongHoc;

public class PhongThiNghiem extends PhongHoc {
	private String chuyenNganh;
	private int suaChua;
	private boolean coBonRua;
	public PhongThiNghiem(String maPhong, String dayNha, float dienTich, int soBongDen, String chuyenNganh, int suaChua,
			boolean coBonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = chuyenNganh;
		this.suaChua = suaChua;
		this.coBonRua = coBonRua;
	}
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	public int getSuaChua() {
		return suaChua;
	}
	public void setSuaChua(int suaChua) {
		this.suaChua = suaChua;
	}
	public boolean isCoBonRua() {
		return coBonRua;
	}
	public void setCoBonRua(boolean coBonRua) {
		this.coBonRua = coBonRua;
	}
	
	
	@Override
	public String toString() {
		String bonRua = (coBonRua)? "Co bon rua": "Khong co bon rua";
		return super.toString() + String.format("Chuyen nganh=%s, Suc chua=%d, %s", chuyenNganh, suaChua, bonRua);
	}
	
	public boolean datChuan() {
		return (duAnhSang() && coBonRua);
	}

}
