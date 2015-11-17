//package ee.tty.praktikum2;

//represents reusable domain service which calculates daily salaries
public class Calc {
    public static final int HERO_HOURS = 20;

    protected int pay(final int typeOfWorker,final int hoursWorked) {
        Worker worker = new Worker(typeOfWorker);
        return calculateSalary(worker, hoursWorked);
    }


    public int calculateSalary(Worker worker, int hoursWorked) {
        int totalSalary = 0;

        if (hoursWorked > worker.getOvertimeHoursNeeded()) { // if longer than eight hours
            totalSalary = worker.getHourSalary() * (hoursWorked - worker.getOvertimeHoursNeeded()) * worker.getMultiplier(); // double pay
            totalSalary += worker.getHourSalary() * worker.getOvertimeHoursNeeded();

        } else totalSalary += worker.getHourSalary() * hoursWorked;

        // hero bonus
        if (hoursWorked > HERO_HOURS) totalSalary += worker.getHeroBonus();
        return totalSalary;
    }
}