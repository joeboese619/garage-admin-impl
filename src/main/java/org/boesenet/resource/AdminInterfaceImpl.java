package org.boesenet.resource;

import org.boesenet.model.Clientdevice;
import org.boesenet.model.Clientdevices;

public class AdminInterfaceImpl implements GarageClientsResource {

    @Override
    public GarageClientsResource.GetGarageClientsResponse getGarageClients() throws Exception
    {
        final Clientdevices devices = new Clientdevices().withSize(3);
        devices.getClientdevices().add(new Clientdevice().withDevicename("Joe's Clicker").withMacaddress("aa:bb:cc:11:22:33"));
        devices.getClientdevices().add(new Clientdevice().withDevicename("Meghan's Clicker").withMacaddress("aa:bb:cc:01:02:03"));
        devices.getClientdevices().add(new Clientdevice().withDevicename("Liv's Clicker").withMacaddress("a1:b2:c3:11:22:33"));

        return GetGarageClientsResponse.withJsonOK(devices);
    }

    @Override
    public GarageClientsResource.PostGarageClientsResponse postGarageClients(Clientdevice entity)
            throws Exception
    {
        return null;
    }
}