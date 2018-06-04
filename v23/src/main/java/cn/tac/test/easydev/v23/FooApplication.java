package cn.tac.test.easydev.v23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author tac
 * @since 2018/6/4
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class FooApplication {
    public static void main(String[] args) {
        SpringApplication.run(FooApplication.class, args);
    }
}
