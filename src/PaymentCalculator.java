public class PaymentCalculator {
    private final static double ZUS = 1000;
    private final static double TAX = 0.2;

    public double nettoYearPayment(Employee employee) {
        return employee.salary * 12;
    }

    public double bruttoYearPayment(Employee employee) {
        return employee.salary * 12 + (ZUS * 12) + (employee.salary * TAX * 12);
    }
}
