package tln;

import tln.able.DrugDAO;

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
        drugDAO.getByDrugCode("abc");
    }

    public void stop(){
        System.out.println("stop");
    }
}
