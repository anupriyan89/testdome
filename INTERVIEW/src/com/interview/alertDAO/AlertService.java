package com.interview.alertDAO;
import java.util.Date;
import java.util.UUID;

class AlertService {
    private AlertDAO storage;
		
    public UUID raiseAlert() {
        return this.storage.addAlert(new Date());
    }
	
    public Date getAlertTime(UUID id) {
        return this.storage.getAlert(id);
    }	
    
    public AlertService(AlertDAO storage) {
    	this.storage = storage;
    }
}

