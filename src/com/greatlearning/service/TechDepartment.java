package com.greatlearning.service;

import com.greatlearning.model.SuperDeparment;

public class TechDepartment extends SuperDeparment {
	
	 public String departmentName() {
	        return "Tech Department" + "\n";
	    }

	    public String getTodaysWork() {
	        return "Complete coding module 1" + "\n";
	    }

	    public String getWorkDeadline() {
	        return "Complete by EOD" + "\n";
	    }

	    public String getTechStackInformation() {
	        return "Core Java" + "\n";
	    }

}
