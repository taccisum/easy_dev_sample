package cn.tac.test.easydev.v23.service;

import cn.tac.framework.easydev.core.domain.strategy.StrategyFactory;
import cn.tac.test.easydev.v23.feature.strategy.OSSStrategy;
import cn.tac.test.easydev.v23.feature.strategy.OSSType;
import org.springframework.stereotype.Service;

/**
 * @author tac
 * @since 2018/6/4
 */
@Service
public class StrategyService {
    public String upload(OSSType type) {
        return StrategyFactory.get(OSSStrategy.class, type).upload();
    }
}
