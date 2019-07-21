/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.space.telescope.http;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.net.http.HttpRequest;
import java.util.Arrays;
import javax.ws.rs.Path;
import org.apache.http.HttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;

/**
 *
 * @author akshat
 */
public class RequestBuilder {

    private CloseableHttpClient closeableHttpClient;
    private HttpRequest httpRequest;

    public HttpResponse execute() {
        return null;
    }

    public HttpRequest prepareRequest(Class interfaceClass, String methodName) throws NoSuchMethodException {
        
        HttpRequest httpRequest = null;
        
        Annotation[] annotations = interfaceClass.getAnnotationsByType(Path.class);
        Method method = interfaceClass.getDeclaredMethod(methodName);
        
        String rootPath = Arrays.asList(annotations)
                .stream()
                .filter(an -> an instanceof Path)
                .map(this::getPathValue)
                .findFirst().get();

        String subPath = Arrays.asList(method.getAnnotationsByType(interfaceClass))
                .stream()
                .filter(a -> a instanceof Path)
                .map(this::getPathValue)
                .findFirst().get();
        
        // /[^{\}]+(?=})/g
        
        //Find the method
        Arrays.asList(method.getAnnotations())
                .stream()
                .forEach( an -> {
                    switch(an.getClass().getCanonicalName()) {
                        case "GET":
                            break;
                        case "POST":
                            break;
                        case "PUT":
                            break;
                        case "DELETE":
                            break;
                        default:
                            break;
                    }
                });
        
        return null;
    }
    
    private String getPathValue(Annotation an) {
        Path p = (Path) an;
        return p.value();
    }
}














