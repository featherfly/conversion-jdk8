
package cn.featherfly.conversion.core.basic;

import static org.testng.Assert.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cn.featherfly.common.bean.BeanDescriptor;
import cn.featherfly.common.bean.BeanProperty;
import cn.featherfly.conversion.core.BeanPropertyConversion;
import cn.featherfly.conversion.core.ConversionPolicy;
import cn.featherfly.conversion.core.ConversionPolicysJdk8;

/**
 * <p>
 * LocalDateConvertorTest
 * </p>
 *
 * @author 钟冀
 */
public class LocalDateConvertorTest {
	
	ConversionPolicy policy;
    
    @BeforeClass
    public void setUp() {
        policy = ConversionPolicysJdk8.getFormatConversionPolicy();
    }
    
    @Test
    public void testLocalDateTimeConversion() {
        BeanPropertyConversion beanPropertyConversion = new BeanPropertyConversion();
        beanPropertyConversion.setConversionPolicy(policy);
        
        BeanDescriptor<User> bd = BeanDescriptor.getBeanDescriptor(User.class);
        
        BeanProperty<?> beanProperty = null;
        
        // LocalDate
        beanProperty = bd.getBeanProperty("localDate");
        LocalDate localDate = LocalDate.of(2000, 1, 1);
        assertEquals(localDate.toString(), beanPropertyConversion.toObject("2000-01-01", beanProperty).toString());        
        assertEquals("2000-01-01", beanPropertyConversion.toString(localDate, beanProperty));        
        
        beanProperty = bd.getBeanProperty("localDate2");
        assertEquals(localDate, beanPropertyConversion.toObject("2000年01月01日", beanProperty));        
        assertEquals(localDate, beanPropertyConversion.toObject("2000/01/01", beanProperty));        
        assertEquals("2000年01月01日", beanPropertyConversion.toString(localDate, beanProperty));        
        
        // LocalTime     
        beanProperty = bd.getBeanProperty("localTime");
        LocalTime localTime = LocalTime.of(14, 15, 16);
        assertEquals(localTime.toString(), beanPropertyConversion.toObject("14:15:16", beanProperty).toString());        
        assertEquals("14:15:16", beanPropertyConversion.toString(localTime, beanProperty));        
        
        beanProperty = bd.getBeanProperty("localTime2");
        assertEquals(localTime.toString(), beanPropertyConversion.toObject("14时15分16秒", beanProperty).toString());
        assertEquals(localTime.toString(), beanPropertyConversion.toObject("14:15:16", beanProperty).toString());
        assertEquals("14时15分16秒", beanPropertyConversion.toString(localTime, beanProperty));
        
        // LocalDateTime    
        beanProperty = bd.getBeanProperty("localDateTime");
        LocalDateTime localDateTime = LocalDateTime.of(2002, 2, 2, 14, 15, 16);
        assertEquals(localDateTime.toString(), beanPropertyConversion.toObject("2002-02-02 14:15:16", beanProperty).toString());        
        assertEquals("2002-02-02 14:15:16", beanPropertyConversion.toString(localDateTime, beanProperty));        
        
        beanProperty = bd.getBeanProperty("localDateTime2");
        assertEquals(localDateTime.toString(), beanPropertyConversion.toObject("2002年02月02日 14时15分16秒", beanProperty).toString());
        assertEquals(localDateTime.toString(), beanPropertyConversion.toObject("2002/02/02 14:15:16", beanProperty).toString());
        assertEquals("2002年02月02日 14时15分16秒", beanPropertyConversion.toString(localDateTime, beanProperty));
        
    }
    
    
	
    public static void main(String[] args) {
    	DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    	DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    	LocalDate localDate = LocalDate.parse("2014-01-23", dateFormatter);
    	System.out.println(localDate);
    	System.out.println(localDate.format(dateFormatter));
    	
    	LocalTime localTime = LocalTime.parse("12:13:14", timeFormatter);    	
    	System.out.println(localTime);
    	System.out.println(localTime.format(timeFormatter));
    	
    	LocalDateTime localDateTime = LocalDateTime.parse("2014-01-23 12:13:14", dateTimeFormatter);    	
    	System.out.println(localDateTime);
    	System.out.println(localDateTime.format(dateTimeFormatter));
	}
}
