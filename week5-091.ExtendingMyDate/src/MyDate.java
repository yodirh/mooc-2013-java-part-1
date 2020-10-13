
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    //advance date by one day. all months are 30 days.
    public void advance() {
        if (this.day <= 30) {
            this.day++;
        }
        if (this.day == 31) {
            this.day = 1;
        }

        if (this.day == 1 && this.month <= 12) {
            this.month++;
        }
        if (this.month == 13) {
            this.month = 1;

        }
        if (this.day == 1 && this.month == 1) {
            this.year++;
        }

    }

    //will call the advance() for parameter times.
    public void advance(int numberOfDays) {
        int i = 0;
        while (i < numberOfDays) {
            advance();
            i++;
        }
    }

    // Methode that create object from own class and return it. 
    public MyDate afterNumberOfDays(int days) {
        MyDate newMyDate = new MyDate(day, month, year);
        newMyDate.advance(days);

        return newMyDate;
    }

}
