package Class15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Homework8 {
    /**
     *
     * Due: Wed (Apr 6)
     *
     * Create a method that will print timeline for given input data-points
     *
     * Timeline should be (hour am/pm) with 2 hour interval from the current time.
     *
     * generateTimeline(5)
     * Now 11pm 1am 3am 5am
     *
     * generateTimeline(2)
     * Now 11pm
     *
     * generateTimeline(8)      // running code at 4:30am
     * Now 6am 8am 10am 12pm 2pm 4pm 6pm
     *
     * generateTimeline(11)      // running code at 10:15am
     * Now 12pm 2pm 4pm 6pm 8pm 10pm 12am 2am 4am 6am
     *
     */






    public static void main(String[] args) {

        Date now = new Date();
        System.out.println(now);


        SimpleDateFormat sdf2 = new SimpleDateFormat("ha");
        String hourData = sdf2.format(now);
        System.out.println("Current time-> "+hourData);
        Calendar c = Calendar.getInstance();
     //   int x = 2;
        c.add(Calendar.HOUR, 2);
        hourData = sdf2.format(c.getTime());
         System.out.println("hourData -> " + hourData);


    }

}
