package vn.unikcore.nextcrmads.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.ClassNotFoundException;
import vn.unikcore.nextcrmads.common.helper.ApiResponse;
import vn.unikcore.nextcrmads.config.AppConfig;

@RestControllerAdvice
public class Handler implements AuthenticationEntryPoint {
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

    @ExceptionHandler({ ClassNotFoundException.class })
    public ResponseEntity<Object> handleAuthenticationException (Exception error) {
        Object data = null;
        if (appConfig.debug) {
            data = error;
        }

        return ApiResponse.generateResponse(HttpStatus.UNAUTHORIZED, true, error.getMessage(), data);
    }
    
    @ExceptionHandler({ Exception.class, AccessDeniedException.class, UnsupportedOperationException.class })
    public ResponseEntity<Object> handleException (Exception error) {
        Object data = null;
        if (appConfig.debug) {
            data = error;
        }

        return ApiResponse.generateResponse(HttpStatus.INTERNAL_SERVER_ERROR, true, error.getMessage(), data);
    }

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
            AuthenticationException authException) throws IOException, ServletException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'commence'");
    }
}
