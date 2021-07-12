package com.jin.domain;

/**
 * @Author: JinBo
 * @Date: 2021/7/10 16:37
 * @Version: 1.0
 */
public class CommonResult {
    // 表示本次请求是否成功， 0成功， 1失败
    private int state;
    // 错误信息
    private String msg;
    // 数据
    private Object data;

    public CommonResult() {
    }

    public CommonResult(int state, String msg, Object data) {
        this.state = state;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "state=" + state +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
