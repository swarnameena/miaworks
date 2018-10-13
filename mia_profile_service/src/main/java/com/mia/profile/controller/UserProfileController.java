package com.mia.profile.controller;

import com.mia.profile.model.BasicUserPreference;
import com.mia.profile.model.UserMoodMeal;

import javax.xml.ws.Response;

public interface UserProfileController {
    Response<BasicUserPreference> saveBasicUserPreference(BasicUserPreference basicUserPreference);
    Response<UserMoodMeal> saveUserMoodMealPreference(UserMoodMeal userMoodMeal);

}
