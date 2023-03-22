package cau2chuong5;

public class HinhTron extends Hinh {
    private double r;
    public HinhTron(){
    }
    public HinhTron(double r){
        r=0;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "HinhTron{" + "r=" + r + '}';
    }
    @Override
    public double dientich(){
        return 3.14*r;
    }
}