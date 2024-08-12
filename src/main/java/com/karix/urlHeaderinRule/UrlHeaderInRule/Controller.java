package com.karix.urlHeaderinRule.UrlHeaderInRule;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Enumeration;


//@RestController
//@RequestMapping("/url")
//public class Controller {
////    @Autowired
////    private URLService service;
////
////    @GetMapping
////    public String getURL(@RequestBody String url) {
////        System.out.println("URL: " + url);
////
////        String headers= service.fetchHeaders(url);
////        System.out.println("Headers: " + headers);
////        return "Fetch headers!";}
//
//    @GetMapping
//    public StringBuffer getHeaders(HttpServletRequest request ){
//            Enumeration<String> headers= request.getHeaderNames();
//            StringBuffer headerString= new StringBuffer("Header String: ");
//            while(headers.hasMoreElements()){
//                String headerName=headers.nextElement();
//                String headerValue= request.getHeader(headerName);
//                headerString.append(headerName+headerValue);
//
//            }
//            return headerString;
//        }
//
//        }


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Enumeration;

@RestController
@RequestMapping("/api")
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/receiver")
    public String handleGetRequest(
            HttpServletRequest request,
            @RequestParam(value = "message", defaultValue = "No message") String message,
            @RequestHeader(value = "Content-Type", defaultValue = "text/plain") String userAgent) {

        // Log headers
            logger.info("User-Agent: {}", userAgent);

        // Log query parameters
        logger.info("Query Parameter message: {}", message);

        // Log full request details
        logger.info("Full GET Request: Method: {}, URI: {}, Headers: {}, Params: {}",
                request.getMethod(),
                request.getRequestURI(),
                request.getHeaderNames(),
                request.getParameterMap());
        Enumeration<String> headers= request.getHeaderNames();
            StringBuffer headerString= new StringBuffer("Header String: ");
            while(headers.hasMoreElements()){
                String headerName=headers.nextElement();
                String headerValue= request.getHeader(headerName);
                headerString.append(headerName+headerValue);

            }
        return "Received GET request with header: " +headerString ;
    }

//    @PostMapping("/receiver")
//    public String handlePostRequest(
//            HttpServletRequest request,
//            @RequestBody String body,
//            @RequestHeader(value = "Content-Type", defaultValue = "text/plain") String contentType) {
//
//        // Log headers
//        logger.info("Content-Type: {}", contentType);
//
//        // Log body
//        logger.info("Request Body: {}", body);
//
//        // Log full request details
//        logger.info("Full POST Request: Method: {}, URI: {}, Headers: {}, Body: {}",
//                request.getMethod(),
//                request.getRequestURI(),
//                request.getHeaderNames(),
//                body);
//
//        // Send a response
//        return "Received POST request with body: " + body;
//    }
}
