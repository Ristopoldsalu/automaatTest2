import org.junit.Test;

import java.lang.invoke.CallSite;
import java.security.PublicKey;

import static junit.framework.TestCase.assertEquals;

public class CalcTest {

    @Test
    public void shouldReturnJuniorSalary() {
        Calc calc = new Calc();
        assertEquals(30, calc.calculateSalary(3, Calc.JUNIOR_OVERTIME_HOURS_NEEDED, Calc.JUNIOR_MULTIPLIER, Calc.JUNIOR_HERO_BONUS, Calc.JUNIOR_HOUR_SALARY), 0.0);
    }
    @Test
    public void shouldReturnSeniorSalary() {
        Calc calc = new Calc();
        assertEquals(45, calc.calculateSalary(3, Calc.SENIOR_OVERTIME_HOURS_NEEDED, Calc.SENIOR_MULTIPLIER, Calc.SENIOR_HERO_BONUS, Calc.SENIOR_HOUR_SALARY), 0.0);
    }
    @Test
    public void shouldReturnSpecialistSalary() {
        Calc calc = new Calc();
        assertEquals(66, calc.calculateSalary(3, Calc.SPECIALIST_OVERTIME_HOURS_NEEDED, Calc.SPECIALIST_MULTIPLIER, Calc.SPECIALIST_HERO_BONUS, Calc.SPECIALIST_HOUR_SALARY), 0.0);
    }

    @Test
    public void shouldReturnSalaryWithOvertime() {
        Calc calc = new Calc();
        assertEquals(396, calc.calculateSalary(12, Calc.SPECIALIST_OVERTIME_HOURS_NEEDED, Calc.SPECIALIST_MULTIPLIER, Calc.SPECIALIST_HERO_BONUS, Calc.SPECIALIST_HOUR_SALARY), 0.0);
    }

    @Test
    public void shouldReturnJuniorPay() {
        Calc calc = new Calc();
        assertEquals(30, calc.pay(Calc.JUNIOR, 3), 0.0);
    }

    @Test
    public void shouldReturnSeniorPay() {
        Calc calc = new Calc();
        assertEquals(45, calc.pay(Calc.SENIOR, 3), 0.0);
    }

    @Test
    public void shouldReturnSpecialistPay() {
        Calc calc = new Calc();
        assertEquals(66, calc.pay(Calc.SPECIALIST, 3), 0.0);
    }

}