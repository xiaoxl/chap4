import java.util.StringTokenizer;

/**
 * Created by xiao on 12/28/2014.
 */
public class chap4 {
    public static void main(String[] args) {

        StringTokenizer date;

        String inputDate="03/11/2014";
        String monthDate, dayDate, yearDate;
        date=new StringTokenizer(inputDate,"/");
        monthDate=date.nextToken();
        dayDate=date.nextToken();
        yearDate=date.nextToken();

        System.out.println(monthDate+"!!!"+yearDate+"@@@"+dayDate);
    }


}