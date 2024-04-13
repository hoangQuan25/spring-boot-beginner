package com.hoangquan.springdemo.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class) // use constraints from this validator
@Target({ElementType.METHOD, ElementType.FIELD}) // these constraints are used on methods/object fields
@Retention(RetentionPolicy.RUNTIME) // this annotation and its constraints are used through runtime
public @interface CourseCode {
    // this interface (validation) has two fields, value and error message
    // define default course code
    public String value() default "CN";
    // define default error message
    public String message() default "must start with CN";
    // define default groups
    public Class<?>[] groups() default {}; // groups related constraints
    // define default payload
    public Class<? extends Payload>[] payload() default {}; // payloads provide custom details about validation failure
}
