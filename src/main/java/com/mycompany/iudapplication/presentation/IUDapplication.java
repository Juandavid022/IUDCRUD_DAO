package com.mycompany.iudapplication.presentation;

import com.mycompany.iudapplication.controller.EmpleadosController;
import com.mycompany.iudapplication.domain.Empleados;
import java.sql.SQLException;
import java.util.List;

public class IUDapplication {

    public static void obtenerEmpleados(EmpleadosController empleadosController) {
        try {
            List<Empleados> empleados = empleadosController.obtenerEmpleados();

            if (empleados.isEmpty()) {
                System.out.println("no hay empleados");
            } else {
                empleados.forEach(empleado -> {
                    System.out.println("id: " + empleado.getId());
                    System.out.println("tipoIdentificacion: " + empleado.getId());
                    System.out.println("numeroIdentificacion: " + empleado.getId());
                    System.out.println("nombre: " + empleado.getNombre());
                    System.out.println("apellidos: " + empleado.getApellidos());
                    System.out.println("estadoCivil: " + empleado.getEstadoCivil());
                    System.out.println("sexo: " + empleado.getSexo());
                    System.out.println("direccion: " + empleado.getDireccion());
                    System.out.println("telefono: " + empleado.getTelefono());
                    System.out.println("fechaNacimiento: " + empleado.getFechaNacimiento());
                    System.out.println("nivelEstudioId: " + empleado.getNivelEstudioId());
                    System.out.println("universidadId: " + empleado.getUniversidadId());
                    System.out.println("tituloEstudioId: " + empleado.getTituloEstudioId());
                    System.out.println("-------------------------------------");

                });
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        EmpleadosController empleadosController = new EmpleadosController();
        obtenerEmpleados(empleadosController);

    }
}
