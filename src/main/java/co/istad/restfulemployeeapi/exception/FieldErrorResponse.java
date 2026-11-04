package co.istad.restfulemployeeapi.exception;

import lombok.Builder;

@Builder
public record FieldErrorResponse(

        String field,

        String message

) {
}