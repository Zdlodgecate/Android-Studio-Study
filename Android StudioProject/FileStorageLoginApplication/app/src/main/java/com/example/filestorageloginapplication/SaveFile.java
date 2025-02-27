package com.example.filestorageloginapplication;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

public class SaveFile {

    public static boolean saveInfoToFile(Context context, String userName, String userPwd) {
        FileOutputStream fos = null;
        try {
            fos = context.openFileOutput("user.txt", Context.MODE_PRIVATE);
            fos.write((userName + "&" + userPwd).getBytes());
            fos.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Map<String, String> getInfoFromFile(Context context) {
        FileInputStream fis = null;
        try {
            fis = context.openFileInput("user.txt");
            byte[] bytes = new byte[fis.available()];
            fis.read(bytes);
            String content = new String(bytes);
            String[] splitStr = content.split("&");
            HashMap<String, String> userMap = new HashMap<>();
            userMap.put("userName", splitStr[0]);
            userMap.put("userPwd", splitStr[1]);
            fis.close();
            return userMap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}