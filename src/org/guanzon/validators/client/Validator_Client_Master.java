package org.guanzon.validators.client;

import org.guanzon.clients.Model_Client_Master;
import org.guanzon.validators.ValidatorInterface;
import org.rmj.appdriver.GRider;

/**
 *
 * @author Michael Cuison
 */
public class Validator_Client_Master implements ValidatorInterface {
    GRider poGRider;
    String psMessage;
    
    Model_Client_Master poEntity;
    
    public Validator_Client_Master(Object foValue){
        poEntity = (Model_Client_Master) foValue;
    }
    
    @Override
    public void setGRider(GRider foValue) {
        poGRider = foValue;
    }

    @Override
    public boolean isEntryOkay() {
        if (poEntity.getClientID().isEmpty()){
            psMessage = "Client ID is not set.";
            return false;
        }
        
        if (poEntity.getLastName().isEmpty()){
            psMessage = "Client last name is not set.";
            return false;
        }
        
        if (poEntity.getFirstName().isEmpty()){
            psMessage = "Client first name is not set.";
            return false;
        }
        
        if (poEntity.getFullName().isEmpty()){
            psMessage = "Client full name is not set.";
            return false;
        }
        
        return true;
    }

    @Override
    public String getMessage() {
        return psMessage;
    }
}
