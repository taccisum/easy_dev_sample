package cn.tac.test.easydev.v23.feature.strategy;

import cn.tac.framework.easydev.core.domain.strategy.annotation.RegisterStrategy;
import org.springframework.stereotype.Component;

/**
 * @author tac
 * @since 2018/6/4
 */
@RegisterStrategy(type = OSSStrategy.class, key = OSSType.Name.ALI_YUN)
@Component
public class AliUploadStrategy implements OSSStrategy {
    @Override
    public String upload() {
        return "上传阿里云成功";
    }
}
