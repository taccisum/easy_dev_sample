package cn.tac.test.easydev.v23.service;

import cn.tac.test.easydev.v23.feature.strategy.OSSType;
import cn.tac.test.easydev.v23.feature.strategy.StrategyFactoryFacade;
import org.springframework.stereotype.Service;

/**
 * @author tac
 * @since 2018/6/4
 */
@Service
public class StrategyService {
    public String upload(OSSType type) {
        return StrategyFactoryFacade.getOSSStrategy(type).upload();
    }
}
