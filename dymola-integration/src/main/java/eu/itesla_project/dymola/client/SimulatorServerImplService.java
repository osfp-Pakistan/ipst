/**
 * Copyright (c) 2016, All partners of the iTesla project (http://www.itesla-project.eu/consortium)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package eu.itesla_project.dymola.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SimulatorServerImplService", targetNamespace = "http://service.dymola.itesla_project.eu/", wsdlLocation = "http://localhost:8888/dymservice?wsdl")
public class SimulatorServerImplService
    extends Service {

    private final static URL SIMULATORSERVERIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException SIMULATORSERVERIMPLSERVICE_EXCEPTION;
    private final static QName SIMULATORSERVERIMPLSERVICE_QNAME = new QName("http://service.dymola.itesla_project.eu/", "SimulatorServerImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8888/dymservice?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SIMULATORSERVERIMPLSERVICE_WSDL_LOCATION = url;
        SIMULATORSERVERIMPLSERVICE_EXCEPTION = e;
    }

    public SimulatorServerImplService() {
        super(__getWsdlLocation(), SIMULATORSERVERIMPLSERVICE_QNAME);
    }

    public SimulatorServerImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SIMULATORSERVERIMPLSERVICE_QNAME, features);
    }

    public SimulatorServerImplService(URL wsdlLocation) {
        super(wsdlLocation, SIMULATORSERVERIMPLSERVICE_QNAME);
    }

    public SimulatorServerImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SIMULATORSERVERIMPLSERVICE_QNAME, features);
    }

    public SimulatorServerImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SimulatorServerImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SimulatorServer
     */
    @WebEndpoint(name = "SimulatorServerImplPort")
    public SimulatorServer getSimulatorServerImplPort() {
        return super.getPort(new QName("http://service.dymola.itesla_project.eu/", "SimulatorServerImplPort"), SimulatorServer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SimulatorServer
     */
    @WebEndpoint(name = "SimulatorServerImplPort")
    public SimulatorServer getSimulatorServerImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.dymola.itesla_project.eu/", "SimulatorServerImplPort"), SimulatorServer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SIMULATORSERVERIMPLSERVICE_EXCEPTION != null) {
            throw SIMULATORSERVERIMPLSERVICE_EXCEPTION;
        }
        return SIMULATORSERVERIMPLSERVICE_WSDL_LOCATION;
    }

}
