package com.ping.Utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//字符串转日期
public class StringToDate implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        if(s==null){
            throw new RuntimeException("字符串为空");
        }
        DateFormat df=new SimpleDateFormat("yyyy-mm-dd");
        try {
           return df.parse(s);
        } catch (ParseException e) {
           throw  new RuntimeException("转换异常");
        }

    }
}
