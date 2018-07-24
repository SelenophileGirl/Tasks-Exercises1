package Assignment3;

public class Date {

    /**Date class instance variables*/
    private int month;
    private int day;
    private int year;

    /**a constructor with three argument, month, day and year*/
    public Date(int month , int day , int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    /**method that print out the date as month/day/year*/
    public void displayDate(){
        System.out.println(this.month + "/" + this.day + "/" + this.year);
    }


}
