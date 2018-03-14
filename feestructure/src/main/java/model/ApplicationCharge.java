package model;

/**
 * @author pankaj
 */
public enum ApplicationCharge {

    SLAB_CHARGES(1,"Slab Charges"),
    FACTOR_CHARGES(1,"Factor Charges"),
    VALUE_BASE(1,"Value Charges"),
    FIXED_CHARGE(1,"Fixed Charges");


    int id;
    String name;

    ApplicationCharge(int id, String name){
        this.id = id;
        this.name = name;
    }


}
