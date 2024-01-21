package com.football.prediction.TiresiasProphetPredictions.exceptions;

/**
 * Custom exception class for RapidApi
 */
public class RapidApiException extends RuntimeException {

    public RapidApiException(String message) {
        super(message);
    }

    public RapidApiException(String message, Throwable cause) {
        super(message, cause);
    }
}
