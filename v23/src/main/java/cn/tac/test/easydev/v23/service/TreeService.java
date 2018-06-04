package cn.tac.test.easydev.v23.service;

import cn.tac.framework.easydev.core.pojo.node.GenericIntegerSelectedCapableNode;
import cn.tac.framework.easydev.core.pojo.node.Node;
import cn.tac.framework.easydev.core.util.TreeHelper;
import cn.tac.test.easydev.v23.feature.tree.Foo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tac
 * @since 2018/6/4
 */
@Service
public class TreeService {
    public Node<Long, Foo> foo() {
        List<Foo> ls = new ArrayList<>();
        /**
         * 测试数据结构如下
         *         1
         *      /  |  \
         *    2    4    5
         *   /    / \
         *  3    6   7
         *      /
         *     8
         */
        ls.add(new Foo(1L, null));
        ls.add(new Foo(2L, 1L));
        ls.add(new Foo(3L, 2L));
        ls.add(new Foo(4L, 1L));
        ls.add(new Foo(5L, 1L));
        ls.add(new Foo(6L, 4L));
        ls.add(new Foo(7L, 4L));
        ls.add(new Foo(8L, 6L));
        Node<Long, Foo> tree = TreeHelper.build(ls, 1L, GenericIntegerSelectedCapableNode::new);
        StringBuilder sb = new StringBuilder();
        tree.eachPreOrder((node, args) -> sb.append(node.getId()));
        StringBuilder sb1 = new StringBuilder();
        tree.eachPostOrder((node, args) -> sb1.append(node.getId()));

        System.out.println(sb);
        System.out.println(sb1);
        return tree;
    }
}
