package tln;

import tln.able.DrugDAO;
import tln.model.Drug;
import com.apple.laf.*;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    public void start(){
        Drug drug = drugDAO.getByDrugCode("1");
        System.out.println(drug.getDrugName());
    }

    public void stop(){
        System.out.println("stop");
    }
}
