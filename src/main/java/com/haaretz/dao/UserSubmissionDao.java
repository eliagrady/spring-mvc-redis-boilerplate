package com.haaretz.dao;

import com.haaretz.entities.UserSubmission;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by elia.grady on 04/01/2017.
 */

@Repository
public class UserSubmissionDao {

  private static Map<Integer, UserSubmission> userSubmissionMap;

  static {

    userSubmissionMap = new HashMap<Integer, UserSubmission>() {
      {
        put(1, new UserSubmission("Elia", "Grady", "elia.grady@haaretz.co.il"));
        put(2, new UserSubmission("Tomer", "Banin", "tomer.banin@themarker.com"));
      }
    };

  }


  public Collection<UserSubmission> getAllUserSubmissions() {
    return this.userSubmissionMap.values();
  }

  public UserSubmission getUserSubmissionById(int id) {
    return userSubmissionMap.get(id);
  }

  public void updateUserSubmissionById(UserSubmission userSubmission) {
    UserSubmission submission = userSubmissionMap.get(userSubmission.getEmail());
  }

}
