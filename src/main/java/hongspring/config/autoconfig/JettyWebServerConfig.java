package hongspring.config.autoconfig;

import hongspring.config.ConditionalMyOnClass;
import hongspring.config.MyAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;

@MyAutoConfiguration
@ConditionalMyOnClass("org.eclipse.jetty.server.Server")
public class JettyWebServerConfig {
    @Bean("jettyWebServerFactory")
    @ConditionalOnMissingBean
    public ServletWebServerFactory serverFactory(){
        return new JettyServletWebServerFactory();
    }
}
