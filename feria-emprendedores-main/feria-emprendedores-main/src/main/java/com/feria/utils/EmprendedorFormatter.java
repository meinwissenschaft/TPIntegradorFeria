package com.feria.utils;

import com.feria.modelos.Emprendedor;
import com.feria.modelos.Producto;

public class EmprendedorFormatter {

    public static String formatear(Emprendedor e) {
        StringBuilder sb = new StringBuilder();
        sb.append("Emprendedor: ").append(e.getNombre()).append("\n")
                .append("ID: ").append(e.getIdentificador()).append("\n")
                .append("Contacto: ").append(e.getTelefono()).append(" | ").append(e.getEmail()).append("\n")
                .append("Categoría: ").append(e.getCategoria()).append("\n")
                .append("Productos:\n");

        for (Producto p : e.getProductos()) {
            sb.append("  - ").append(p.getNombre())
                    .append(" ($").append(p.getPrecio()).append(")\n");
        }
        return sb.toString();
    }
}