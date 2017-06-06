package com.dishbreak.util;

import com.google.gson.Gson;
import spark.ResponseTransformer;

/**
 * This class integrates Gson with the {@link ResponseTransformer} interface for Spark Web Framework.
 * To use this class, statically import, then invoke {@link JsonUtil#json()} to get the response transformer.
 */
public class JsonUtil {
    public static String toJson(Object object) {
        return new Gson().toJson(object);
    }

    /**
     * Get a method back that obeys the response transformer interface.
     * @return A method that will accept a POJO and give back a string.
     */
    public static ResponseTransformer json() {
        return JsonUtil::toJson;
    }
}
