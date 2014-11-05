package com.sms.service.students;

import java.util.List;

import com.sms.beans.RailwayStation;
import com.sms.beans.students.StudentInfo;

public interface StudentService {
	
	 	public List<StudentInfo> getAllStudentsInfo();

	    public StudentInfo getStudentInfoById(Long id);

	    public void addStudentInfo(StudentInfo studentInfo);

	    public void deleteStudentInfoById(Long id);

	    public void deleteAll();

	    public void updateStudentInfo(StudentInfo studentInfo);

}
