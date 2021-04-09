package com.comtjack.drug.common;


import java.util.HashMap;

public class ResultMapUtil {
    public static HashMap<String,Object> getHashMapLogin(String msg,String code){
        HashMap<String,Object> resultMap = new HashMap<>();
        resultMap.put("msg", msg);
        resultMap.put("code", code);
        if("1".equals(code)){
            resultMap.put("icon", 1);
        }else{
            resultMap.put("icon",3);
        }
        resultMap.put("anim", 4);
        return resultMap;
    }
}
