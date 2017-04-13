
package cn.featherfly.conversion.core.basic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import cn.featherfly.conversion.core.annotation.Format;

/**
 * <p>
 * 类的说明放这里
 * </p>
 * <p>
 * copyright featherfly 2010-2020, all rights reserved.
 * </p>
 *
 * @author 钟冀
 */
public class User {

	private LocalDate localDate;
	
	private LocalTime localTime;
	
	private LocalDateTime localDateTime;
	
	@Format(format = "yyyy年MM月dd日", formats = {"yyyy/MM/dd", "yyyy年MM月dd日"})
	private LocalDate localDate2;
	
	@Format(format = "HH时mm分ss秒", formats = {"HH:mm:ss", "HH时mm分ss秒"})
	private LocalTime localTime2;
	
	@Format(format = "yyyy年MM月dd日 HH时mm分ss秒", formats = {"yyyy/MM/dd HH:mm:ss", "yyyy年MM月dd日 HH时mm分ss秒"})
	private LocalDateTime localDateTime2;

	/**
	 * 返回localDate
	 * @return localDate
	 */
	public LocalDate getLocalDate() {
		return localDate;
	}

	/**
	 * 设置localDate
	 * @param localDate localDate
	 */
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	/**
	 * 返回localTime
	 * @return localTime
	 */
	public LocalTime getLocalTime() {
		return localTime;
	}

	/**
	 * 设置localTime
	 * @param localTime localTime
	 */
	public void setLocalTime(LocalTime localTime) {
		this.localTime = localTime;
	}

	/**
	 * 返回localDateTime
	 * @return localDateTime
	 */
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	/**
	 * 设置localDateTime
	 * @param localDateTime localDateTime
	 */
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	/**
	 * 返回localDate2
	 * @return localDate2
	 */
	public LocalDate getLocalDate2() {
		return localDate2;
	}

	/**
	 * 设置localDate2
	 * @param localDate2 localDate2
	 */
	public void setLocalDate2(LocalDate localDate2) {
		this.localDate2 = localDate2;
	}

	/**
	 * 返回localTime2
	 * @return localTime2
	 */
	public LocalTime getLocalTime2() {
		return localTime2;
	}

	/**
	 * 设置localTime2
	 * @param localTime2 localTime2
	 */
	public void setLocalTime2(LocalTime localTime2) {
		this.localTime2 = localTime2;
	}

	/**
	 * 返回localDateTime2
	 * @return localDateTime2
	 */
	public LocalDateTime getLocalDateTime2() {
		return localDateTime2;
	}

	/**
	 * 设置localDateTime2
	 * @param localDateTime2 localDateTime2
	 */
	public void setLocalDateTime2(LocalDateTime localDateTime2) {
		this.localDateTime2 = localDateTime2;
	}
        
    
    
}
