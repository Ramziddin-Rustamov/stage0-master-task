package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if(year > 0 && month >=1 && month <= 12){
            int daysInMonth = getDaysInMonth(month , year);
            if (daysInMonth != -1) {
                System.out.println("Number of days in month " + month + " for year " + year + ": " + daysInMonth);
            } else {
                System.out.println("Invalid month or year.");
            }
        }else {
            System.out.println("Invalid Month or Year");
        }
    }

    public int getDaysInMonth( int month , int year ){
        switch (month){
            case 1 , 3 , 5 , 7 , 8, 10 , 12 :
                return 31;
            case 4, 6, 9, 11 :
                return 30 ;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;
        }
    }

    public boolean isLeapYear(int year){
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static void main(String[] args) {
        DaysInMonth daysInMonth = new DaysInMonth();
        daysInMonth.printDays(2016,2);
    }


}
