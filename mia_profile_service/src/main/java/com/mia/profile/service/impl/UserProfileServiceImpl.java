package com.mia.profile.service.impl;

import com.mia.profile.dao.UserProfileDao;
import com.mia.profile.model.BasicUserPreference;
import com.mia.profile.model.UserMoodMeal;
import com.mia.profile.service.UserProfileService;
import sun.plugin.util.UserProfile;

import javax.xml.ws.Response;

public class UserProfileServiceImpl implements UserProfileService {

    UserProfileDao userProfileDao;
    // call this for both create & update
    public Response<BasicUserPreference> saveBasicUserPreference(BasicUserPreference basicUserPreference) {
        return null;
    }

    public Response<UserMoodMeal> saveUserMoodMealPreference(UserMoodMeal userMoodMeal) {
        return null;
    }
}
