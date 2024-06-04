import org.example.BonusService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

// Проведите поверхностный тест-дизайн сервисного класса, допишите как минимум два недостающих и прямо напрашивающихся теста.

public class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForNonRegisteredAndUnderLimit() {

        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = false;
        long expected = 10;

        // вызываем целевой метод

        long actual = service.calculate(amount, registered);

        // проводим проверку(сравниваем фактический и ожидаемый результаты):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForNonRegisteredAndOverLimit() {

        BonusService service = new BonusService();
        long amount = 1_000_000;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод

        long actual = service.calculate(amount, registered);

        // проводим проверку(сравниваем фактический и ожидаемый результаты):
        Assertions.assertEquals(expected, actual);
    }


}