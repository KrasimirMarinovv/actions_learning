/*
 * Project: External-IP-Checker
 *
 * Author: Job Putters
 *
 */
package com.ixbitz.utils.classes;

/**
 * Stores responseCodes and the body of a HttpRequest result
 *
 * @since 1.0-SNAPSHOT
 */
public final class ResponsePair {
    private final int responseCode;
    private final String responseBody;

    public ResponsePair(int responseCode, String responseBody) {
        this.responseCode = responseCode;
        this.responseBody = responseBody;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public String getResponseBody() {
        return responseBody;
    }
}
