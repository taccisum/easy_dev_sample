package cn.tac.test.easydev.v23.controller;

import cn.tac.framework.easydev.web.controller.crud.CrudControllerSupport;
import cn.tac.test.easydev.v23.feature.entity.FooEntity;
import cn.tac.test.easydev.v23.feature.entity.FooService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tac
 * @since 2018/6/5
 */
@RestController
@RequestMapping("entity")
public class EntityController extends CrudControllerSupport<FooEntity, Long, FooEntity, FooEntity> {
    public EntityController(FooService service) {
        super(service);
    }

    @Override
    public FooEntity convertCreationModel2Entity(FooEntity fooEntity) {
        return fooEntity;
    }

    @Override
    public FooEntity convertUpdatingModel2Entity(Long id, FooEntity fooEntity) {
        fooEntity.setId(id);
        return fooEntity;
    }
}
