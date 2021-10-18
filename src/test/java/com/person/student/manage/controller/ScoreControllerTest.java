package com.person.student.manage.controller;

import com.person.student.manage.MainApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * ScoreControllerTest
 *
 * @author: yupei
 * @date: 2021-10-15 19:40:29
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainApplication.class)
@Slf4j
public class ScoreControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        //MockMvcBuilders.webAppContextSetup(WebApplicationContext context)：
        //指定WebApplicationContext，将会从该上下文获取相应的控制器并得到相应的MockMvc；
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void queryScore() throws Exception {
        String params = "{\"studentNo\":\"2020030417\"}";
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/score/query")
                .content(params)
                .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
                .accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andReturn();
        log.info("result:{}",mvcResult.getResponse().getContentAsString());
        int status = mvcResult.getResponse().getStatus();
        Assert.assertEquals(200, status);
    }
}



