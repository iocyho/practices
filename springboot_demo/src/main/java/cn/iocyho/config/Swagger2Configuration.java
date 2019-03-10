package cn.iocyho.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Program practices
 * @Description TODO
 * @Author cyh
 * @Date 2019/3/10 17:06
 * @Version V1.0
 **/
@Configuration
@EnableSwagger2
public class Swagger2Configuration {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.iocyho"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * @Description 自定义Api文档信息
     * @Author cyh
     * @Date 17:27 2019/3/10
     * @Param []
     * @return springfox.documentation.service.ApiInfo
     **/
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("用户管理平台对外接口")
                .description("1.提供用户管理服务后台使用的接口 2.提供对其他服务调用的服务")
                .version("1.0")
                .build();
    }
}
