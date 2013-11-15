package tln.model;

/**
 * Created with IntelliJ IDEA.
 * User: tmtxt
 * Date: 11/15/13
 * Time: 9:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class Drug {
    private String drugCode;
    private String drugName;
    private String genericName;
    private String dose;
    private String usage;
    private String route;
    private String drugGroupID;
    public Drug(){

    }

    public Drug(String drugCode, String drugName, String genericName, String dose, String usage, String route, String drugGroupID){
        this.drugCode = drugCode;
        this.drugName = drugName;
        this.genericName = genericName;
        this.dose = dose;
        this.usage = usage;
        this.route = route;
        this.drugGroupID = drugGroupID;
    }

    public String getDrugGroupID() {
        return drugGroupID;
    }

    public void setDrugGroupID(String drugGroupID) {
        this.drugGroupID = drugGroupID;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
    public boolean equals(Object obj){
        if(obj == null) return false;
        if (!this.getClass().equals(obj.getClass())) return false;

        Drug caster = (Drug) obj;
        if (this.drugCode.equals(caster.getDrugCode()) ){
            return true;
        } else{
            return false;
        }
    }
    public int hashCode(){
        int tmp = 0;
        tmp = drugCode.hashCode();
        return tmp;
    }
}
