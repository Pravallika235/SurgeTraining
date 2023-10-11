package com.aem.geeks.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables= Resource.class,adapters=Std.class)
public class Std1 {
	 
		@ValueMapValue
		@Default(values="Name")
		public String studentname;
		
		@ValueMapValue
		@Default(values="XYZschool")
		public String schoolname;
		
		@ValueMapValue
		@Default(values="Town")
		public String place;
		
		@ValueMapValue
		@Default(values="000")
		public String s_id;
		
		public String getStudentName() {
			return studentname;
		}
		
		public String getSchoolName() {
			return schoolname;
		}
		
		public String getPlace() {
			return place;
		}
		
		public String getS_ID() {
			return s_id;
		}
}
