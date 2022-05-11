package accesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.Date;

public class ConexionBD {

   private static String url = "jdbc:mysql://localhost:3306/sistema_citas?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static String usuario = "root";
    private static String contrasenia = "1234";

//    private static Connection conexion;
//    private static PreparedStatement sentenciaPreparada;
//    private static ResultSet resultado;
    
    public static Connection conectar() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contrasenia);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return conexion;
    }
    
//    public static void main (String[]args){
//        try {
//            //Como se usa esa weaaaa
////            Date fecha = new Date();
//            conexion = conectar();
//            String consulta = "INSERT INTO citas(idcita, idhabitante, idtrabajadorsalud, fecha) VALUES ('1', '2', '3', '5',)";
//            sentenciaPreparada = conexion.prepareStatement(consulta);
//            int i = sentenciaPreparada.executeUpdate();
//            if (i>0) {
//                System.out.println("se guardaron los datos");
//            }else{
//                System.out.println("no se guardaron los datos");
//            }
//            conexion.close();
//        } catch (Exception e) {
//        }
//    }
}
