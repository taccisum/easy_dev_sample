package cn.tac.test.easydev.v23.feature.entity;

import cn.tac.framework.easydev.service.crud.CrudServiceSupport;
import org.springframework.stereotype.Service;

/**
 * @author tac
 * @since 2018/6/5
 */
@Service
public class FooService extends CrudServiceSupport<FooEntity, Long> {
    public FooService(FooRepository repository) {
        super(repository);
    }
}
