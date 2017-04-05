package com.example.administrator.eventbus;

/**
 * Created by Administrator on 2017/4/5.
 */

public class FirstEvent {
    private String mMsg;
    public FirstEvent(String msg) {
        // TODO Auto-generated constructor stub
        mMsg = msg;
    }
    public String getMsg(){
        return mMsg;
    }
}
