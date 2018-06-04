package cn.tac.test.easydev.v23.feature.strategy;

import cn.tac.framework.easydev.core.domain.strategy.annotation.RegisterStrategy;
import org.springframework.stereotype.Component;

/**
 * @author tac
 * @since 2018/6/4
 */
@RegisterStrategy(type = OSSStrategy.class, key = OSSType.Name.QI_NIU_YUN)
@Component
public class QiNiuUploadStrategy implements OSSStrategy {
    @Override
    public String upload() {
        return "上传七牛云成功";
    }
}
