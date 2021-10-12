package com.person.student.manage.db.entity.custom;

import com.person.student.manage.db.entity.Student;
import org.apache.commons.lang3.StringUtils;

/**
 * CusStudent
 *
 * @author yupei
 * @date 2021/10/12 10:12
 */
public class CusStudent extends Student {

    public String getSex(){
        if(super.getGender() == null){
            return "未知";
        }
        if(super.getGender()==1){
            return "女";
        }else if(super.getGender() == 0){
            return "男";
        }else {
            return "未知";
        }
    }
}
