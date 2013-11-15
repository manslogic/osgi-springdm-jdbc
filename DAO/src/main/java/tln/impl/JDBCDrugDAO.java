package tln.impl;

import tln.able.DrugDAO;
import tln.connection.DrugConnection;
import tln.model.Drug;

import java.sql.*;
import java.util.Collection;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: tmtxt
 * Date: 11/15/13
 * Time: 9:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class JDBCDrugDAO implements DrugDAO {

    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private Connection connection;

    public JDBCDrugDAO() {
        try {
            connection = DrugConnection.connection;
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public Drug getByDrugCode(String drugCode) {
        Drug drug = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM DRUG WHERE DRUG.DrugCode = ?");
            // resultSet = statement.executeQuery("select * from DRUG where DrugCode='1'");
            preparedStatement.setString(1, drugCode);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                drug = new Drug();
                drug.setDrugName(resultSet.getString("DrugName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return drug;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Drug getByDrugName(String drugName) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Drug getByGenericName(String genericName) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set getByDrugGroupID(String drugGroupID) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String save(Drug object) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void update(Drug object) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void saveOrUpdate(Drug object) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Drug get(int id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Drug load(int id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Collection<Drug> getAll() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(Drug object) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
