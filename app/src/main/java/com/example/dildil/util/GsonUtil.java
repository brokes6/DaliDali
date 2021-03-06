package com.example.dildil.util;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

/**
 * 字符串和Java类的转换工具
 */
public class GsonUtil {
    private static final String TAG = "GsonUtil";

    public static String toJson(Object obj) {
        String result = createGson().toJson(obj);
        return result;
    }

    private static Gson createGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.serializeNulls();
        return gsonBuilder.create();
    }


    /**
     * 将字符串转换成对应的Java对象
     */
    public static <T> T fromJSON(String json, Class<T> cls) {
        try {
            return createGson().fromJson(json, cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 将字符串转换成对应的Java对象
     */
    public static <T> T fromJSON(String json, Type type) {
        try {
            return createGson().fromJson(json,type);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
