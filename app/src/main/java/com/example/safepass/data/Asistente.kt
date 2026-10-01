package com.example.safepass.data

/**
 * Modelo de datos inmutable de un asistente al evento.
 *
 * - Todas las propiedades son `val`: una vez creado, el objeto no cambia.
 * - `edad` es `Int?` porque puede venir nula o inválida cuando el texto
 *   ingresado no se puede convertir con `toIntOrNull()`.
 */
data class Asistente(
    val nombre: String,
    val edad: Int?,
    val tipoEntrada: String
)