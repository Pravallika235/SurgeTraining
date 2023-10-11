package com.aem.geeks.core.servlets;

import java.io.IOException;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.servlet.Servlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;

@Component(service=Servlet.class)
@SlingServletResourceTypes(resourceTypes ="aemgeeks/components/helloworld",
                            selectors = "one",
                          extensions = "txt"
                          )
public class StudResourceServlet extends SlingAllMethodsServlet {
    @Override
    protected void doGet(SlingHttpServletRequest req,SlingHttpServletResponse resp) throws IOException {

    JsonObjectBuilder obj = Json.createObjectBuilder();
    obj.add("StudentName", "R.Pravallika");
    obj.add("SchoolName", "ABC School");
    obj.add("Location", "Bangalore");
    obj.add("Address", "BEML Layout,Brookefield");
  
    resp.getWriter().write(obj.build().toString());
}
}