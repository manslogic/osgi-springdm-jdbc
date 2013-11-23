package tln;

import tln.able.DrugDAO;
import tln.model.Drug;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: tmtxt
 * Date: 11/15/13
 * Time: 9:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    private final DrugDAO drugDAO;

    public Test(DrugDAO drugDAO){
        this.drugDAO = drugDAO;
    }

    public void start() {

        try {
            System.out.println();

            System.out.println("----------");
            System.out.println("DrugDAO Interface");
            System.out.println("----------");
            System.out.println();

            System.out.println("get() function");
            System.out.println("Getting Drug with Drug Code 1...");
            Drug drug = drugDAO.get("1");
            Thread.sleep(500);
            if(drug == null){
                System.out.println("No result");
            } else {
                System.out.println("Result");
                System.out.println("Drug Code: " + drug.getDrugName());
                System.out.println("Drug Name: " + drug.getDrugCode());
                System.out.println("Generic Name: " + drug.getGenericName());
                System.out.println("Dose: " + drug.getDose());
                System.out.println("Usage Info: " + drug.getUsage());
                System.out.println("Route: " + drug.getRoute());
            }
            System.out.println();

            System.out.println("getByDrugName() function");
            System.out.println("Getting Drug List with name flsu...");
            List<Drug> list = drugDAO.getByDrugName("fflu");
            Thread.sleep(500);
            System.out.println("Found " + list.size() + " result(s)");
            for (Drug item : list){

            }
            System.out.println();

            System.out.println("getByGenericName() function");
            System.out.println("Getting Drug with Generic Name wololo...");
            drug = drugDAO.getByGenericName("wololo");
            Thread.sleep(500);
            if(drug==null){
                System.out.println("No result");
            } else {
                System.out.println("Result");
                System.out.println("Drug Code: " + drug.getDrugName());
                System.out.println("Drug Name: " + drug.getDrugCode());
                System.out.println("Generic Name: " + drug.getGenericName());
                System.out.println("Dose: " + drug.getDose());
                System.out.println("Usage Info: " + drug.getUsage());
                System.out.println("Route: " + drug.getRoute());
            }
            System.out.println();

            System.out.println("getByDrugGroupID() function");
            System.out.println("Getting Drug List with Drug Group ID G1...");
            list = drugDAO.getByDrugGroupID("G1");
            Thread.sleep(500);
            System.out.println("Found " + list.size() + " result(s)");
            for (Drug item : list){

            }
            System.out.println();

            System.out.println("save() function");
            System.out.println("Creating a new Drug");
            drug = new Drug();
            drug.setDrugCode("5");
            drug.setDrugName("name abc");
            drug.setGenericName("generic def");
            drug.setDose("dose day");
            drug.setUsage("info");
            drug.setRoute("new route");
            drug.setDrugGroupID("G2");
            System.out.println("Drug Code: " + drug.getDrugName());
            System.out.println("Drug Name: " + drug.getDrugCode());
            System.out.println("Generic Name: " + drug.getGenericName());
            System.out.println("Dose: " + drug.getDose());
            System.out.println("Usage Info: " + drug.getUsage());
            System.out.println("Route: " + drug.getRoute());
            System.out.println("Inserting into database...");
            Thread.sleep(500);
            if(drugDAO.save(drug) == null){
                System.out.println("Result: Insert successfully");
            } else {
                System.out.println("Result: Insert unsuccessfully");
            }
            System.out.println();

            System.out.println("update() function");
            System.out.println("Creating a new Drug");
            drug = new Drug();
            drug.setDrugCode("1");
            drug.setDrugName("name abc");
            drug.setGenericName("generic def");
            drug.setDose("dose day");
            drug.setUsage("info");
            drug.setRoute("new route");
            drug.setDrugGroupID("G2");
            System.out.println("Drug Code: " + drug.getDrugName());
            System.out.println("Drug Name: " + drug.getDrugCode());
            System.out.println("Generic Name: " + drug.getGenericName());
            System.out.println("Dose: " + drug.getDose());
            System.out.println("Usage Info: " + drug.getUsage());
            System.out.println("Route: " + drug.getRoute());
            System.out.println("Updating the Drug with Drug Code 1...");
            Thread.sleep(500);
            if(drugDAO.update(drug) == null){
                System.out.println("Result: Update successfully");
            } else {
                System.out.println("Result: Update unsuccessfully");
            }
            System.out.println();

            System.out.println("getAll() function");
            System.out.println("Getting all Drug");
            Collection<Drug> list1 = drugDAO.getAll();
            Thread.sleep(500);
            System.out.println("Total number: " + list1.size());
            System.out.println();

            System.out.println("delete() function");
            System.out.println("Delete Drug with code 7");
            Drug drug1 = new Drug();
            drug1.setDrugCode("7");
            Thread.sleep(500);
            drugDAO.delete(drug1);
            System.out.println();

        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }


    }

    public void stop(){
        System.out.println("stop");
    }
}
