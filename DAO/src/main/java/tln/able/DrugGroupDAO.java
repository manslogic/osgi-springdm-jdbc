package tln.able;

import tln.model.DrugGroup;

/**
 * Created with IntelliJ IDEA.
 * User: tmtxt
 * Date: 11/15/13
 * Time: 9:15 AM
 * To change this template use File | Settings | File Templates.
 */
public interface DrugGroupDAO extends GenericDAO<DrugGroup> {

    DrugGroup getByDrugGroupName(String drugGroupName);
}
