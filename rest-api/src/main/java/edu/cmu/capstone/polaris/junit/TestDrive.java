package edu.cmu.capstone.polaris.junit;

import static org.junit.Assert.*;

import javax.ws.rs.core.MediaType;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import edu.cmu.capstone.polaris.endpoint.HelloWorldService;

public class TestDrive {
	 
	 /**
	  * Test.
	  */
	 @Test
	 public void test() {
	  System.out.println("---------------------------");
	  System.out.println("test java.openyu.org");
	  System.out.println("---------------------------");
	 }
	 
	   @Test
	    public void test2(){
		    Client c = Client.create();
		    WebResource webResourceTest = c.resource("http://localhost:8080/rest-api/vi/hello/helloworld");
		    final String responseString = webResourceTest.type(MediaType.TEXT_PLAIN).delete(String.class);
		    ClientResponse response = webResourceTest.type(MediaType.TEXT_PLAIN).delete(ClientResponse.class);
		    Assert.assertEquals("helloworld", response.getStatus());
	    }

}
