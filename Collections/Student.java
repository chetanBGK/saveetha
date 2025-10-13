package Collections;

public class Student {
    private int rollNo;
    private String name;
    private String place;
    private String branch;
    private int percentage;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", branch='" + branch + '\'' +
                ", percentage=" + percentage +
                '}';
    }

    public Student(int rollNo, String name, String place, String branch, int percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.place = place;
        this.branch = branch;
        this.percentage = percentage;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }




}

