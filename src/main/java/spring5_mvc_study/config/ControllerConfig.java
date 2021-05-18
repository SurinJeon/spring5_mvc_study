package spring5_mvc_study.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"spring5_mvc_study.controller"}) // controller는 scanner기능만 하겠다는 것(빈만 등록)
public class ControllerConfig {
	// ComponentScan 해서 따로 작성할 필요 없음
}
