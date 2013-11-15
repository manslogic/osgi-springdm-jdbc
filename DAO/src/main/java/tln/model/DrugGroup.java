package tln.model;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: tmtxt
 * Date: 11/15/13
 * Time: 9:15 AM
 * To change this template use File | Settings | File Templates.
 */
public class DrugGroup {
    private String drugGroupID;
    private String drugGroupName;
    private Set drugs;

    public DrugGroup(){
    }
    public DrugGroup(String id, String name){
        drugGroupID = id;
        drugGroupName = name;
    }

    public Set getDrugs() {
        return drugs;
    }

    public void setDrugs(Set drugs) {
        this.drugs = drugs;
    }


    public String getDrugGroupName() {
        return drugGroupName;
    }
    public void setDrugGroupName(String drugGroupName) {
        this.drugGroupName = drugGroupName;
    }
    public String getDrugGroupID() {
        return drugGroupID;
    }

    public void setDrugGroupID(String drugGroupID) {
        this.drugGroupID = drugGroupID;
    }
}
