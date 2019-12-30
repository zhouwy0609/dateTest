package testDate.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetDayByDate {

	/**
	 * 计算时间天数差（Date方式）
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 * @throws Exception
	 */
	public int getDayByDate(Date startDate, Date endDate) throws Exception {

		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD");
		long startDateTime = dateFormat.parse(dateFormat.format(startDate))
				.getTime();
		long endDateTime = dateFormat.parse(dateFormat.format(endDate))
				.getTime();
		return (int) ((endDateTime - startDateTime) / (1000 * 3600 * 24));
	}

	/**
	 * 准确确计算两个日期相差天数
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 * @throws ParseException
	 */
	public static int getDayDiffer(Date startDate, Date endDate)
			throws Exception {
		// 判断是否跨年
		SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
		String startYear = yearFormat.format(startDate);
		String endYear = yearFormat.format(endDate);
		if (startYear.equals(endYear)) {
			// 使用Calendar跨年的情况会出现问题 
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(startDate);
			int startDay = calendar.get(Calendar.DAY_OF_YEAR);
			calendar.setTime(endDate);
			int endDay = calendar.get(Calendar.DAY_OF_YEAR);
			return endDay - startDay;
		} else {
			/*
			 * 跨年不会出现问题，需要注意不满24小时情况（2016-03-18 11:59:59 和 2016-03-19
			 * 00:00:01的话差值为 0）
			 */
			// 只格式化日期，消除不满24小时影响
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			long startDateTime = dateFormat.parse(dateFormat.format(startDate))
					.getTime();
			long endDateTime = dateFormat.parse(dateFormat.format(endDate))
					.getTime();
			return (int) ((endDateTime - startDateTime) / (1000 * 3600 * 24));
		}
	}

}
