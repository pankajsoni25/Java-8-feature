package model;

import java.util.List;

/**
 * @author pankaj
 */
public abstract class Abstract<T extends BaseMode > {

    public abstract double getAmount(List<T> list);
}
