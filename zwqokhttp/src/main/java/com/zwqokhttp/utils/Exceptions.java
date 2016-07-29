package com.zwqokhttp.utils;

/**
 * Created by zwq on 16/7/28.
 */

public class Exceptions {
    public static void illegalArgument(String msg, Object... params) {
        throw new IllegalArgumentException(String.format(msg, params));
    }


}
