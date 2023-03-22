package cau2chuong5;

public class HinhChuNhat extends Hinh {

    private float cd;
    private float cr;

    public HinhChuNhat(){
    }
    public HinhChuNhat(float cd,float cr) {
        
    }

    public float getCd() {
        return cd;
    }

    public void setCd(float cd) {
        this.cd = cd;
    }

    public float getCr() {
        return cr;
    }

    public void setCr(float cr) {
        this.cr = cr;
    }
    

    @Override
    public String toString() {
        return "HinhChuNhat{" + "cd=" + cd + ", cr=" + cr + '}';
    }

    @Override
    public double dientich() {
        return (cd+cr)*2;
    }
}
