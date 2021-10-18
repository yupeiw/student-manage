package com.person.student.manage.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;

/**
 * JacksonUtil
 *
 * @author yupei
 * @date 2021/10/15 22:59
 */
public class JacksonUtil {

    /**
     * 创建初始化信息
     *
     * @param dateFormat 时间格式
     * @return objectMapper
     */
    public static ObjectMapper getObjectMapper(String dateFormat) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        // 解析器支持解析单引号
        objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        // 解析器支持非双引号
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        // 解析器支持解析结束符
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        if (StringUtils.isNotEmpty(dateFormat)) {
            // 设置当前json格式日期格式
            objectMapper.setDateFormat(new SimpleDateFormat(dateFormat));
        }
        return objectMapper;
    }
}
