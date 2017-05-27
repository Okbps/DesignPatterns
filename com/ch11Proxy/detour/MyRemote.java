package com.ch11Proxy.detour;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Aspire on 27.05.2017.
 */
public interface MyRemote extends Remote{
    public String sayHello() throws RemoteException;
}
