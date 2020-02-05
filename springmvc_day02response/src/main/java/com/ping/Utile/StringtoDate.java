package com.ping.Utile;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringtoDate implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        if(s==null){
            throw  new RuntimeException("内容为空");
        }
        DateFormat df=new SimpleDateFormat("yyyy-mm-dd");
        try {
            return df.parse(s);
        } catch (ParseException e) {
            throw  new RuntimeException("转换出错");
        }
    }
}
