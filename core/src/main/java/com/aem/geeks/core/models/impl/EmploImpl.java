package com.aem.geeks.core.models.impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.aem.geeks.core.models.Employ;

@Model(adaptables = SlingHttpServletRequest.class,
        adapters = Employ.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class EmploImpl implements Employ{
    @ValueMapValue
    public String employeename;
    @ValueMapValue
    public String companyname;
    @ValueMapValue
    public String location;
    @ValueMapValue
    public String picture;
    @ValueMapValue
    public String text;
    public String getEmployeename() {
        return employeename;
    }
    public String getCompanyname() {
        return companyname;
    }
    public String getLocation() {
        return location;
    }
    public String getPicture() {
        return picture;
    }
    public String getText() {
        return text;
    }

 
    
   
}
