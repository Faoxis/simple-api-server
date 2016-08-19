package ru.faoxis.remindme.server;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import ru.faoxis.remindme.server.config.WebConfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by sergei on 8/19/16.
 */
public class ApplicationInitializer implements WebApplicationInitializer {

    private final static String DISPATCHER = "dispatcher";

    // действия до начала разворачивания сервлет-контекста
    public void onStartup(ServletContext servletContext) throws ServletException {
        // создание контекста
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();

        // регистрация конфига
        ctx.register(WebConfig.class);

        servletContext.addListener(new ContextLoaderListener(ctx));

        // DISPATCHER - имя на основе которого будет зарегестрирован диспетчер
        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet(DISPATCHER,
                new DispatcherServlet(ctx));

        servletRegistration.addMapping("/"); // Мапинг сервлета на определенный урл
        servletRegistration.setLoadOnStartup(1); // Указывается порядок инициализации сервлета
    }
}
