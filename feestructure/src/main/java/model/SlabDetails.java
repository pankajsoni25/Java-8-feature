package model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author pankaj
 */
public class SlabDetails extends BaseMode{

    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    private double minRange;

    @Getter
    @Setter
    private double maxRange;

    @Getter
    @Setter
    private double feeAmount;

    @Override
    public double getAmount(List<SlabDetails> list) {
        return 0;
    }
}
