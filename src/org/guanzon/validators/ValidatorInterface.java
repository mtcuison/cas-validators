package org.guanzon.validators;

import org.rmj.appdriver.GRider;

public interface ValidatorInterface {
    public void setGRider(GRider foValue);
    public boolean isEntryOkay();
    public String getMessage();
}
