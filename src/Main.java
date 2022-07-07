public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double myRost = 1.82;  //задается в метрах
        double myVes = 76;  //задается к килограммах
        double myIndex = service.calculate(myRost, myVes);
        System.out.println();
        System.out.println("Индекс массы тела = " + myIndex);

    }
}
