package Cau1Chuong5;

public class Main {
    public static void main(String[] args) {
        Xe x= new Xe();
        x.tongdanhthucuatatca();
        x.tongdoanhthucuatungloaixe();
        XeNgoaiThanh x1=new XeNgoaiThanh();
        System.out.println("Xe ngoai thanh.");
        x1.doanhthu();
        XeNoiThanh x2= new XeNoiThanh();
        System.out.println("Xe noi thanh.");
        x2.doanhthu();
    }
}