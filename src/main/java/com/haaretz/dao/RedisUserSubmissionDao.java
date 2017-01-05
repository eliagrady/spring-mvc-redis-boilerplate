//package com.haaretz.dao;
//
//import com.haaretz.entities.UserSubmission;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.util.*;
//
///**
// * Created by elia.grady on 04/01/2017.
// */
//
//@Repository
//public class RedisUserSubmissionDao {
//
//  private static Map<Integer, UserSubmission> userSubmissionMap;
//
//  @Autowired
//  RedisTemplate<String, UserSubmission> template;
//
//  private static final String USER_SUBMISSIONS = "USER_SUBMISSIONS";
//
//  {
//
//    UserSubmission userSubmission1 = new UserSubmission("Elia", "Grady", "elia.grady@haaretz.co.il");
//    UserSubmission userSubmission2 = new UserSubmission("Tomer", "Banin", "tomer.banin@themarker.com");
//    template.opsForHash().putIfAbsent(USER_SUBMISSIONS, userSubmission1)
//
//  }
//
//
//  public Collection<UserSubmission> getAllUserSubmissions() {
//    List<UserSubmission> userSubmissionList = new ArrayList<>();
//
//  }
//
//  public UserSubmission getUserSubmissionById(int id) {
//
//    return userSubmissionMap.get(id);
//  }
//
//  public void updateUserSubmissionById(UserSubmission userSubmission) {
//    UserSubmission submission = userSubmissionMap.get(userSubmission.getEmail());
//  }
//
//}
