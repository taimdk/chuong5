package Cau1Chuong5;

public class Xe {
    private String hotentaixe;
    private int soxe;
    private double doanhthu;

    public String getHotentaixe() {
        return hotentaixe;
    }

    public void setHotentaixe(String hotentaixe) {
        this.hotentaixe = hotentaixe;
    }

    public int getSoxe() {
        return soxe;
    }

    public void setSoxe(int soxe) {
        this.soxe = soxe;
    }   

    public double getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(double doanhthu) {
        this.doanhthu = doanhthu;
    }
    public void doanhthu(){
        
    }
    public void tongdoanhthucuatungloaixe(){
        System.out.println("Tong doanh thu cua tung loai xe la:");
    }
    public void tongdanhthucuatatca(){
        System.out.println("Tong doanh thu cua tat ca xe la: ");
    }
}