package com.haaretz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by elia.grady on 04/01/2017.
 */

@Controller
@RequestMapping("/")
public class AppController {



  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String homepage() {
    return "index";
  }

  /**
   * generic Spring MVC error handler
   *
   * @param e - the exception
   * @return a view name
   * @link http://static.springsource.org/spring/docs/3.2.x/spring-framework-reference/html/mvc.html#mvc-ann-exceptionhandler
   */
  @ExceptionHandler(Exception.class)
  public ModelAndView exceptionHandler(Exception e) {
    ModelAndView mv = new ModelAndView("error");
    StringBuilder stackTrace = new StringBuilder();
    renderStackTrace(e, stackTrace);
    mv.addObject("exceptionMessage", e.getMessage());
    mv.addObject("exceptionStackTrace", stackTrace.toString());
    return mv;
  }

  public void renderStackTrace(Throwable e, StringBuilder stackTrace) {
    for (StackTraceElement stackTraceElement : e.getStackTrace()) {
      stackTrace.append("<div class=\"stack-trace\">").append(stackTraceElement.toString()).append("</div>");
    }
    if (e.getCause() != null && e.getCause() != e) {
      stackTrace.append("<div class=\"caused-by\">").append("caused by ").append(e.getCause().getClass()).append(" - ").append(e.getCause().getMessage()).append("</div>");
      renderStackTrace(e.getCause(), stackTrace);
    }
  }


}
