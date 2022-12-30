package com.example.demo.service;

import com.example.demo.dto.Operaciones;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

    public Object suma(Operaciones operaciones) {
        operaciones.setSuma(operaciones.getNumeroUno() + operaciones.getNumeroDos());

        return operaciones.getSuma();
    }

    public Object resta(Operaciones operaciones) {
        operaciones.setResta(operaciones.getNumeroUno() - operaciones.getNumeroDos());
        return operaciones.getResta();

    }

    public Object multiplicacion(Operaciones operaciones) {
        operaciones.setMultiplicacion(operaciones.getNumeroUno() * operaciones.getNumeroDos());

        return operaciones.getMultiplicacion();

    }

    public Object division(Operaciones operaciones) {
        operaciones.setDivision(operaciones.getNumeroUno() / operaciones.getNumeroDos());

        return operaciones.getDivision();

    }

}
