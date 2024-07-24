package de.neuefische.springexceptionhandlingtask;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    public CustomErrorMessage handleNullPointerException(NullPointerException e) {
        return new CustomErrorMessage(
                e.getMessage(),
                LocalDateTime.now(),
                "",
                500);
    }
}
