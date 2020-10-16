package tech.pegasys.net.txapigw.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalControllerExceptionHandler {
  @ExceptionHandler(TxApiGwException.class)
  @ResponseStatus(HttpStatus.INSUFFICIENT_STORAGE)
  public ExceptionResponseBody handle(TxApiGwException ex) {
    return ex.toResponseBody();
  }
}