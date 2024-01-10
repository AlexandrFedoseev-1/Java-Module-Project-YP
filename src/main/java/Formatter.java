
public class Formatter {
    public String formatterRub(double price){
        double intPrice = Math.floor(price);
        if (intPrice%10==1 && intPrice%100!=11){
            return "рубль";
        }else if (intPrice%10>=2 & intPrice%10<=4 & !(intPrice%100>=12 & intPrice%100<=14)){
            return "рубля";
        }
        else return "рублей";
    }
}
