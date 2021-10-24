package com.person.student.manage.aop;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * ControllerAspect
 *
 * @author: yupei
 * @date: 2021-10-12 13:40:19
 **/
@Aspect
@Slf4j
@Component
public class ControllerAspect {

    @Pointcut(value = "execution(* com.person.student.manage.controller.ScoreController.*(..))")
    public void pointCut() {
        //point cut
    }

    @Around(value = "pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object result;
        Object[] args = joinPoint.getArgs();

        StopWatch stopWatch = new StopWatch();

        String function = joinPoint.getSignature().getName();
        String body = StringUtils.EMPTY;

        stopWatch.start();

        try {
            if (args.length > 0) {
                body = JSONObject.toJSONString(args[0]);
            }

            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            String ip = getRealIp(request);

            log.info("FROM IP:{}, method: [{}] request: {}", ip, function, body);

            result = joinPoint.proceed(args);

        } catch (Exception e) {
            throw e;
        } finally {
            stopWatch.stop();
        }

        log.info("[{}] response: {}, cost: {}", function,
                JSONObject.toJSONString(result), stopWatch.getTotalTimeMillis());

        return result;

    }

    public static String getRealIp(HttpServletRequest request) {
        // 这个一般是Nginx反向代理设置的参数
        String ip = request.getHeader("X-Real-IP");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Forwarded-For");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        // 处理多IP的情况（只取第一个IP）
        if (ip != null && ip.contains(",")) {
            String[] ipArray = ip.split(",");
            ip = ipArray[0];
        }
        return ip;
    }
}
