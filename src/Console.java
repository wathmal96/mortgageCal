import java.util.Scanner;

public class Console {
    public static double setDoubleData(String inputName,double min,double max){
        Scanner scan = new Scanner(System.in);
        double input;
        while (true){
            System.out.print(inputName+":");
            input = scan.nextDouble();
            if(input<max && input>min)
                break;
            else
                System.out.println(inputName+" should be between "+min+" and "+max);
        }
        return input;
    }
}
