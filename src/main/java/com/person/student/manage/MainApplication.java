package com.person.student.manage;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.person.student.manage.util.JacksonUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

import java.text.SimpleDateFormat;

/**
 * MainApplication
 *
 * @author: yupei
 * @date: 2021-10-11 15:08:16
 **/
@SpringBootApplication
@EnableTransactionManagement
//@ComponentScan(basePackages = "com.person.student.manage.db")
@MapperScan(basePackages = "com.person.student.manage.db.dao")
@Slf4j
public class MainApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(MainApplication.class, args);
        } catch (Exception e) {
            log.error("Exception:", e);
            throw e;
        }
    }
    /**
     * 注入Jackson转化器
     */
    @Bean
    public HttpMessageConverters jsonHttpMessageConverters() {
        ObjectMapper objectMapper = JacksonUtil.getObjectMapper("yyyy-MM-dd HH:mm:ss");
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter =
                new MappingJackson2HttpMessageConverter(objectMapper);
        return new HttpMessageConverters(mappingJackson2HttpMessageConverter);
    }

}
