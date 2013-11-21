package tln.able;

import tln.model.Drug;

import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: tmtxt
 * Date: 11/15/13
 * Time: 9:13 AM
 * To change this template use File | Settings | File Templates.
 */
public interface DrugDAO extends GenericDAO<Drug> {
    Drug getByDrugCode(String drugCode);
    List<Drug> getByDrugName(String drugName);
    Drug getByGenericName(String genericName);
    List<Drug> getByDrugGroupID(String drugGroupID);
}
