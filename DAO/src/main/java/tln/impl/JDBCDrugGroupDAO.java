package tln.impl;

import tln.able.DrugGroupDAO;
import tln.connection.DrugConnection;
import tln.model.DrugGroup;

import java.sql.*;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: tmtxt
 * Date: 11/15/13
 * Time: 9:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class JDBCDrugGroupDAO implements DrugGroupDAO {

    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private Connection connection;

    public JDBCDrugGroupDAO() {
        try {
            connection = DrugConnection.connection;
            statement = connection.createStatement();
        } catch (SQLException e) {

        }
    }

    @Override
    public DrugGroup getByDrugGroupName(String drugGroupName) {
        DrugGroup drugGroup = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM DRUGGROUP WHERE DRUGGROUP.DrugGroupName = ?");
            preparedStatement.setString(1, drugGroupName);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                drugGroup = new DrugGroup();
                drugGroup.setDrugGroupID(resultSet.getString("DrugGroupID"));
                drugGroup.setDrugGroupName(resultSet.getString("DrugGroupName"));
            }
        } catch (SQLException e) {

        }
        return drugGroup;
    }

    @Override
    public DrugGroup save(DrugGroup object) {
        boolean result = true;
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO DRUGGROUP(DrugGroupID, DrugGroupName) VALUES(?,?)");
            preparedStatement.setString(1, object.getDrugGroupID());
            preparedStatement.setString(2, object.getDrugGroupName());
            result = preparedStatement.execute();
        } catch (SQLException e) {

        }

        return  result ? object : null;
    }

    @Override
    public DrugGroup update(DrugGroup object) {
        boolean result = true;
        try {
            preparedStatement = connection.prepareStatement("UPDATE DRUGGROUP SET " +
                    "DrugGroupName = ? WHERE DrugGroupID = ?");
            preparedStatement.setString(1, object.getDrugGroupName());
            preparedStatement.setString(2, object.getDrugGroupID());
            result = preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return result ? object : null;
    }

    @Override
    public DrugGroup get(String id) {
        DrugGroup drugGroup = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM DRUGGROUP WHERE DRUGGROUP.DrugGroupID = ?");
            preparedStatement.setString(1, id);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                drugGroup = new DrugGroup();
                drugGroup.setDrugGroupID(resultSet.getString("DrugGroupID"));
                drugGroup.setDrugGroupName((resultSet.getString("DrugGroupName")));
            }
        } catch (SQLException e) {

        }
        return drugGroup;
    }

    @Override
    public Collection<DrugGroup> getAll() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(DrugGroup object) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
