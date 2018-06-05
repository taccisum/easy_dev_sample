package cn.tac.test.easydev.v23.feature.entity;

import cn.tac.framework.easydev.dao.core.pojo.BusinessInfoAware;
import cn.tac.framework.easydev.dao.core.pojo.GenericEntityNew;
import cn.tac.framework.easydev.dao.core.strategy.id.AutoIncrementPrimaryKeyGenerator4Long;
import cn.tac.framework.easydev.dao.core.strategy.id.IDGenerator;
import cn.tac.framework.easydev.web.core.pojo.DTO;

import javax.persistence.Table;

/**
 * @author tac
 * @since 2018/6/5
 */
@Table(name = "foo")
public class FooEntity extends GenericEntityNew<Long, Long> implements BusinessInfoAware<Long>, DTO {
    private String field1;
    private Long createdBy;
    private Long updatedBy;
    private Long organizationId;

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    @Override
    public Long getCreatedBy() {
        return createdBy;
    }

    @Override
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public Long getUpdatedBy() {
        return updatedBy;
    }

    @Override
    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public Long getOrganizationId() {
        return organizationId;
    }

    @Override
    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    @Override
    public IDGenerator<Long> idGenerator() {
        return AutoIncrementPrimaryKeyGenerator4Long.instance();
    }
}
