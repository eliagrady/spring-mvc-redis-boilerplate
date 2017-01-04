package com.haaretz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by elia.grady on 04/01/2017.
 */

@RestController
@RequestMapping("/")
public class AppController {



  @RequestMapping(value = "/" ,method = RequestMethod.GET)
  public String home() {
    return "index";
  }

  @RequestMapping(value = "/error", method = RequestMethod.GET)
  public String error() {
    return "error";
  }




}
