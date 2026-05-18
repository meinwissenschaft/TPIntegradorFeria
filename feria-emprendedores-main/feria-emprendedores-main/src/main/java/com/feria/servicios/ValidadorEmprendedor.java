package com.feria.servicios;

import com.feria.modelos.Emprendedor;

public class ValidadorEmprendedor {

    public boolean esValido(Emprendedor e) {
        return validarNombre(e.getNombre()) &&
                validarEmail(e.getEmail());
    }

    private boolean validarNombre(String nombre) {
        return nombre != null && nombre.length() >= 2;
    }

    private boolean validarEmail(String email) {
        return email != null && email.contains("@");
    }
}
