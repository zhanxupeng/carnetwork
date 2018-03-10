package com.mr.common.util;

public class CustomerConvertUtils {
    public static Integer convertToCustomerId(String identify) {
        return Integer.parseInt(identify.substring(0, identify.length() - 2));
    }
}
