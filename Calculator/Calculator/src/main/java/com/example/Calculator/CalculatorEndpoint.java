package com.example.Calculator;
import com.rj.ws.soap.GetSubRequest;
import com.rj.ws.soap.GetSubResponse;
import com.rj.ws.soap.GetSumRequest;
import com.rj.ws.soap.GetSumResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
@Endpoint
public class CalculatorEndpoint {
    private static final String NAMESPACE_URI = "http://soap.ws.rj.com/";
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSumRequest")
    @ResponsePayload
    public GetSumResponse getGrade(@RequestPayload GetSumRequest request) {
        int  somme = request.getA() + request.getB();;
        // Prepare the response
        GetSumResponse response = new GetSumResponse();
        response.setC(somme);
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSubRequest")
    @ResponsePayload
    public GetSubResponse getSub(@RequestPayload GetSubRequest request) {
        int  diff = request.getA() - request.getB();;
        // Prepare the response
        GetSubResponse response = new GetSubResponse();
        response.setC(diff);

        return response;
    }

}
