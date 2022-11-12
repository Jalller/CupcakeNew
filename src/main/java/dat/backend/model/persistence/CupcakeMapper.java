package dat.backend.model.persistence;

import dat.backend.model.entities.Bottom;
import dat.backend.model.entities.Top;
import dat.backend.model.entities.User;
import dat.backend.model.exceptions.DatabaseException;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CupcakeMapper {

    public static Top getTopById(int topId, ConnectionPool connectionPool) {
        Logger.getLogger("web").log(Level.INFO, "");

        Top top = null;

        String sql = "SELECT * FROM cupcaketop WHERE cupcake.cupcaketop.idcupcaketop = '${topId}'";

        try (Connection connection = connectionPool.getConnection()) {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String name = rs.getString("name");
            int price = rs.getInt("price");
            top.toString();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return top;
    }

    public static Bottom getBottomById(int bottomId, ConnectionPool connectionPool) {
        Logger.getLogger("web").log(Level.INFO, "");

        Bottom bottom = null;

        String sql = "SELECT * FROM cupcakebottom WHERE cupcake.cupcakebottom.idcupcakebottom = '${bottomId}'";

        try (Connection connection = connectionPool.getConnection()) {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String name = rs.getString("name");
            int price = rs.getInt("price");
            bottom.toString();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return bottom;
    }
}
