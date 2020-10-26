package com.august.exception.code;

public enum BaseResponseCode implements ResponseCodeInterface {

    SUCCESS(0,"成功"),
    SYSTEM_ERROR(701,"系统异常"),
    DATA_ERROR(702,"数据异常"),
    VALIDATOR_ERROR(703,"参数校验异常"),
    ACCOUNT_ERROR(704,"该账号不存在，请重新输入"),
    ACCOUNT_LOCK(705,"该账号已被锁定，请联系管理员"),
    ACCOUNT_PASSWORD_ERROR(706,"密码验证错误，请重新登录"),
    TOKEN_NOT_NULL(707,"认证token不能为空，请重新登录获取"),
    AUTHORIZATION_TOKEN_ERROR(707,"token认证失败，请重新登录获取最新的token"),
    ACCOUNT_LOCKED(707,"该账号已被锁定，请联系管理员"),
    ACCOUNT_HAS_DELETED_ERROR(707,"该账号已被删除，请联系管理员"),
    TOKEN_PAST_DUE(708,"token失效，请刷新token"),
    ;

    private final int code;
    private final String msg;

    BaseResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
