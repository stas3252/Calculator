import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] strings = str.split(" ");
        TDecoder Decoder = new TDecoder();
        if ((Decoder.IsArab(strings[0]) && Decoder.IsArab(strings[2]))
            || (Decoder.IsRim(strings[0]) && Decoder.IsRim(strings[2]))
            && (strings[1].equals("+") || strings[1].equals("-") || strings[1].equals("*") || strings[1].equals("/"))) {
            TCalculator calculator  = new TCalculator(strings[0], strings[2], strings[1], (Decoder.IsArab(strings[0]) && Decoder.IsArab(strings[2])));
            System.out.println(calculator.GetRes());
        } else {
            System.out.println("Error input!");
        }
    }
}
