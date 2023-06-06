package com.co.applitools.utils;

import org.json.JSONObject;

public class GenerateBodyPetisionUsers {

    public static String WhitData(String name , String job)
    {
        JSONObject body = new JSONObject();

        body.put("name", name);
        body.put("job", job);

        return body.toString();
    }
}
