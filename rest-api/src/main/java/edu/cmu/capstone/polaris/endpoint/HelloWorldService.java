package edu.cmu.capstone.polaris.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.annotation.JsonView;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import edu.cmu.capstone.polaris.entity.Customer;
import edu.cmu.capstone.polaris.view.Views;
 
@Path("/hello")
@Api(value = "/hello", description = "say hello to a name")
public class HelloWorldService {
 
	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="just to test the sample api")
	@JsonView(Views.ExtendedPublicView.class)
	public Customer getMsg(@ApiParam(value="param",required=true)@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
 
		// return Response.status(200).entity(output).build();
		return new Customer(msg, "test");
 
	}
 
}