package com.mycompany.iudapplication.controller;

import com.mycompany.iudapplication.dao.EmpleadosDAO;
import com.mycompany.iudapplication.domain.Empleados;
import java.sql.SQLException;
import java.util.List;

public class EmpleadosController {

    private EmpleadosDAO empleadoDAO;

    public EmpleadosController() {
        empleadoDAO = new EmpleadosDAO();
    }

    public List<Empleados> obtenerEmpleados() throws SQLException {
        return empleadoDAO.obtenerEmpleados();
    }

    public void CrearEmpleado(Empleados empleado) throws SQLException {
        empleadoDAO.CrearEmpleado(empleado);
    }

    public Empleados ObtenerEmpleado(int id) throws SQLException {
        return empleadoDAO.ObtenerEmpleado(id);
    }

    public void ActualizarEmpleado(int id, Empleados empleados) throws SQLException {
        empleadoDAO.ActualizarEmpleado(id, empleados);
    }

    public void EliminarEmpleado(int id) throws SQLException {
        empleadoDAO.EliminarEmpleado(id);
    }

}
