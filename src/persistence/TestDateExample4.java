package persistence;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateExample4 {
	
	!5!6!117!12!38!38

    public void setDate(String dateZeile) {

    	String dateInString = "Friday, Jun 7, 2013 12:10:56 PM";
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMM dd, yyyy HH:mm:ss a");
        
        try {

        	
            Date date = formatter.parse(dateZeile);
            System.out.println(date);
            System.out.println(formatter.format(date));
     
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}