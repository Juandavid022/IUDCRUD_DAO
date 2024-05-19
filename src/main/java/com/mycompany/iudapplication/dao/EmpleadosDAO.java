package com.mycompany.iudapplication.dao;

import com.mycompany.iudapplication.domain.Empleados;
import com.mycompany.iudapplication.util.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadosDAO {

    private static final String GET_EMPLEADOS = "select * from empleados";

    private static final String CREATE_EMPLEADO = "INSERT INTO empleados (tipoidentificacion, numeroidentificacion, nombres, apellidos, estadocivil, sexo, direccion, telefono, fechanaciemiento, nivelestudioid, universidadid, tituloestudioid) VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    private static final String GET_EMPLEADO_BYID = "select * from empleados where id = ?";

    private static final String UPDATE_EMPLEADO = "UPDATE empleados "
            + "SET tipoidentificacion = ?, numeroidentificacion = ?, nombres = ?, apellidos = ?, estadocivil = ?, sexo = ?, direccion = ?, telefono = ?, fechanaciemiento = ?, nivelestudioid = ?, universidadid = ?, tituloestudioid = ? "
            + " WHERE id =? ";

    private static final String DELETE_EMPLEADO = "delete from empleados where id = ? ";

    public List<Empleados> obtenerEmpleados() throws SQLException {
        Connection con = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Empleados> empleados = new ArrayList();

        try {
            con = ConnectionUtil.getConnection();
            preparedStatement = con.prepareStatement(GET_EMPLEADOS);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Empleados employed = new Empleados();

                employed.setId(resultSet.getInt("id"));
                employed.setTipoIdentificacion(resultSet.getString("tipoIdentificacion"));
                employed.setNumeroIdentificacion(resultSet.getString("numeroidentificacion"));
                employed.setNombre(resultSet.getString("nombres"));
                employed.setApellidos(resultSet.getString("apellidos"));
                employed.setEstadoCivil(resultSet.getString("estadocivil"));
                employed.setSexo(resultSet.getString("sexo"));
                employed.setDireccion(resultSet.getString("direccion"));
                employed.setTelefono(resultSet.getString("telefono"));
                employed.setFechaNacimiento(resultSet.getString("fechanaciemiento"));
                employed.setNivelEstudioId(resultSet.getInt("nivelestudioid"));
                employed.setUniversidadId(resultSet.getInt("universidadid"));
                employed.setTituloEstudioId(resultSet.getInt("tituloestudioid"));

                empleados.add(employed);

            }

            return empleados;
        } finally {
            if (con != null) {
                con.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (resultSet != null) {
                resultSet.close();
            }
        }

    }

    public void CrearEmpleado(Empleados empleado) throws SQLException {
        Connection con = null;
        PreparedStatement preparedStatement = null;

        try {
            con = ConnectionUtil.getConnection();
            preparedStatement = con.prepareStatement(CREATE_EMPLEADO);

            preparedStatement.setString(1, empleado.getTipoIdentificacion());
            preparedStatement.setString(2, empleado.getNumeroIdentificacion());
            preparedStatement.setString(3, empleado.getNombre());
            preparedStatement.setString(4, empleado.getApellidos());
            preparedStatement.setString(5, empleado.getEstadoCivil());
            preparedStatement.setString(6, empleado.getSexo());
            preparedStatement.setString(7, empleado.getDireccion());
            preparedStatement.setString(8, empleado.getTelefono());
            preparedStatement.setString(9, empleado.getFechaNacimiento());
            preparedStatement.setInt(10, empleado.getNivelEstudioId());
            preparedStatement.setInt(11, empleado.getUniversidadId());
            preparedStatement.setInt(12, empleado.getTituloEstudioId());
            preparedStatement.executeUpdate();

        } finally {
            if (con != null) {
                con.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

        }
    }

    public Empleados ObtenerEmpleado(int id) throws SQLException {

        Connection con = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Empleados empleados = null;

        try {
            con = ConnectionUtil.getConnection();
            preparedStatement = con.prepareStatement(GET_EMPLEADO_BYID);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                empleados = new Empleados();

                empleados.setId(resultSet.getInt("id"));
                empleados.setTipoIdentificacion(resultSet.getString("tipoIdentificacion"));
                empleados.setNumeroIdentificacion(resultSet.getString("numeroidentificacion"));
                empleados.setNombre(resultSet.getString("nombres"));
                empleados.setApellidos(resultSet.getString("apellidos"));
                empleados.setEstadoCivil(resultSet.getString("estadocivil"));
                empleados.setSexo(resultSet.getString("sexo"));
                empleados.setDireccion(resultSet.getString("direccion"));
                empleados.setTelefono(resultSet.getString("telefono"));
                empleados.setFechaNacimiento(resultSet.getString("fechanaciemiento"));
                empleados.setNivelEstudioId(resultSet.getInt("nivelestudioid"));
                empleados.setUniversidadId(resultSet.getInt("universidadid"));
                empleados.setTituloEstudioId(resultSet.getInt("tituloestudioid"));
            }

            return empleados;

        } finally {
            if (con != null) {
                con.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (resultSet != null) {
                resultSet.close();
            }
        }

    }

    public void ActualizarEmpleado(int id, Empleados empleados) throws SQLException {

        Connection con = null;
        PreparedStatement preparedStatement = null;

        try {
            con = ConnectionUtil.getConnection();
            preparedStatement = con.prepareStatement(UPDATE_EMPLEADO);

            preparedStatement.setString(1, empleados.getTipoIdentificacion());
            preparedStatement.setString(2, empleados.getNumeroIdentificacion());
            preparedStatement.setString(3, empleados.getNombre());
            preparedStatement.setString(4, empleados.getApellidos());
            preparedStatement.setString(5, empleados.getEstadoCivil());
            preparedStatement.setString(6, empleados.getSexo());
            preparedStatement.setString(7, empleados.getDireccion());
            preparedStatement.setString(8, empleados.getTelefono());
            preparedStatement.setString(9, empleados.getFechaNacimiento());
            preparedStatement.setInt(10, empleados.getNivelEstudioId());
            preparedStatement.setInt(11, empleados.getUniversidadId());
            preparedStatement.setInt(12, empleados.getTituloEstudioId());
            preparedStatement.setInt(13, id);
            preparedStatement.executeUpdate();

        } finally {
            if (con != null) {
                con.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

        }
    }

    public void EliminarEmpleado(int id) throws SQLException {

        Connection con = null;
        PreparedStatement preparedStatement = null;

        try {
            con = ConnectionUtil.getConnection();
            preparedStatement = con.prepareStatement(DELETE_EMPLEADO);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } finally {
            if (con != null) {
                con.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

        }

    }

}
