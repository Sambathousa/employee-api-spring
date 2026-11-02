package co.istad.restfulemployeeapi.exception;

import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;

@Builder
public record ErrorResponse(

        Boolean status,

        Integer code,

        String message,

        List<FieldErrorResponse> errors,

        LocalDateTime timestamp

) {
}
