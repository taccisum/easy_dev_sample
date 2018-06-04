package cn.tac.test.easydev.v23.controller;

import cn.tac.framework.easydev.web.response.wrapper.annotation.GenericResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author tac
 * @since 2018/6/4
 */
@RestController
@RequestMapping("swagger_enhance")
public class SwaggerEnhanceController {
    @GetMapping("echo_token")
    @GenericResponse("echo token")
    public String echoToken(HttpServletRequest request) {
        // 配置easy-dev.web.swagger.global-operation-parameters
        String token = request.getHeader("token");
        if (StringUtils.isBlank(token)) {
            return "empty token";
        }
        return token;
    }
}
