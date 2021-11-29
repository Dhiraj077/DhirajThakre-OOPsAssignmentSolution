package com.greatlearning.service;

import com.greatlearning.model.SuperDeparment;

public class AdminDepartment extends SuperDeparment {
	 
	 public String departmentName() {
	        return "Admin Department" + "\n";
	    }

	    public String getTodaysWork() {
	        return "Complete your documents submission" + "\n";
	    }

	    public String getWorkDeadline() {
	        return "Complete by EOD" + "\n";
	    }

}
