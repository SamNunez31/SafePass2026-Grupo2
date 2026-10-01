package com.example.safepass.ui

import com.example.safepass.data.Asistente

/**
 * Estados posibles del registro de un asistente.
 *
 * Al ser una sealed class, el compilador conoce todos los casos y obliga
 * a que el `when` de la pantalla los cubra todos (when exhaustivo).
 */
sealed class RegistroState {

    /** Estado inicial: todavía no se ha intentado registrar a nadie. */
    object Idle : RegistroState()

    /** Registro exitoso: guarda el asistente, el precio calculado y un resumen. */
    data class Success(
        val asistente: Asistente,
        val precioFinal: Double,
        val resumen: String
    ) : RegistroState()

    /** Registro fallido: guarda el mensaje que se muestra al usuario. */
    data class Error(val mensaje: String) : RegistroState()
}