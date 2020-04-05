public class CalcApp {
    public static void main(String[] args) {
        PaymentCalculator pc = new PaymentCalculator();
        Employee employee = new Employee("Jan", "Kowalski", 3000);

        System.out.println(pc.nettoYearPayment(employee));
        System.out.println(pc.bruttoYearPayment(employee));
    }
}
