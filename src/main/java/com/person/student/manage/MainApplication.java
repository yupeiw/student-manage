package com.person.student.manage;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * MainApplication
 *
 * @author: yupei
 * @date: 2021-10-11 15:08:16
 **/
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.person.student.manage.db.dao")
@Slf4j
public class MainApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(MainApplication.class, args);
        } catch (Exception e) {
            log.error("Exception:", e);
        }
    }
}
