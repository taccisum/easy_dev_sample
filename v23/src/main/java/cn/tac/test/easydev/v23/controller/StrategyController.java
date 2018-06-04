package cn.tac.test.easydev.v23.controller;

import cn.tac.framework.easydev.web.response.wrapper.annotation.GenericResponse;
import cn.tac.test.easydev.v23.feature.strategy.OSSType;
import cn.tac.test.easydev.v23.service.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tac
 * @since 2018/6/4
 */
@RestController
@RequestMapping("strategy")
public class StrategyController {
    @Autowired
    private StrategyService service;

    @PostMapping("upload")
    @GenericResponse("上传成功")
    public String upload(@RequestParam OSSType type) {
        return service.upload(type);
    }
}
