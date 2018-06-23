package com.yqwy.utopay_seAndRe.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/6/14.
 */
public class TimeUtil {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String time = "20180614080506";
        try {
            Date date = sdf.parse(time);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
