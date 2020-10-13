
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
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

    // difference in year counting start from day. Not exactly accurate. month = 30days.
    
    public int differenceInYears(MyDate comparedDate) {
        int diff = 0;
        int cyear = 0;
        int cmonth = 0;
        int cday = 0;

        if (earlier(comparedDate) == false) {
            
            cyear = comparedDate.year;
            cmonth = comparedDate.month;
            cday = comparedDate.day;

            while (true) {
                if (this.year == cyear && this.month == cmonth && this.day == cday) {
                    break;
                }
                
                cday++;
                diff++;
                
                if (cday == 31) {
                    cmonth++;
                    cday = 1;
                }

                if (cday == 1 && cmonth == 13) {
                    cmonth = 1;
                    cyear++;
                }
            }
            return diff / 360;

        } else {
            
            cyear = this.year;
            cmonth = this.month;
            cday = this.day;

            while (true) {
                if (comparedDate.year == cyear && comparedDate.month == cmonth && comparedDate.day == cday) {
                    break;
                }

                cday++;
                diff++;
                
                if (cday == 31) {
                    cmonth++;
                    cday = 1;
                }

                System.out.println(cmonth);

                if (cday == 1 && cmonth == 13) {
                    cmonth = 1;
                    cyear++;
                }

            }
            return diff / 360;
        }

    }
}
