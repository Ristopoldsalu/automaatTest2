import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalcTest {

    @Test
    public void shouldReturnJuniorSalary() {
        Calc calc = new Calc();
        Worker worker = new Worker(1);
        assertEquals(30, calc.calculateSalary(worker, 3), 0.0);
    }
    @Test
    public void shouldReturnSeniorSalary() {
        Calc calc = new Calc();
        Worker worker = new Worker(2);
        assertEquals(45, calc.calculateSalary(worker, 3), 0.0);
    }
    @Test
    public void shouldReturnSpecialistSalary() {
        Calc calc = new Calc();
        Worker worker = new Worker(3);
        assertEquals(66, calc.calculateSalary(worker, 3), 0.0);
    }

    @Test
    public void shouldReturnSalaryWithOvertime() {
        Calc calc = new Calc();
        Worker worker = new Worker(3);
        assertEquals(396, calc.calculateSalary(worker, 12), 0.0);
    }

    @Test
    public void shouldReturnJuniorPay() {
        Calc calc = new Calc();
        assertEquals(30, calc.pay(Worker.JUNIOR, 3), 0.0);
    }

    @Test
    public void shouldReturnSeniorPay() {
        Calc calc = new Calc();
        assertEquals(45, calc.pay(Worker.SENIOR, 3), 0.0);
    }

    @Test
    public void shouldReturnSpecialistPay() {
        Calc calc = new Calc();
        assertEquals(66, calc.pay(Worker.SPECIALIST, 3), 0.0);
    }

    @Test
    public void shouldReturnHeroHoursSpecialist() {
        Worker worker = new Worker(3);
        assertEquals(30, worker.getHeroBonus());
    }

}