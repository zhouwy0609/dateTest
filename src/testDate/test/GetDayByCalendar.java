package testDate.test;

import java.util.Calendar;

public class GetDayByCalendar {

	/**
	 * 计算时间天数差（Calendar方式）
	 * 
	 * @param oldCalendar
	 * @param newCalendar
	 * @return
	 * @throws Exception
	 */
	public int getDayByCalendar(Calendar oldCalendar, Calendar newCalendar)
			throws Exception {
		int date = 0;
		long oldtimes = (long) oldCalendar.getTime().getTime();
		long newtimes = (long) newCalendar.getTime().getTime();

		date = (int) ((newtimes - oldtimes) / (1000 * 3600 * 24));

		return date;
	}

}
