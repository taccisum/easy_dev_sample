package cn.tac.test.easydev.v23.controller;

import cn.tac.framework.easydev.core.pojo.node.Node;
import cn.tac.framework.easydev.web.response.wrapper.annotation.GenericResponse;
import cn.tac.test.easydev.v23.feature.tree.Foo;
import cn.tac.test.easydev.v23.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tac
 * @since 2018/6/4
 */
@RestController
@RequestMapping("tree")
public class TreeController {
    @Autowired
    private TreeService service;

    @GenericResponse("获取成功")
    @GetMapping("foo")
    public Node<Long, Foo> foo() {
        return service.foo();
    }
}
