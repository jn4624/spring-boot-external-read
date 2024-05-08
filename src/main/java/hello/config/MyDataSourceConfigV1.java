package hello.config;

import hello.datasource.MyDataSource;
import hello.datasource.MyDataSourcePropertiesV1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;

/**
 * 수동 등록: @EnableConfigurationProperties 사용
 * 자동 등록: @ConfigurationPropertiesScan 사용
 */
@Slf4j
//@EnableConfigurationProperties(MyDataSourcePropertiesV1.class)
public class MyDataSourceConfigV1 {
    private final MyDataSourcePropertiesV1 properties;

    public MyDataSourceConfigV1(MyDataSourcePropertiesV1 properties) {
        this.properties = properties;
    }

    @Bean
    public MyDataSource dataSource() {
        return new MyDataSource(
                properties.getUrl(),
                properties.getUsername(),
                properties.getPassword(),
                properties.getEtc().getMaxConnection(),
                properties.getEtc().getTimeout(),
                properties.getEtc().getOptions()
        );
    }
}
