public class Worker {

    //employee types
    public static final int JUNIOR = 1;
    public static final int SENIOR = 2;
    public static final int SPECIALIST = 3;

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

    int multiplier;
    int overtimeHoursNeeded;
    int hourSalary;
    int heroBonus;
    int worker;

    public Worker(int worker) {
        this.worker = worker;

        switch(worker) {
            case JUNIOR:
                multiplier = JUNIOR_MULTIPLIER;
                overtimeHoursNeeded = JUNIOR_OVERTIME_HOURS_NEEDED;
                hourSalary = JUNIOR_HOUR_SALARY;
                heroBonus = JUNIOR_HERO_BONUS;
                break;

            case SENIOR:
                multiplier = SENIOR_MULTIPLIER;
                overtimeHoursNeeded = SENIOR_OVERTIME_HOURS_NEEDED;
                hourSalary = SENIOR_HOUR_SALARY;
                heroBonus = SENIOR_HERO_BONUS;
                break;

            case SPECIALIST:
                multiplier = SPECIALIST_MULTIPLIER;
                overtimeHoursNeeded = SPECIALIST_OVERTIME_HOURS_NEEDED;
                hourSalary = SPECIALIST_HOUR_SALARY;
                heroBonus = SPECIALIST_HERO_BONUS;
                break;
        }

    }

    public int getMultiplier() {
        return multiplier;
    }

    public int getOvertimeHoursNeeded() {
        return overtimeHoursNeeded;
    }

    public int getHourSalary() {
        return hourSalary;
    }

    public int getHeroBonus() {
        return heroBonus;
    }
}
