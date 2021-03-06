package com.avosh.baseproject.conf;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class WebConfig implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

    @Override
    public void customize(ConfigurableServletWebServerFactory factory) {
        factory.addErrorPages(new ErrorPage(HttpStatus.FORBIDDEN, "/ns/error/access.xhtml"));
        factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/ns/error/notfound.xhtml"));
        factory.addErrorPages(new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/ns/error/error.xhtml"));
        factory.addErrorPages(new ErrorPage("/ns/error/error.xhtml"));
    }
}