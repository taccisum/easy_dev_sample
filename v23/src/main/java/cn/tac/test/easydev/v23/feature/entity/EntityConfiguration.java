package cn.tac.test.easydev.v23.feature.entity;

import cn.tac.framework.easydev.dao.core.bean.RuntimeData4Dao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tac
 * @since 2018/6/5
 */
@Configuration
public class EntityConfiguration {
    @Bean
    public RuntimeData4Dao runtimeData4Dao() {
        return new RuntimeData4Dao() {
            @Override
            public Long userId() {
                return 233L;
            }

            @Override
            public Long organizationId() {
                return 1L;
            }
        };
    }
}
