/**
 * 
 */
package com.troy.software.enrollment.validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.joda.time.Chronology;
import org.joda.time.LocalTime;

/**
 * @author ex1v9
 *
 */
public class DateClass {
	
	static final String DATEFORMAT = "yyyy-MM-dd HH:mm:ss";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
/*		  Calendar c = Calendar.getInstance();
		    System.out.println("current: "+c.getTime());

		    TimeZone z = c.getTimeZone();
		    int offset = z.getRawOffset();
		    int offsetHrs = offset / 1000 / 60 / 60;
		    int offsetMins = offset / 1000 / 60 % 60;

		    System.out.println("offset: " + offsetHrs);
		    System.out.println("offset: " + offsetMins);

		    c.add(Calendar.HOUR_OF_DAY, (-offsetHrs));
		    c.add(Calendar.MINUTE, (-offsetMins));

		    System.out.println("GMT Time: "+c.getTime());*/
		checkJoda();
		    //System.out.println("UTC Time: "+GetUTCdatetimeAsDate());


	}
	
	public static void checkJoda() {
		Chronology chronology = new 
		LocalTime localTime = new LocalTime();
		System.out.println("Joda" + localTime.toString());
	}
	
	

			public static Date GetUTCdatetimeAsDate()
			{
			    //note: doesn't check for null
			    return StringDateToDate(GetUTCdatetimeAsString());
			}

			public static String GetUTCdatetimeAsString()
			{
			    final SimpleDateFormat sdf = new SimpleDateFormat(DATEFORMAT);
			    sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
			    final String utcTime = sdf.format(new Date());

			    return utcTime;
			}

			public static Date StringDateToDate(String StrDate)
			{
			    Date dateToReturn = null;
			    SimpleDateFormat dateFormat = new SimpleDateFormat(DATEFORMAT);

			    try
			    {
			        dateToReturn = (Date)dateFormat.parse(StrDate);
			    }
			    catch (ParseException e)
			    {
			        e.printStackTrace();
			    }

			    return dateToReturn;
			}

	
	
	
	

}
