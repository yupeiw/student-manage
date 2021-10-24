package com.person.student.manage.constant;

import lombok.Getter;

/**
 * PostCommonError
 *
 * @author: yupei
 * @date: 2021-10-15 18:15:50
 **/
public enum PostCommonError {

    /**
     * 公共错误 100 - 999
     */
    ERROR_CODE_NOT_CONFIGURED(100, "错误码未配置"),

    /**
     * 学生相关错误 1000-1099
     */
    STUDENT_NOT_EXIST_ERROR(1000, "学生不存在"),

    ;

    /**
     * 错误码
     */
    @Getter
    private int code;
    /**
     * 错误信息
     */
    @Getter
    private String error;

    PostCommonError(int code, String error) {
        this.code = code;
        this.error = error;
    }
}
