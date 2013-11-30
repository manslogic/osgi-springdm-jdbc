package tln;

import tln.able.DrugDAO;
import tln.able.DrugGroupDAO;
import tln.model.DrugGroup;

/**
 * Created with IntelliJ IDEA.
 * User: tmtxt
 * Date: 11/24/13
 * Time: 9:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    private final DrugGroupDAO drugGroupDAO;

    public Test(DrugGroupDAO drugGroupDAO){
        this.drugGroupDAO = drugGroupDAO;
    }

    public void start(){
        try {
            System.out.println();

            System.out.println("----------");
            System.out.println("DrugGroupDAO Interface");
            System.out.println("----------");
            System.out.println();

            System.out.println("getByDrugGroupName() function");
            System.out.println("Getting Drug Group with Drug Group Name vaccin...");
            DrugGroup drugGroup = drugGroupDAO.getByDrugGroupName("vaccin");
            Thread.sleep(500);
            if(drugGroup != null){
                System.out.println("Result");
                System.out.println("Drug Group ID: " + drugGroup.getDrugGroupID());
                System.out.println("Drug Group Name: " + drugGroup.getDrugGroupName());
            } else {
                System.out.println("No result");
            }
            System.out.println();

            System.out.println("save() function");
            System.out.println("Creating new Drug Group with ID G10, Name DG10...");
            DrugGroup drugGroup1 = new DrugGroup();
            drugGroup1.setDrugGroupID("G10");
            drugGroup1.setDrugGroupName("DG10");
            System.out.println("Inserting the new Drug Group...");
            Thread.sleep(500);
            if(drugGroupDAO.save(drugGroup1) != null){
                System.out.println("Insert successfully");
            } else {
                System.out.println("Insert unsuccessfully");
            }
            System.out.println();

            System.out.println("update() function");
            System.out.println("Updating Drug Group with ID G10");
            drugGroup1.setDrugGroupName("DG101");
            Thread.sleep(500);
            if(drugGroupDAO.update(drugGroup1) != null){
                System.out.println("Update successfully");
            } else {
                System.out.println("Update unsuccessfully");
            }
            System.out.println();

            System.out.println("get() function");
            System.out.println("Getting Drug Group with ID G10");
            Thread.sleep(500);
            drugGroup1 = drugGroupDAO.get("G10");
            if(drugGroup1 != null){
                System.out.println("Result");
                System.out.println("Drug Group ID: " + drugGroup1.getDrugGroupID());
                System.out.println("Drug Group Name: " + drugGroup1.getDrugGroupName());
            } else {
                System.out.println("No result");
            }
            System.out.println();

        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public void stop(){
        System.out.println("stop");
    }
}
