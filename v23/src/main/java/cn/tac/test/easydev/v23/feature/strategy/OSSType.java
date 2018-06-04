package cn.tac.test.easydev.v23.feature.strategy;

import cn.tac.framework.easydev.core.domain.strategy.pojo.KeyCarrier;

/**
 * @author tac
 * @since 2018/6/4
 */
public enum OSSType implements KeyCarrier {
    QI_NIU_YUN(Name.QI_NIU_YUN),
    ALI_YUN(Name.ALI_YUN),
    TECENT_YUN(Name.TECENT_YUN),
    HUAWEI_YUN(Name.HUAWEI_YUN);

    private String key;

    OSSType(String key) {
        this.key = key;
    }

    @Override
    public String key() {
        return name();
    }

    interface Name {
        String QI_NIU_YUN = "QI_NIU_YUN";
        String ALI_YUN = "ALI_YUN";
        String TECENT_YUN = "TECENT_YUN";
        String HUAWEI_YUN = "HUAWEI_YUN";
    }
}
