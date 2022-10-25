package com.example.ejemplo1;

public record PersonaRegistro(String nombre, String apellido) {
    @Override
    public String toString() {
        return "%s %s".formatted(nombre,apellido);
    }
}
