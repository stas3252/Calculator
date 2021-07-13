public class TCalculator {
    private int A;
    private int B;
    private String Operator;
    private boolean IsArab;
    private TDecoder Decoder = new TDecoder();
    public TCalculator(String a, String b, String operator, boolean isArab) {
        IsArab = isArab;
        if (IsArab) {
            A = (int) Decoder.DecoderArabToInt.get(a);
            B = (int) Decoder.DecoderArabToInt.get(b);
        } else {
            A = (int) Decoder.DecoderRimToInt.get(a);
            B = (int) Decoder.DecoderRimToInt.get(b);
        }
        Operator = operator;
    }
    public String GetRes() {
        int res;
        switch (Operator) {
            case "+":
                res = A + B;
                break;
            case "-":
                res = A - B;
                break;
            case "*":
                res = A * B;
                break;
            case "/":
                res = A / B;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + Operator);
        }
        if (IsArab) {
            return "" + res;
        } else {
            if (res == 0) {
                return "O";
            } else if (res < 0) {
                return "-" + (String) Decoder.DecoderIntToRim.get(res * -1);
            } else {
                if (res % 10 > 0) {
                    int tmp = res % 10;
                    return (String) Decoder.DecoderIntToRim.get(res - tmp) + (String) Decoder.DecoderIntToRim.get(tmp);
                } else {
                    return (String) Decoder.DecoderIntToRim.get(res);
                }
            }
        }
    }
}
