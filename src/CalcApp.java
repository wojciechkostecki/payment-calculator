public class CalcApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Jan", "Kowalski", 3000);
        
        System.out.println(PaymentCalculator.nettoYearPayment(employee));
        System.out.println(PaymentCalculator.bruttoYearPayment(employee));
    }
}
