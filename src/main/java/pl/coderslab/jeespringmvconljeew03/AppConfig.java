package pl.coderslab.jeespringmvconljeew03;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("pl.coderslab.jeespringmvconljeew03")
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {
}
