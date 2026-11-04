package com.psg.ui;

public class PostLogonInitialization implements Runnable{
    @Override
    public void run() {
    	System.out.println("run  invoked");
        UIEventHandler.setupUIHandlers();
    }
}
