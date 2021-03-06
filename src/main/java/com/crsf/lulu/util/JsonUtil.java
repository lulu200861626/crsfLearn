package com.crsf.lulu.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * Created by liuzhao on 14-5-23.
 */
public class JsonUtil {
    public static final String DATEFORMAT_ISO8601 = "yyyy-MM-dd HH:mm:ss";
    public static final String DATEFORMAT_UTC = "yyyy-MM-dd'T'HH:mm:ss'+08:00'";
    static final ObjectMapper mapper = new ObjectMapper();

    static {
        mapper.setDateFormat(new SimpleDateFormat(DATEFORMAT_UTC));
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    public static void setDateFormat(String dateFormat) {
        mapper.setDateFormat(new SimpleDateFormat(dateFormat));
    }

    public static String toJson(Object obj) {
        if (obj == null) return null;
        if (obj.getClass() == String.class) return obj.toString();
        String json;
        try {
            json = mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return json;
    }


    public static <T> T fromJson(String content, Class<T> classType) {
        if (!jsonCheck(content)) return null;
        if (classType == String.class) return (T) content;
        try {
            return mapper.readValue(content, classType);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static <T> T fromJson(String content, TypeReference<T> valueTypeRef) {
        if (!jsonCheck(content)) return null;
        try {
            return (T) mapper.readValue(content, valueTypeRef);
        } catch (IOException e) {
            throw new RuntimeException(String.format("json:%s\nmsg:%s", content, e.getMessage()));
        }
    }

    static boolean jsonCheck(String content) {
        if (content == null || content.equals("")) return false;
//        if (!(content.startsWith("{") && content.endsWith("}"))) {
//            throw new RuntimeException(String.format("json数据格式错误，无法完成反序列化:\n%s", content));
//        }
        return true;
    }

}
