package ru.faoxis.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by sergei on 8/19/16.
 */
@Configuration // конфигурация, которую следует выполнить до разворачивания контекста спринга
@EnableWebMvc  // включить режим webmvc для контроллеров и рестконтроллеров
@ComponentScan("ru.faoxis.remindme.server") // путь до бинов(классы, сервисы, репозитори и т.д.)
public class WebConfig extends WebMvcConfigurerAdapter {

}
