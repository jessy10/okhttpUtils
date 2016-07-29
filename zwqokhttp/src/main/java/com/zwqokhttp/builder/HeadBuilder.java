package com.zwqokhttp.builder;


import com.zwqokhttp.OkHttpUtils;
import com.zwqokhttp.request.OtherRequest;
import com.zwqokhttp.request.RequestCall;
/**
 * Created by zwq on 16/7/28.
 */
public class HeadBuilder extends GetBuilder
{
    @Override
    public RequestCall build()
    {
        return new OtherRequest(null, null, OkHttpUtils.METHOD.HEAD, url, tag, params, headers,id).build();
    }
}
