package com.aluraCursos.forohub.domain.infra.errores;
public class ValidacionDeIntegridad extends RuntimeException {
    public ValidacionDeIntegridad(String s) {
        super(s);
    }
}