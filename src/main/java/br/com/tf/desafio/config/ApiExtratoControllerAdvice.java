package br.com.tf.desafio.config;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ApiControllerAdvice {

    @ResponseBody
    @ExceptionHandler(Throwable.class)
    ResponseEntity<ErrorResult> customHandler(Exception ex) {
        return new ResponseEntity<>(
            new ErrorResult(new Error(ex.getLocalizedMessage())),
            HttpStatus.INTERNAL_SERVER_ERROR
        );
    }

    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ErrorResult validationExceptionHandler(MethodArgumentNotValidException ex) {
            List<FieldError> errors = ex.getBindingResult().getFieldErrors();
        return new ErrorResult(
            errors.stream().map(Error::new).collect(Collectors.toList())
        );
    }

   

}
