package com.hoangquan.springdemo.mvc.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
        return theCode != null && theCode.startsWith(coursePrefix); // check if our course code starts with the "CN" prefix
    }

    @Override
    public void initialize(CourseCode theCourseCode) {
        coursePrefix = theCourseCode.prefix();
    }
}
