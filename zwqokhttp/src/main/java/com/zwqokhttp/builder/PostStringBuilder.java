package com.zwqokhttp.builder;

import com.zwqokhttp.request.PostStringRequest;
import com.zwqokhttp.request.RequestCall;

import okhttp3.MediaType;

/**
 * Created by zwq on 16/7/28.
 */
public class PostStringBuilder extends OkHttpRequestBuilder<PostStringBuilder>
{
    private String content;
    private MediaType mediaType;


    public PostStringBuilder content(String content)
    {
        this.content = content;
        return this;
    }

    public PostStringBuilder mediaType(MediaType mediaType)
    {
        this.mediaType = mediaType;
        return this;
    }

    @Override
    public RequestCall build()
    {
        return new PostStringRequest(url, tag, params, headers, content, mediaType,id).build();
    }


}
