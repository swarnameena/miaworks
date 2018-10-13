package com.mia.profile.dao;

import com.mia.profile.model.BasicUserPreference;
import com.mia.profile.model.UserMoodMeal;

import javax.xml.ws.Response;

public interface UserProfileDao {

    Response<BasicUserPreference> saveBasicUserPreference(BasicUserPreference basicUserPreference);
    Response<UserMoodMeal> saveUserMoodMealPreference(UserMoodMeal userMoodMeal);

}
