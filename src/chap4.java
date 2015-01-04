import java.util.StringTokenizer;

/**
 * Created by xiao on 12/28/2014.
 */
public class chap4 {

    public static void main(String[] args) {



        StringTokenizer date;

        String inputDate="03/11/2014";
        System.out.println(inputDate.substring(3,5));
        String monthDate, dayDate, yearDate;
        date=new StringTokenizer(inputDate,"/");
        monthDate=date.nextToken();
        dayDate=date.nextToken();
        yearDate=date.nextToken();

        System.out.println(monthDate+"!!!"+yearDate+"@@@"+dayDate);

        strangebox box1=new strangebox();
        box1.depth=1;
        box1.height=2;
        box1.weight=4;

        System.out.println(box1.depth);
        System.out.println(box1.height);
        System.out.println(box1.weight);

        int MM=4;
        int YY=2015;
        int count=DayCounter.countDays(MM,YY);
        for(int i=1;i<=count;i++) {
            System.out.println(MM + "Month" + i + "Day");
        }
        long l=numberChang.change("three");
        System.out.println(l);
    }







}

