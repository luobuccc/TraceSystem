package com.traceback.common;

/**
 * Created by 53254 on 2018/3/9 20:55 /mmal
 */
public enum UserRoleEnum {
    SYSTEM_ADMIN(1, "系统管理员"),
    ENTERPRISE_ADMIN(10, "企业管理员"),
    SUPERVISE_ADMIN(20, "监管机构管理员"),
    GUEST(30, "一般用户");


    UserRoleEnum(int code, String value) {
        this.value = value;
        this.code = code;
    }

    private int code;
    private String value;

    public String getValue() {
        return value;
    }

    public int getCode() {
        return code;
    }

    public static UserRoleEnum codeOf(int code) {
        for (UserRoleEnum userRoleEnum : values()) {
            if (userRoleEnum.getCode() == code) {
                return userRoleEnum;
            }
        }
        throw new RuntimeException("没有找到对应的枚举");
    }
}

