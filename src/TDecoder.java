import java.util.HashMap;

public class TDecoder {
        public HashMap DecoderArabToInt = new HashMap();
        public HashMap DecoderRimToInt = new HashMap();
        public HashMap DecoderIntToRim = new HashMap();
        private void InitDecoders() {
                DecoderArabToInt.put("1", 1);
                DecoderArabToInt.put("2", 2);
                DecoderArabToInt.put("3", 3);
                DecoderArabToInt.put("4", 4);
                DecoderArabToInt.put("5", 5);
                DecoderArabToInt.put("6", 6);
                DecoderArabToInt.put("7", 7);
                DecoderArabToInt.put("8", 8);
                DecoderArabToInt.put("9", 9);
                DecoderArabToInt.put("10", 10);
                /**/
                DecoderRimToInt.put("I", 1);
                DecoderRimToInt.put("II", 2);
                DecoderRimToInt.put("III", 3);
                DecoderRimToInt.put("IV", 4);
                DecoderRimToInt.put("V", 5);
                DecoderRimToInt.put("VI", 6);
                DecoderRimToInt.put("VII", 7);
                DecoderRimToInt.put("VIII", 8);
                DecoderRimToInt.put("IX", 9);
                DecoderRimToInt.put("X", 10);
                /*-----------------------*/
                DecoderIntToRim.put(1, "I");
                DecoderIntToRim.put(2, "II");
                DecoderIntToRim.put(3, "III");
                DecoderIntToRim.put(4, "IV");
                DecoderIntToRim.put(5, "V");
                DecoderIntToRim.put(6, "VI");
                DecoderIntToRim.put(7, "VII");
                DecoderIntToRim.put(8, "VIII");
                DecoderIntToRim.put(9, "IX");
                DecoderIntToRim.put(10, "X");
                DecoderIntToRim.put(20, "XX");
                DecoderIntToRim.put(30, "XXX");
                DecoderIntToRim.put(40, "XL");
                DecoderIntToRim.put(50, "L");
                DecoderIntToRim.put(60, "LX");
                DecoderIntToRim.put(70, "LXX");
                DecoderIntToRim.put(80, "LXXX");
                DecoderIntToRim.put(90, "XC");
                DecoderIntToRim.put(100, "C");
        }
        public TDecoder() {
                InitDecoders();
        }
        public boolean IsArab(String key) {
                return DecoderArabToInt.containsKey(key);
        }
        public boolean IsRim(String key) {
                return DecoderRimToInt.containsKey(key);
        }
}
