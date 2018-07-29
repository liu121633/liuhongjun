package org.liuhongjun.data;


public class ApiRequestVo {

    private String message;

    private Integer state;

    private Object data;


    public ApiRequestVo() {
        this.message = "success";
        this.state = 1;
    }

    public ApiRequestVo(Object data) {
        this.message = "success";
        this.state = 1;
        this.data = data;
    }

    public ApiRequestVo(String message) {
        this.message = message;
        this.state = 1;
    }


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
