package edu.cmu.capstone.polaris.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import edu.cmu.capstone.polaris.entity.GeneralCustomerInfo;
 
@Path("/test")
@Api(value = "/test", description = "test")
public class TestHelloService {

	@GET
	@Produces("text/plain")
	public String getMessage() {
		return "Hello World";
}
	
//	@GET
//	@Path("/{param}")
//	@Produces(MediaType.APPLICATION_JSON)
//	@ApiOperation(value="just to test the sample api")
//	public Response getMsg(@ApiParam(value="param",required=true)@PathParam("param") String msg) {
// 
//		String output = "Jersey say : " + msg;
// 
//		 return Response.status(200).entity(output).build();
//		//return new GeneralCustomerInfo(msg, "test");
// 
//	}
 
}