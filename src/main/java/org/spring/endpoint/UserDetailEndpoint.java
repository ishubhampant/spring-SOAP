package org.spring.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.getlistdetails.list.GetListRequest;
import com.getlistdetails.list.GetListResponse;
import com.getlistdetails.list.UserDetail;

@Endpoint
public class UserDetailEndpoint {
	
	@PayloadRoot(namespace = "http://getlistdetails.com/list", localPart = "GetListRequest")
	@ResponsePayload
	public GetListResponse process(@RequestPayload GetListRequest request) {
		GetListResponse response = new GetListResponse();
		UserDetail user = new UserDetail();
		user.setId(11987456);
		user.setFirstName("Kelly");
		user.setLastName("Gary");
		user.setCountry("USA");
		user.setNumber(+119804536);
		
		response.setUser(user);
		return response;
	}

}
