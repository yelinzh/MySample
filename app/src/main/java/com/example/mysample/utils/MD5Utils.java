package com.example.mysample.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {

    /**
     * md5机密方法
     * @param password
     * @return
     */
    public static String md5Password(String password)
    {
        try {
            //得到信息摘要器
            MessageDigest digest = MessageDigest.getInstance("md5");
            byte[] result = digest.digest(password.getBytes());
            StringBuffer buffer = new StringBuffer();

            //将每一个byte做‘与’运算oxff
            for(byte b : result)
            {
                //与运算
                int number = b & 0xff;
                String str = Integer.toHexString(number);
                if(str.length() == 1){
                    buffer.append("0");
                }
                buffer.append(str);
            }
            //标准的md5机密后的结果
            return buffer.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }
}
