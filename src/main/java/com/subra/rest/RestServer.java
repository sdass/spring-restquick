package com.subra.rest;

public class RestServer
{
    private String user;
    private String password;
    private String host;


    public RestServer(String user, String password, String host)
    {
        this.user = user;
        this.password = password;
        this.host = host;
    }

    public String getUser()
    {
        return user;
    }

    public String getPassword()
    {
        return password;
    }

    public String getHost()
    {
        return host;
    }
}