package com.example.StudentGrade;

import com.rj.ws.soap.GetGradeRequest;
import com.rj.ws.soap.GetGradeResponse;
import com.rj.ws.soap.Student;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class StudentEndpoint {

    private static final String NAMESPACE_URI = "http://soap.ws.rj.com/";
    private static final String ANONYMOUS = "Anonymous";
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getGradeRequest")
    @ResponsePayload
    public GetGradeResponse getGrade(@RequestPayload GetGradeRequest request) {
        Student student = new Student();

        if (request.getName() != null && request.getName().equalsIgnoreCase(ANONYMOUS)) {
            student.setGrade(10.0);
        } else {
            student.setGrade(0.0);
        }

        GetGradeResponse response = new GetGradeResponse();
        response.setStudent(student);

        return response;
    }
}
