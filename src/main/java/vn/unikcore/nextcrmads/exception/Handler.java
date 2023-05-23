package vn.unikcore.nextcrmads.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import vn.unikcore.nextcrmads.common.helper.ApiResponse;
import vn.unikcore.nextcrmads.config.AppConfig;

@RestControllerAdvice
public class Handler {
    @Autowired
    private AppConfig appConfig;

    @ExceptionHandler({ NotFoundException.class })
    public ResponseEntity<Object> handleNotFoundException (Exception error) {
        Object data = null;
        if (appConfig.debug) {
            data = error;
        }

        return ApiResponse.generateResponse(HttpStatus.NOT_FOUND, true, error.getMessage(), data);
    }

    @ExceptionHandler({ BadRequestException.class })
    public ResponseEntity<Object> handleBadRequestException (Exception error) {
        Object data = null;
        if (appConfig.debug) {
            data = error;
        }

        return ApiResponse.generateResponse(HttpStatus.BAD_REQUEST, true, error.getMessage(), data);
    }

    @ExceptionHandler({ UnAuthorized.class })
    public ResponseEntity<Object> handleUnAuthorizedException (Exception error) {
        Object data = null;
        if (appConfig.debug) {
            data = error;
        }

        return ApiResponse.generateResponse(HttpStatus.UNAUTHORIZED, true, error.getMessage(), data);
    }

    @ExceptionHandler({ Exception.class })
    public ResponseEntity<Object> handleException (Exception error) {
        Object data = null;
        if (appConfig.debug) {
            data = error;
        }

        return ApiResponse.generateResponse(HttpStatus.INTERNAL_SERVER_ERROR, true, error.getMessage(), data);
    }
}
