package stt37_23676951_NguyenGiaVi_PhongHoc;

import java.util.Scanner;

public class TestPhongHoc {
    public static void main(String[] args) {
        ListPhongHoc list = new ListPhongHoc();

        list.themPhongHoc(new PhongLyThuyet("V10.01", "V", 80, 10, true));
        list.themPhongHoc(new PhongThucHanh("H7.01", "H", 60, 12, 30)); 
        list.themPhongHoc(new PhongThiNghiem("F1.01", "F", 100, 8, "Hoa Hoc", 40, true));
        list.themPhongHoc(new PhongThucHanh("B1.12", "B", 90, 14, 60)); 

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Xuat danh sach phong hoc");
            System.out.println("2. Tim phong hoc");
            System.out.println("3. Danh sach phong dat chuan");
            System.out.println("4. Tong so phong hoc");
            System.out.println("5. Sap xep theo dien tich");
            System.out.println("6. Sap xep theo so bong den");
            System.out.println("7. Cap nhat may tinh cho phong thuc hanh");
            System.out.println("8. In danh sach phong hoc co may chieu");
            System.out.println("9. Xoa phong hoc theo ma phong");
            System.out.println("10. In danh sach phong thuc hanh co 60 may");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println(list);
                    break;
                case 2:
                    System.out.print("Nhap ma phong: ");
                    String mp = sc.nextLine();
                    PhongHoc p = list.timPhongHoc(mp);
                    if (p != null) {
                        System.out.println(p);
                    } else {
                        System.out.println("Khong tim thay phong hoc!");
                    }
                    break;
                case 3:
                    PhongHoc[] pDatChuan = list.layDanhSachDatChuan();
                    for (PhongHoc room : pDatChuan) {
                        System.out.println(room);
                    }
                    break;
                case 4:
                    System.out.println("Tong so phong hoc: " + list.getTongSoPhong());
                    break;
                case 5:
                    list.sapXepTheoDienTich();
                    System.out.println("Da sap xep theo dien tich.");
                    break;
                case 6:
                    list.sapXepTheoSoBongDen();
                    System.out.println("Da sap xep theo so bong den.");
                    break;
                case 7:
                    System.out.print("Nhap ma phong thuc hanh: ");
                    String mpTH = sc.nextLine();
                    System.out.print("Nhap so may tinh moi: ");
                    int smt = sc.nextInt();
                    list.capNhatSoMayTinh(mpTH, smt);
                    break;
                case 8:
                    System.out.println("Danh sach phong co may chieu:");
                    PhongHoc[] stdRooms = list.layDanhSachDatChuan();
                    for (PhongHoc room : stdRooms) {
                        if (room instanceof PhongLyThuyet && ((PhongLyThuyet) room).isCoMayChieu()) {
                            System.out.println(room);
                        }
                    }
                    break;
                case 9:
                    System.out.print("Nhap ma phong de xoa: ");
                    String mpXoa = sc.nextLine();
                    list.xoaPhongHoc(mpXoa);
                    break;
                case 10:
                    PhongThucHanh[] pTH60 = list.layPhongThucHanh60();
                    for (PhongThucHanh room : pTH60) {
                        System.out.println(room);
                    }
                    break;
                case 0:
                    System.out.println("Thoat!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 0);

        sc.close();
    }
}