package com.zwqokhttp.callback;
/**
 * Created by zwq on 16/7/28.
 */
public interface IGenericsSerializator {
    <T> T transform(String response, Class<T> classOfT);
}
