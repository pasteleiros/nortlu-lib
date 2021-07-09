package io.github.pasteleiros.nortlulib.exception

import kotlin.Exception

open class BaseException(msg : String = "Ocorreu um erro inesperado"):Exception(msg)
class NaoEncontradoException(msg : String):BaseException(msg)
class ServicoException(msg : String):BaseException(msg)
class ValidacaoException(msg : String):BaseException(msg)