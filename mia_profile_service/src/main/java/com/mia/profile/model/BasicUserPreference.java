package com.mia.profile.model;

import java.util.List;
import java.util.Map;

public class BasicUserPreference {
    //required
    String userName;
//    optional
    List<DietaryRestrictions> dietaryRestrictions;
//    required; defaults to any
    List<DietaryPreferences> dietaryPreferences;

}
