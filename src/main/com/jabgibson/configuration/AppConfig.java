package main.com.jabgibson.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by bgibson on 4/30/16.
 */
@Configuration
@ComponentScan("main.com.jabgibson.controller")
@EnableWebMvc
public class AppConfig {

}
