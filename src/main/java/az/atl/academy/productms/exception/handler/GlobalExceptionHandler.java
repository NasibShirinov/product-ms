package az.atl.academy.productms.exception.handler;

import az.atl.academy.productms.model.responseDto.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorDto> handleIllegalArgumentException (NullPointerException nullPointerException) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ErrorDto(404,
                        nullPointerException.getMessage(),
                        LocalDateTime.now()));
    }
}