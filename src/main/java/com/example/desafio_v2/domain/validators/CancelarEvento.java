package com.example.desafio_v2.domain.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

//import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ ElementType.TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = CancelarValidator.class)
@Documented
public @interface CancelarEvento {

    String message() default "Evento não pode ser cancelado hoje!.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
} 