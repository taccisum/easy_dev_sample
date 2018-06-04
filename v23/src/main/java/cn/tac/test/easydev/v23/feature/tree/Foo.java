package cn.tac.test.easydev.v23.feature.tree;

import cn.tac.framework.easydev.core.pojo.node.NodeMinStructureAware;

/**
 * @author tac
 * @since 2018/6/4
 */
public class Foo implements NodeMinStructureAware<Long> {
    private Long id;
    private Long parentId;
    private String field1;

    public Foo(Long id, Long parentId) {
        this.id = id;
        this.parentId = parentId;
        this.field1 = "field1";
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }
}
