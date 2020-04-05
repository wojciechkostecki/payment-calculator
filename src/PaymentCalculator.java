public class PaymentCalculator {
    final double zus = 1000;
    final double tax = 0.2;

    public double nettoYearPayment(Employee employee) {
        return employee.salary * 12;
    }

    public double bruttoYearPayment(Employee employee) {
        return employee.salary * 12 + (zus * 12) + (employee.salary * tax * 12);
    }
}
