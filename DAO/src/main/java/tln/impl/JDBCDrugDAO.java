package tln.impl;

import tln.able.DrugDAO;
import tln.connection.DrugConnection;
import tln.model.Drug;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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

        }
    }

    public Drug getByDrugCode(String drugCode) {
        Drug drug = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM DRUG WHERE DRUG.DrugCode = ?");
            preparedStatement.setString(1, drugCode);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                drug = new Drug();
                drug.setDrugCode(resultSet.getString("DrugCode"));
                drug.setDrugName(resultSet.getString("DrugName"));
                drug.setGenericName(resultSet.getString("GenericName"));
                drug.setDose(resultSet.getString("Dose"));
                drug.setUsage(resultSet.getString("UsageInfo"));
                drug.setRoute(resultSet.getString("Route"));
                drug.setDrugGroupID(resultSet.getString("DrugGroupID"));
            }
        } catch (SQLException e) {

        }
        return drug;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Drug> getByDrugName(String drugName) {
        List<Drug> list = new ArrayList<Drug>();
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM DRUG WHERE DRUG.DrugName LIKE ?");
            preparedStatement.setString(1, drugName);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Drug drug = new Drug();
                drug.setDrugCode(resultSet.getString("DrugCode"));
                drug.setDrugName(resultSet.getString("DrugName"));
                drug.setGenericName(resultSet.getString("GenericName"));
                drug.setDose(resultSet.getString("Dose"));
                drug.setUsage(resultSet.getString("UsageInfo"));
                drug.setRoute(resultSet.getString("Route"));
                drug.setDrugGroupID(resultSet.getString("DrugGroupID"));
                list.add(drug);
            }
        } catch (SQLException e) {

        }

        return list;
    }

    @Override
    public Drug getByGenericName(String genericName) {

        Drug drug = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM DRUG WHERE DRUG.GenericName = ?");
            preparedStatement.setString(1, genericName);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                drug = new Drug();
                drug.setDrugCode(resultSet.getString("DrugCode"));
                drug.setDrugName(resultSet.getString("DrugName"));
                drug.setGenericName(resultSet.getString("GenericName"));
                drug.setDose(resultSet.getString("Dose"));
                drug.setUsage(resultSet.getString("UsageInfo"));
                drug.setRoute(resultSet.getString("Route"));
                drug.setDrugGroupID(resultSet.getString("DrugGroupID"));
            }
        } catch (SQLException e) {

        }
        return drug;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Drug> getByDrugGroupID(String drugGroupID) {
        List<Drug> list = new ArrayList<Drug>();
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM DRUG WHERE DRUG.DrugGroupID = ?");
            preparedStatement.setString(1, drugGroupID);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Drug drug = new Drug();
                drug.setDrugCode(resultSet.getString("DrugCode"));
                drug.setDrugName(resultSet.getString("DrugName"));
                drug.setGenericName(resultSet.getString("GenericName"));
                drug.setDose(resultSet.getString("Dose"));
                drug.setUsage(resultSet.getString("UsageInfo"));
                drug.setRoute(resultSet.getString("Route"));
                drug.setDrugGroupID(resultSet.getString("DrugGroupID"));
                list.add(drug);
            }
        } catch (SQLException e) {

        }

        return list;
    }

    @Override
    public Drug save(Drug object) {
        boolean result = true;
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO " +
                    "DRUG(DrugCode,DrugName, GenericName, Dose, UsageInfo, Route, DrugGroupID) " +
                    "VALUES(?,?,?,?,?,?,?)");
            preparedStatement.setString(1, object.getDrugCode());
            preparedStatement.setString(2, object.getDrugName());
            preparedStatement.setString(3, object.getGenericName());
            preparedStatement.setString(4, object.getDose());
            preparedStatement.setString(5, object.getUsage());
            preparedStatement.setString(6, object.getRoute());
            preparedStatement.setString(7, object.getDrugGroupID());
            result = preparedStatement.execute();
        } catch (SQLException e) {

        }

        return result ? object : null;
    }

    @Override
    public Drug update(Drug object) {
        boolean result = true;
        try {
            preparedStatement = connection.prepareStatement("UPDATE DRUG SET " +
                    "DrugCode = ?, " +
                    "DrugName = ?, " +
                    "GenericName = ?, " +
                    "Dose = ?, " +
                    "UsageInfo = ?, " +
                    "Route = ?, " +
                    "DrugGroupID = ? " +
                    "WHERE DrugCode = ?");
            preparedStatement.setString(1, object.getDrugCode());
            preparedStatement.setString(2, object.getDrugName());
            preparedStatement.setString(3, object.getGenericName());
            preparedStatement.setString(4, object.getDose());
            preparedStatement.setString(5, object.getUsage());
            preparedStatement.setString(6, object.getRoute());
            preparedStatement.setString(7, object.getDrugGroupID());
            preparedStatement.setString(8, object.getDrugCode());
            result = preparedStatement.execute();
        } catch (SQLException e) {

        }
        return result ? object : null;
    }

    @Override
    public Drug get(String id) {
        Drug drug = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM DRUG WHERE DRUG.DrugCode = ?");
            preparedStatement.setString(1, id);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                drug = new Drug();
                drug.setDrugCode(resultSet.getString("DrugCode"));
                drug.setDrugName(resultSet.getString("DrugName"));
                drug.setGenericName(resultSet.getString("GenericName"));
                drug.setDose(resultSet.getString("Dose"));
                drug.setUsage(resultSet.getString("UsageInfo"));
                drug.setRoute(resultSet.getString("Route"));
                drug.setDrugGroupID(resultSet.getString("DrugGroupID"));
            }
        } catch (SQLException e) {

        }
        return drug;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Collection<Drug> getAll() {
        List<Drug> list = new ArrayList<Drug>();

        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM DRUG");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Drug drug = new Drug();
                drug.setDrugCode(resultSet.getString("DrugCode"));
                drug.setDrugName(resultSet.getString("DrugName"));
                drug.setGenericName(resultSet.getString("GenericName"));
                drug.setDose(resultSet.getString("Dose"));
                drug.setUsage(resultSet.getString("UsageInfo"));
                drug.setRoute(resultSet.getString("Route"));
                drug.setDrugGroupID(resultSet.getString("DrugGroupID"));
                list.add(drug);
            }
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return list;
    }

    @Override
    public void delete(Drug object) {
        //To change body of implemented methods use File | Settings | File Templates.
        try {
            preparedStatement = connection.prepareStatement("DELETE FROM DRUG WHERE DRUG.DrugCode = ?");
            preparedStatement.setString(1, object.getDrugCode());
            preparedStatement.execute();
            System.out.println("Delete success");
        } catch (SQLException e) {
            System.out.println("Error");
        }
    }
}
