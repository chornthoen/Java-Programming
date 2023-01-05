package inheritance_1;

public class Student extends Person{
    private String gender;
    private String classRoom;
    private int year;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public Student(String firstName,String lastName,int age,String gender,String classRoom,int year){
        super(firstName,lastName,age);
        setGender(gender);
        setClassRoom(classRoom);
        setYear(year);
    }
    public String toString(){
        return super.toString()+" ,Gender: "+getGender()+" ,Class room: "+getClassRoom()+" ,Year: "+getYear();
    }
    public void displayStudent(){
        System.out.println(toString());
    }
}
