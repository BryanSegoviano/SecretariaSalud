package accesoDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CitasDAO {

    private Connection conexion;
    private PreparedStatement sentenciaPreparada;
    private ResultSet resultado;

    public boolean registrarCita(String idcita, String idhabitante, String idtrabajadorsalud, Date fecha) {
        boolean registro = false;
        try {
            conexion = ConexionBD.conectar();
            String consulta = "INSERT INTO citas(idcita, idhabitante, idtrabajadorsalud, fecha) VALUES(?, ?, ?, ?);";
            sentenciaPreparada = conexion.prepareStatement(consulta);
            sentenciaPreparada.setString(1, idcita);
            sentenciaPreparada.setString(2, idhabitante);
            sentenciaPreparada.setString(3, idtrabajadorsalud);
            sentenciaPreparada.setDate(4, fecha);
            int resultadoInsercion = sentenciaPreparada.executeUpdate();
            if (resultadoInsercion > 0) {
                registro = true;
                System.out.println("Se guardó la cita");
            } else {
                registro = false;
                System.out.println("No se ha podido guardar la cita");
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("AError: " + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println("BError: " + e);
            }
        }
        System.out.println("Valor del registro: " + registro);
        return registro;
    }

    public boolean buscarUsuarioInicioSesion(String usuario, String contra) {
        boolean iniciarSesion = false;
        try {
            conexion = ConexionBD.conectar();
            String consulta = "SELECT nombre, contrasenia FROM profesores WHERE nombre=? AND contrasenia=?";
            sentenciaPreparada = conexion.prepareStatement(consulta);
            sentenciaPreparada.setString(1, usuario);
            sentenciaPreparada.setString(2, contra);
            resultado = sentenciaPreparada.executeQuery();
            if (resultado.next()) {
                iniciarSesion = true;
            } else {
                iniciarSesion = false;
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println("Error: " + e);
            }
        }
        return iniciarSesion;
    }

    public String buscarNombre(String usuario) {
        String nombre = null;
        try {
            conexion = ConexionBD.conectar();
            String consulta = "SELECT nombre FROM seguridad.usuarios WHERE nombre=?";
            sentenciaPreparada = conexion.prepareStatement(consulta);
            sentenciaPreparada.setString(1, usuario);
            resultado = sentenciaPreparada.executeQuery();

            if (resultado.next()) {
                nombre = resultado.getString("nombre");
            } else {
                nombre = null;
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println("Error: " + e);
            }
        }
        return nombre;
    }
}
