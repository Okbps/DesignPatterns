package com.ch11Proxy.detour;

import java.io.Serializable;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Aspire on 27.05.2017.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
    private static final long serialVersionUID = 1L;

    @Override
    public String sayHello() throws RemoteException {
        return "Server says 'Hey!'";
    }

    public MyRemoteImpl() throws RemoteException {
        super();
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
