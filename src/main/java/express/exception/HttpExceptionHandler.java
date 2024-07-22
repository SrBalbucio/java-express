package express.exception;

import express.http.request.Request;
import express.http.response.Response;

import java.awt.image.RescaleOp;

public interface HttpExceptionHandler {

    void handleException(Exception ex, Request request, Response response);
}
