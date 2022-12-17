package com.ejercicioCinco;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save(Coche coche) {
        System.out.println("Nombre del metodo: save");

    }

    @Override
    public List<Coche> findAll() {
        System.out.println("Nombre del metodo: findAll");
        return null;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("Nombre del metodo: delete");
    }
}
