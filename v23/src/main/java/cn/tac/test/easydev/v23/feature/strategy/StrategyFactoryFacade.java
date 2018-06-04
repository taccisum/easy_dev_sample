package cn.tac.test.easydev.v23.feature.strategy;

import cn.tac.framework.easydev.core.domain.strategy.StrategyFactory;

/**
 * @author tac
 * @since 2018/6/4
 */
public abstract class StrategyFactoryFacade {
    public static OSSStrategy getOSSStrategy(OSSType type) {
        return StrategyFactory.get(OSSStrategy.class, type);
    }
}
