//package com.haaretz.config;
//
//import freemarker.template.utility.XmlEscape;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
//import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * Created by elia.grady on 04/01/2017.
// */
//@Configuration
//@EnableWebMvc
//public class AppConfig extends WebMvcConfigurerAdapter {
//
//
//  @Bean(name ="freemarkerConfig")
//  public FreeMarkerConfigurer freemarkerConfig() {
//    FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
//    configurer.setTemplateLoaderPath("/templates/");
//    Map<String, Object> map = new HashMap<>();
//    map.put("xml_escape", new XmlEscape());
//    configurer.setFreemarkerVariables(map);
//    return configurer;
//  }
//
//  @Bean
//  public ViewResolver getViewResolver() {
//    FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
//    resolver.setCache(false);
//    resolver.setPrefix("/templates/");
//    resolver.setSuffix(".ftl");
//    return resolver;
//  }
//
////  @Override
////  public void configureDefaultServletHandling(
////    DefaultServletHandlerConfigurer configurer) {
////    configurer.enable();
////  }
//}
