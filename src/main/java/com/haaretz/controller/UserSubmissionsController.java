package com.haaretz.controller;

import com.haaretz.entities.UserSubmission;
import com.haaretz.service.UserSubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by elia.grady on 04/01/2017.
 */

@RestController
@RequestMapping("/usersubmissions")
public class UserSubmissionsController {

  @Autowired
  private UserSubmissionService userSubmissionService;


  @RequestMapping(method = RequestMethod.GET)
  public Collection<UserSubmission> getAllUserSubmissions() {
    return userSubmissionService.getAllUserSubmissions();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public UserSubmission getUserSubmissionById(@PathVariable("id") int id) {
    return userSubmissionService.getUserSubmissionById(id);
  }






}
