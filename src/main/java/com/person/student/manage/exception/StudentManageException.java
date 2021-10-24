package com.person.student.manage.exception;

import com.person.student.manage.constant.PostCommonError;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * StudentManageException
 *
 * @author yupei
 * @date 2021/10/15 18:13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class StudentManageException extends Exception {

    private static final long serialVersionUID = 8013668184057210247L;

    private Integer code;
    private String msg;

    public StudentManageException(Integer code, String msg) {
        super(code + "|" + msg);
        this.code = code;
        this.msg = msg;
    }

    public StudentManageException(PostCommonError error) {
        super(error.getCode() + "|" + error.getError());
        this.code = error.getCode();
        this.msg = error.getError();
    }

    public StudentManageException(PostCommonError error, Throwable e) {
        super(error.getCode() + "|" + error.getError(), e);
        this.code = error.getCode();
        this.msg = error.getError();
    }

    public StudentManageException(String message, Throwable e) {
        super(message, e);
        this.code = PostCommonError.ERROR_CODE_NOT_CONFIGURED.getCode();
        this.msg = message;
    }

    private StudentManageException() {
        throw new IllegalStateException("Constant Class");
    }


}
