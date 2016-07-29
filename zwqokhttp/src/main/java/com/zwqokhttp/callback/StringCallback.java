package com.zwqokhttp.callback;

import java.io.IOException;

import okhttp3.Response;
/**
 * Created by zwq on 16/7/28.
 */
public abstract class StringCallback extends Callback<String>
{
    @Override
    public String parseNetworkResponse(Response response, int id) throws IOException
    {
        return response.body().string();
    }
}
