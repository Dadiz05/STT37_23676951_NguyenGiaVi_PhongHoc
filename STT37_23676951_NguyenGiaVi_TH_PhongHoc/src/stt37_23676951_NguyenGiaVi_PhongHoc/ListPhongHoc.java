package stt37_23676951_NguyenGiaVi_PhongHoc;

public class ListPhongHoc {
    private PhongHoc[] dsP; 
    private int count; 

    public ListPhongHoc() {
        this.dsP = new PhongHoc[10]; 
        this.count = 0;
    }

    public void themPhongHoc(PhongHoc phong) {        
        for (int i = 0; i < count; i++) {
            if (dsP[i].getMaPhong().equals(phong.getMaPhong())) {
                System.out.println("Phong hoc da ton tai!");
                return;
            }
        }
        dsP[count++] = phong;
    }

    

    public PhongHoc timPhongHoc(String maPhong) {
        for (int i = 0; i < count; i++) {
            if (dsP[i].getMaPhong().equals(maPhong)) {
                return dsP[i];
            }
        }
        return null;
    }

    public PhongHoc[] layDanhSachDatChuan() {
        PhongHoc[] phongDatChuan = new PhongHoc[count];
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (dsP[i].datChuan()) {
                phongDatChuan[index++] = dsP[i];
            }
        }
        PhongHoc[] result = new PhongHoc[index];
        System.arraycopy(phongDatChuan, 0, result, 0, index);
        return result;
    }

    public void sapXepTheoDienTich() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (dsP[j].getDienTich() < dsP[j + 1].getDienTich()) {
                    PhongHoc temp = dsP[j];
                    dsP[j] = dsP[j + 1];
                    dsP[j + 1] = temp;
                }
            }
        }
    }

    public void sapXepTheoSoBongDen() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (dsP[j].getSoBongDen() > dsP[j + 1].getSoBongDen()) {
                    PhongHoc temp = dsP[j];
                    dsP[j] = dsP[j + 1];
                    dsP[j + 1] = temp;
                }
            }
        }
    }

    public void capNhatSoMayTinh(String maPhong, int soMayTinh) {
        PhongHoc phong = timPhongHoc(maPhong);
        if (phong instanceof PhongThucHanh) {
            ((PhongThucHanh) phong).setSoMayTinh(soMayTinh);
            System.out.println("Cap nhat so may tinh thanh cong!");
        } else {
            System.out.println("Phong khong phai la phong thuc hanh!");
        }
    }

    public void xoaPhongHoc(String maPhong) {
        for (int i = 0; i < count; i++) {
            if (dsP[i].getMaPhong().equals(maPhong)) {
                for (int j = i; j < count - 1; j++) {
                    dsP[j] = dsP[j + 1];
                }
                dsP[--count] = null; 
                System.out.println("Xoa phong hoc thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay phong hoc!");
    }

    public int getTongSoPhong() {
        return count;
    }

    public PhongThucHanh[] layPhongThucHanh60() {
        PhongThucHanh[] pTH60 = new PhongThucHanh[count];
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (dsP[i] instanceof PhongThucHanh && ((PhongThucHanh) dsP[i]).getSoMayTinh() == 60) {
                pTH60[index++] = (PhongThucHanh) dsP[i];
            }
        }
        PhongThucHanh[] result = new PhongThucHanh[index];
        System.arraycopy(pTH60, 0, result, 0, index);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(dsP[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
