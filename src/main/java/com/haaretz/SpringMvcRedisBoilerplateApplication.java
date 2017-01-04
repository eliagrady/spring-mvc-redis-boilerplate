package com.haaretz;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcRedisBoilerplateApplication
//  implements WebApplicationInitializer
{

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcRedisBoilerplateApplication.class, args);
	}


//
//  public void onStartup(ServletContext servletContext) throws ServletException {
//    AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//    ctx.register(AppConfig.class);
//    ctx.setServletContext(servletContext);
//    Dynamic dynamic = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
//    dynamic.addMapping("/");
//    dynamic.setLoadOnStartup(1);
//  }
}
