package com.august.entity;

import com.august.exception.code.ResponseCodeInterface;
import lombok.Data;

import java.io.Serializable;

@Data
public class DataMsg<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer code;// 编号
    private String msg;// 信息
    private T data;// 数据
    private Integer count;// 总数

    private final static String ERROR = "ERROR";
    private final static String SUCCESS = "SUCCESS";
    private final static String NO_DATA = "NO DATA";
    private final static Object NULL = null;

    public DataMsg() {
    }

    public static DataMsg noData() {
        DataMsg dataMsg = new DataMsg();
        dataMsg.setCode(500);
        dataMsg.setMsg(NO_DATA);
        dataMsg.setData(NULL);
        return dataMsg;
    }

    public static DataMsg noData(String msg) {
        DataMsg dataMsg = new DataMsg();
        dataMsg.setCode(500);
        dataMsg.setMsg(msg);
        dataMsg.setData(NULL);
        return dataMsg;
    }

    public static DataMsg success() {
        DataMsg dataMsg = new DataMsg();
        dataMsg.setCode(0);
        dataMsg.setMsg(SUCCESS);
        return dataMsg;
    }

    public static DataMsg success(String msg) {
        DataMsg dataMsg = new DataMsg();
        dataMsg.setCode(0);
        dataMsg.setMsg(msg);
        return dataMsg;
    }

    public static <T> DataMsg success(String msg, T data) {
        DataMsg dataMsg = new DataMsg();
        dataMsg.setCode(0);
        dataMsg.setMsg(msg);
        dataMsg.setData(data);
        return dataMsg;
    }

    public static <T> DataMsg success(String msg, T data, Integer count) {
        DataMsg dataMsg = new DataMsg();
        dataMsg.setCode(0);
        dataMsg.setMsg(msg);
        dataMsg.setData(data);
        dataMsg.setCount(count);
        return dataMsg;
    }

    public static DataMsg error() {
        DataMsg dataMsg = new DataMsg();
        dataMsg.setCode(501);
        dataMsg.setMsg(ERROR);
        return dataMsg;
    }

    public static DataMsg error(String msg) {
        DataMsg dataMsg = new DataMsg();
        dataMsg.setCode(501);
        dataMsg.setMsg(msg);
        return dataMsg;
    }

    public static DataMsg error(Integer code, String msg) {
        DataMsg dataMsg = new DataMsg();
        dataMsg.setCode(code);
        dataMsg.setMsg(msg);
        return dataMsg;
    }

    public DataMsg(ResponseCodeInterface responseCodeInterface) {
        this.code = responseCodeInterface.getCode();
        this.msg = responseCodeInterface.getMsg();
        this.data = null;
        this.count = null;
    }

    public DataMsg(ResponseCodeInterface responseCodeInterface, T data) {
        this.code = responseCodeInterface.getCode();
        this.msg = responseCodeInterface.getMsg();
        this.data = data;
        this.count = null;
    }

    public static DataMsg getResult(ResponseCodeInterface responseCodeInterface) {
        return new DataMsg(responseCodeInterface);
    }

    public static <T> DataMsg getResult(ResponseCodeInterface responseCodeInterface, T data) {
        return new DataMsg(responseCodeInterface, data);
    }
}
