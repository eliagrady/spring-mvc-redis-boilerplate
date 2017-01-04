package com.haaretz.service;

import com.haaretz.dao.UserSubmissionDao;
import com.haaretz.entities.UserSubmission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by elia.grady on 04/01/2017.
 */

@Service
public class UserSubmissionService {

  @Autowired
  private UserSubmissionDao userSubmissionDao;



  public Collection<UserSubmission> getAllUserSubmissions() {
    return userSubmissionDao.getAllUserSubmissions();
  }


  public UserSubmission getUserSubmissionById(int id) {
    return userSubmissionDao.getUserSubmissionById(id);
  }


}
