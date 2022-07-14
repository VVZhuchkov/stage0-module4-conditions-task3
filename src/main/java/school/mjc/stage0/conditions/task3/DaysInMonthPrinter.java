package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 9 || month == 11) {
            System.out.println("31");
        } else if (month == 2) {
            System.out.println("28");
        } else if (month <= 12 && month > 0) {
            System.out.println("30");
        } else {
            System.out.println("wrong number!");
        }
    }
}
