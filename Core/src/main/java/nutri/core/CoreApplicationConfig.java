package nutri.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan
@EnableTransactionManagement
@PropertySource({ "classpath:config/core-application.properties" })
// @Import({ SchedulerConfig.class })
public class CoreApplicationConfig {

}