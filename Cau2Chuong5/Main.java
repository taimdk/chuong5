package cau2chuong5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn=new HinhChuNhat();
        System.out.print("Nhap cd:");
        Scanner sc=new Scanner(System.in);
        hcn.setCd(sc.nextFloat());
        System.out.print("Nhap cr:");
        hcn.setCr(sc.nextFloat());
        System.out.println("Dien tich= "+hcn.dientich());
        HinhTron ht=new HinhTron();
        System.out.print("Nhap r:");
        ht.setR(sc.nextFloat());
        System.out.println("Dien tich="+ht.dientich());
    }
}