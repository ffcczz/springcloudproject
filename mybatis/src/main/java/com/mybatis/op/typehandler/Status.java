package com.mybatis.op.typehandler;

import lombok.Getter;

/**
 * 状态枚举
 */
public enum Status  implements BaseEnum{
    RUNNING(100, "running"),
    BLOCKED(101, "blocked"),
    STOPPED(102, "stopped");

    @Getter
    private int code;
    @Getter
    private String desc;

    Status(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}
