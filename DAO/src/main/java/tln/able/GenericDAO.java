package tln.able;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: tmtxt
 * Date: 11/15/13
 * Time: 9:12 AM
 * To change this template use File | Settings | File Templates.
 */
public interface GenericDAO<T> {
    /**
     * Saves the given object instance.
     *
     * @param object the object instance.
     * @return the generated identifier.
     */
    T save(T object);

    /**
     * Updates the given object instance.
     *
     * @param object the object instance.
     */
    T update(T object);

    /**
     * Retrieves the object with the given identifier. This method will first
     * look in the current Session, then hit the database if not existing.
     *
     * @param id the object identifier.
     * @return the object identified by the given identifier.
     */
    T get(int id);

    /**
     * Retrieves the object with the given identifier, assuming it exists.
     *
     * @param id the object identifier.
     * @return the object identified by the given identifier or a generated proxy.
     */
    T load(int id);

    /**
     * Retrieves a Collection of all objects.
     *
     * @return a Collection of all objects.
     */
    Collection<T> getAll();

    /**
     * Removes the given object instance.
     *
     * @param object the object instance to delete.
     */
    void delete(T object);
}
