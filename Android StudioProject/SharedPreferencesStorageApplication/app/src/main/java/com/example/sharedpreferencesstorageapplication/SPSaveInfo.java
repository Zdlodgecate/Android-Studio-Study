package com.example.sharedpreferencesstorageapplication;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

public class SPSaveInfo {

    public static boolean saveInfoToSP(Context context, String userName, String userPwd) {
        SharedPreferences preferences = context.getSharedPreferences("data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("userName", userName);
        editor.putString("userPwd", userPwd);
        editor.apply();
        return true;
    }

    public static Map<String, String> getInfoFromSP(Context context) {
        HashMap<String, String> hashMap = new HashMap<>();
        SharedPreferences preferences = context.getSharedPreferences("data", Context.MODE_PRIVATE);
        String userName = preferences.getString("userName", "");
        String userPwd = preferences.getString("userPwd", "");
        hashMap.put("userName", userName);
        hashMap.put("userPwd", userPwd);
        return hashMap;
    }
}
