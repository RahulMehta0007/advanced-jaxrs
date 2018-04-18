package org.rahul.rest;


import java.util.Calendar;
import java.util.Date;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

@Path("test")
public class MyResource {

	@GET
	@Produces("text/shortDate")
	public Date testMethod()
	{		
		return  Calendar.getInstance().getTime();
	}
	
	//@Provider
	//value={MediaType.TEXT_PLAIN,
}
