public class PaymentCalculator {

    public static double nettoYearPayment(Employee employee) {
        return employee.salary * 12;
    }

    public static double bruttoYearPayment(Employee employee) {
        double zus = 1000;
        return employee.salary * 12 + (zus * 12) + (employee.salary * 0.2 * 12);
    }
}
