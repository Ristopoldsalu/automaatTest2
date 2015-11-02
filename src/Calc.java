//package ee.tty.praktikum2;

//represents reusable domain service which calculates daily salaries
public class Calc {
    //employee types
    public static final int JUNIOR = 1;
    public static final int SENIOR = 2;
    public static final int SPECIALIST = 3;
    public static final int HERO_HOURS = 20;

    public static final int JUNIOR_MULTIPLIER = 2;
    public static final int JUNIOR_OVERTIME_HOURS_NEEDED = 8;
    public static final int JUNIOR_HOUR_SALARY = 10;
    public static final int JUNIOR_HERO_BONUS= 15;

    public static final int SENIOR_MULTIPLIER = 2;
    public static final int SENIOR_OVERTIME_HOURS_NEEDED = 8;
    public static final int SENIOR_HOUR_SALARY = 15;
    public static final int SENIOR_HERO_BONUS= 20;


    public static final int SPECIALIST_MULTIPLIER = 3;
    public static final int SPECIALIST_OVERTIME_HOURS_NEEDED = 9;
    public static final int SPECIALIST_HOUR_SALARY = 22;
    public static final int SPECIALIST_HERO_BONUS= 30;
    //my crappy screen test
    public static void main(final String[] args) {
        Calc c = new Calc();
        System.err.println(c.pay(SPECIALIST, 3) + " should be 66");
    }

    protected int pay(final int typeOfWorker,final int hoursWorked) {

        int totalSalary = 0;

        switch (typeOfWorker) {
            case JUNIOR:
                totalSalary = calculateSalary(
                        hoursWorked,
                        JUNIOR_OVERTIME_HOURS_NEEDED,
                        JUNIOR_MULTIPLIER,
                        JUNIOR_HERO_BONUS,
                        JUNIOR_HOUR_SALARY);
                break;
            case SENIOR:
                totalSalary = calculateSalary(
                        hoursWorked,
                        SENIOR_OVERTIME_HOURS_NEEDED,
                        SENIOR_MULTIPLIER,
                        SENIOR_HERO_BONUS,
                        SENIOR_HOUR_SALARY);
                break;
            case SPECIALIST:
                totalSalary = calculateSalary(
                        hoursWorked,
                        SPECIALIST_OVERTIME_HOURS_NEEDED,
                        SPECIALIST_MULTIPLIER,
                        SPECIALIST_HERO_BONUS,
                        SPECIALIST_HOUR_SALARY);
                break;
        }

        return totalSalary;
    }

    public int calculateSalary(int hoursWorked, int overtimeHoursNeeded, int overtimeMultiplier, int heroBonus, int hourSalary) {
        int totalSalary = 0;
        if (hoursWorked > overtimeHoursNeeded) { // if longer than eight hours
            totalSalary = hourSalary * (hoursWorked - overtimeHoursNeeded) * overtimeMultiplier; // double pay
            totalSalary += hourSalary * overtimeHoursNeeded;
        } else totalSalary += hourSalary * hoursWorked;
        // hero bonus
        if (hoursWorked > HERO_HOURS) totalSalary += heroBonus;
        return totalSalary;
    }
}