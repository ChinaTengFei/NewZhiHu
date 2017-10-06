package com.example.george.newzhihu.tool;

import java.lang.reflect.ParameterizedType;

/**
 * Created by george on 2017/10/6.
 */

public class RefUtils {

    public static <T> T getT(Object o, int i) {
        try {

            return ((Class<T>) ((ParameterizedType) (o.getClass().getGenericSuperclass())).getActualTypeArguments()[i]).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
