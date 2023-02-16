package Test;

public class CustomerTime {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        //loop
        if(hour>=0 && hour<=23){
            this.hour = hour;
        }else{
            System.out.println("Invalid hour!");
        }
    }

    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        if(minute>=0 && minute<=59){
            this.minute = minute;
        }else{
            System.out.println("Invalid minute!");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second>=0 && second<=59){
            this.second = second;
        }else{
            System.out.println("Invalid second!");
        }
    }

    public CustomerTime(){}
    public CustomerTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String nextSecond( int second){
        this.second = second;
        if(this.second == 59){
            this.second = 0;
            this.minute++;
            if(this.minute == 59){
                this.minute = 0;
                this.hour++;
                if(this.hour == 23){
                    this.hour = 0;
                }
            }
        }else{
            this.second++;
        }
        return this.hour+":"+this.minute+":"+this.second;
    }
    public String previousSecond(int second){
        this.second = second;
        if(this.second == 0){
            this.second = 59;
            this.minute--;
            if(this.minute == 0){
                this.minute = 59;
                this.hour--;
                if(this.hour == 0){
                    this.hour = 23;
                }
            }
        }else{
            this.second--;
        }
        return "\""+ this.hour+":"+this.minute+":"+this.second +"\"";
    }
    public String toString(){
        return "\""+ hour+":"+minute+":"+second+"\"";
    }


}
