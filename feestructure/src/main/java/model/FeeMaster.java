package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pankaj
 */
@Entity
public class FeeMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    private String code;

    @Getter
    @Setter
    private List<ApplicationCharge> applicationCharges = new ArrayList<>();

    @Getter
    @Setter
    private List<SlabDetails> slabDetails = new ArrayList<>();

    @Getter
    @Setter
    private List<Factor> factorList = new ArrayList<>();

    @Getter
    @Setter
    private ApplicationType applicationType;

    public static void main(String[] args) {
        FeeMaster feeMaster = new FeeMaster();
        feeMaster.applicationCharges = Arrays.asList(ApplicationCharge.SLAB_CHARGES,
                ApplicationCharge.FACTOR_CHARGES,ApplicationCharge.FIXED_CHARGE,
                ApplicationCharge.VALUE_BASE);
        feeMaster.slabDetails = Arrays.asList();
    }



}
