package testDate.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateTest {
	
	@Test
	public void test1() {
		GetDateByNum gdb = new GetDateByNum();
		int days = 42016;
		double ditNumber = 0.6582060185;
		Date date = gdb.getDate(days);
		Date dateTime = gdb.getTime(date, ditNumber);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(dateTime));
	}

	@Test
	public void getdate() throws ParseException {
		int date;
		try {
			GetDayByDate gdByDate = new GetDayByDate();
			date = gdByDate.getDayByDate(new Date(), new Date());
			System.out.println(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test() {
		GetDayByCalendar gdByCalendar = new GetDayByCalendar();
		try {
			Calendar oldCalendar = Calendar.getInstance();
			Calendar newCalendar = Calendar.getInstance();
			oldCalendar.set(1999, 12, 27);
			newCalendar.set(2019, 12, 27);
			int date = gdByCalendar.getDayByCalendar(oldCalendar, newCalendar);
			System.out.println(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
