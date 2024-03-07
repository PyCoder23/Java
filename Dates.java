import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy"); 
        String dat = ft.format(new Date()); 
        System.out.println("Today's Date -> "+dat);
    }
}
