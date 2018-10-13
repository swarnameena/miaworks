package com.mia.profile.service;

import com.mia.profile.model.BasicUserPreference;
import com.mia.profile.model.UserMoodMeal;

import javax.xml.ws.Response;

public interface UserProfileService {
    Response<BasicUserPreference> saveBasicUserPreference(BasicUserPreference basicUserPreference);
    Response<UserMoodMeal> saveUserMoodMealPreference(UserMoodMeal userMoodMeal);
}
