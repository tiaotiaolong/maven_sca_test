package net.tiaotiaolong.maven_test.aaa;

import com.alibaba.fastjson.JSON;
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

        JSONObject jsonObject3= JSON.parseObject(abc);


        JSONArray jsonArray3=JSON.parseArray(abc);


        JSONObject jsonObject4=JSON.parseObject(abc);


        JSONArray jsonArray4=JSON.parseArray(abc);




    }
}
