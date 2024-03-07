public class Main {
    public static void main(String[] args) {
        double principal = Console.setDoubleData("Principal",1_000,1_000_000);
        double annualRate = Console.setDoubleData("Annual Rate",1,30);
        double years = Console.setDoubleData("Years",1,30);
    }
}
