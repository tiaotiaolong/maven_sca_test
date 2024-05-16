package net.tiaotiaolong.maven_test.aaa;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class A {

    public static void main(String[] args) {

        JSONObject jsonObject=new JSONObject();

        String abc="sss";


        JSONObject jsonObject1=JSONObject.parseObject(abc);


        JSONArray jsonArray=JSONObject.parseArray(abc);


        JSONObject jsonObject2=JSONObject.parseObject(abc);


        JSONArray jsonArray2=JSONObject.parseArray(abc);



    }
}
