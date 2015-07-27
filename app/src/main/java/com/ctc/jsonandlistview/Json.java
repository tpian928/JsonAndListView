package com.ctc.jsonandlistview;

import android.provider.MediaStore;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by TPIAN on 15/7/27.
 */
public class Json {


    public static ArrayList<String> getit() throws IOException, JSONException {
        ArrayList<String> list = new ArrayList<String>();

        String jsonStr = "{\"data\":[{\"os\":\"iOS\",\"evl\":\"best mobile OS\"},{\"os\":\"Android\",\"evl\":\"popular os\"},{\"os\":\"WindowsPhone\",\"evl\":\"shit\"},{\"os\":\"Windows\",\"evl\":\"hehe\"},{\"os\":\"Mac OS\",\"evl\":\"beatiful os\"},{\"os\":\"Linux\",\"evl\":\"Powerful\"}]}";
        JSONObject obj = new JSONObject(jsonStr);
        JSONArray arr = obj.getJSONArray("data");
        for (int i =0;i<arr.length();i++){
            String tmp = ((JSONObject)arr.get(i)).getString("os")+"   "+((JSONObject)arr.get(i)).getString("evl");
            list.add(tmp);
        }

        return list;
    }



}
