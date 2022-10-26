package com.example.ejemplo1;

public record Persona(String nombre, String apellido) {
    @Override
    public String toString() {
        //borre esto
        //System.out.println("Esta instruccion es inservible");
        return "%s %s".formatted(nombre,apellido);
    }
}
