package cn.tac.test.easydev.v23.feature.entity;

import cn.tac.framework.easydev.dao.core.CrudMapperSupport;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author tac
 * @since 2018/6/5
 */
@Mapper
public interface FooMapper extends CrudMapperSupport<FooEntity> {
}
