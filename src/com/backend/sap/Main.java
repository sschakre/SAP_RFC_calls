package com.backend.sap;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoDestinationManager;
import com.sap.conn.jco.JCoException;

public class Main {

    public static void main(String[] args) throws JCoException {
        JCoDestination destination=JCoDestinationManager.getDestination("ABAP_AS_DEC");

        System.out.println("Attributes:");
        System.out.println(destination.getAttributes());

    }
}
