/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semana3;

import java.util.List;

/**
 *
 * @author Supaada-q214
 */
public class ResponseBody {

    private String psStatus;
    private String psTimeStamp;
    private String psCode;
    private String psSeverity;
    private String psMessage;
    private List<?> paPayload;

    public String getPsStatus() {
        return psStatus;
    }

    public void setPsStatus(String psStatus) {
        this.psStatus = psStatus;
    }

    public String getPsTimeStamp() {
        return psTimeStamp;
    }

    public void setPsTimeStamp(String psTimeStamp) {
        this.psTimeStamp = psTimeStamp;
    }

    public String getPsCode() {
        return psCode;
    }

    public void setPsCode(String psCode) {
        this.psCode = psCode;
    }

    public String getPsSeverity() {
        return psSeverity;
    }

    public void setPsSeverity(String psSeverity) {
        this.psSeverity = psSeverity;
    }

    public String getPsMessage() {
        return psMessage;
    }

    public void setPsMessage(String psMessage) {
        this.psMessage = psMessage;
    }

    public List<?> getPaPayload() {
        return paPayload;
    }

    public void setPaPayload(List<?> paPayload) {
        this.paPayload = paPayload;
    }
    
    
    
    
    

}
