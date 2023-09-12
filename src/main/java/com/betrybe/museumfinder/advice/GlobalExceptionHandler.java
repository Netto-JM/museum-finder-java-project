package com.betrybe.museumfinder.advice;

import com.betrybe.museumfinder.exception.InvalidCoordinateException;
import com.betrybe.museumfinder.exception.MuseumNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

/**
 * Global exception handler for handling various exceptions thrown in the application.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

  /**
   * Handle InvalidCoordinateException and return a ResponseEntity with a BAD REQUEST status.
   *
   * @param ex      The InvalidCoordinateException that was thrown.
   * @param request The WebRequest associated with the exception.
   * @return A ResponseEntity with a BAD REQUEST status and an error message.
   */
  @ExceptionHandler(InvalidCoordinateException.class)
  public ResponseEntity<String> handleInvalidCoordinateException(
      InvalidCoordinateException ex) {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Coordenada inválida!");
  }

  /**
   * Handle MuseumNotFoundException and return a ResponseEntity with a NOT FOUND status.
   *
   * @param ex      The MuseumNotFoundException that was thrown.
   * @param request The WebRequest associated with the exception.
   * @return A ResponseEntity with a NOT FOUND status and an error message.
   */
  @ExceptionHandler(MuseumNotFoundException.class)
  public ResponseEntity<String> handleMuseumNotFoundException(
      MuseumNotFoundException ex) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Museu não encontrado!");
  }

  /**
   * Handle generic Exception and return a ResponseEntity with an INTERNAL SERVER ERROR status.
   *
   * @param ex      The Exception that was thrown.
   * @param request The WebRequest associated with the exception.
   * @return A ResponseEntity with an INTERNAL SERVER ERROR status and an error message.
   */
  @ExceptionHandler(Exception.class)
  public ResponseEntity<String> handleGenericException(
      Exception ex) {
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro interno!");
  }
}
