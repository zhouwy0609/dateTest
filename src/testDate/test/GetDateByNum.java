package testDate.test;

import java.util.Calendar;
import java.util.Date;

public class GetDateByNum {
	
	/**
	 * 传入天数，计算出差值毫秒数
	 * @param days
	 * @return
	 */
	public Date getDate(int days) {
		// 采用单例模式获取日历对象Calendar.getInstance()， 获取指定时间
		Calendar c = Calendar.getInstance();
		c.set(1900, 0, 1);
		c.add(Calendar.DATE, days - 2);
		return c.getTime();
	}

	/**
	 * 传入
	 * 
	 * @param date
	 * @param ditNumber
	 * @return
	 */
	public Date getTime(Date date, double ditNumber) {
		Calendar c = Calendar.getInstance(); // 获取指定时间
		int mills = (int) (Math.round(ditNumber * 24 * 3600)); // 取整数
		int hour = mills / 3600;
		int minute = (mills - hour * 3600) / 60;
		int second = mills - hour * 3600 - minute * 60;
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, hour);
		c.set(Calendar.MINUTE, minute);
		c.set(Calendar.SECOND, second);
		return c.getTime();
	}

}
