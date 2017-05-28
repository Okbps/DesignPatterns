package com.ch11Proxy.gumball;

import com.ch10State.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Aspire on 27.05.2017.
 */
public interface GumballMachineRemote extends Remote{
    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
    State getState() throws RemoteException;
}
