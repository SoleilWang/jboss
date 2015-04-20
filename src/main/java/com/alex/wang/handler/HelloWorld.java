package com.alex.wang.handler;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import com.alex.wang.common.LoggerManager;
@Path("/")
public class HelloWorld {

    /**
     * @param args
     */
    @GET
    @Path("get/{param}")
    public Response getIssue(@PathParam("param") String msg)
            throws URISyntaxException, FileNotFoundException {
        String result = "Helloword "+msg;
        LoggerManager.recordInfo(result);
        return Response.status(200).entity(result).build();
 
    }

}