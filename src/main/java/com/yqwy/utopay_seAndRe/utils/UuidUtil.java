package com.yqwy.utopay_seAndRe.utils;

import java.util.UUID;

/**
 * Created by Administrator on 2018/6/14.
 */
public class UuidUtil {
    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid.replace("-","").toUpperCase());
    }
}
