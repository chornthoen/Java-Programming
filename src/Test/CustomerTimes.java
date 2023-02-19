package Test;

public class CustomerTimes {
    private int h;
    private int mn;
    private int s;

    public void setH(int h) {
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public int getMn() {
        return mn;
    }

    public void setMn(int mn) {
        this.mn = mn;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public CustomerTimes() {
        h = 20;
        mn = 30;
        s = 39;
    }

    public CustomerTimes(int h, int mn, int s) {
        this.h = h;
        this.mn = mn;
        this.s = s;
    }
    public String toString(){
        return "\""+getH()+":"+getMn()+":"+getS()+"\"";
    }
}
