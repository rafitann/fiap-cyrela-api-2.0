package com.fiap.cyrela.exception

import org.springframework.http.HttpStatus

class NotFoundExeption (message: String): ApiException(message) {
    override fun httpStatus(): HttpStatus = HttpStatus.NOT_FOUND
    override fun apiError(): ApiError = ApiError.NOT_FOUND
    override fun userResponseMessage(): Any = "Not found"
}