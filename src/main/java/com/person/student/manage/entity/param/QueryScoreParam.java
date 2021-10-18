package com.person.student.manage.entity.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * QueryScoreParam
 *
 * @author yupei
 * @date 2021/10/15 18:22
 */
@Data
public class QueryScoreParam {

    @NotBlank(message = "学号不能为空")
    private String studentNo;
}
