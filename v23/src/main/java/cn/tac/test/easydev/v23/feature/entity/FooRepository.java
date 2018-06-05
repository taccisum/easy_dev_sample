package cn.tac.test.easydev.v23.feature.entity;

import cn.tac.framework.easydev.dao.crud.CrudRepositorySupport;
import org.springframework.stereotype.Repository;

/**
 * @author tac
 * @since 2018/6/5
 */
@Repository
public class FooRepository extends CrudRepositorySupport<FooEntity, Long> {
    public FooRepository(FooMapper mapper) {
        super(mapper, FooEntity.class);
    }
}
