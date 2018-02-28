package cn.itcast.ssm.conversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 自定义转换日期
 * S:页面传递过来的类型
 * T:转换后的类型
 * @author lx
 *
 */
public class DateConverter implements Converter<String, Date>{

	@Override
	public Date convert(String source) {
		// TODO Auto-generated method stub  2015-02-09 13:22:57
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return df.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
