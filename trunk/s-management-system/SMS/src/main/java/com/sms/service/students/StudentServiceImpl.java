package com.sms.service.students;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.beans.students.ContactDetail;
import com.sms.beans.students.Student;
import com.sms.beans.students.StudentInfo;

@Service("studentService")
public class StudentServiceImpl implements StudentService{
	private static List<StudentInfo> studentInfoList = new ArrayList<StudentInfo>();
	
	public List<StudentInfo> getAllStudentsInfo(){
		testStudentInfo();
		return studentInfoList;
	}

    public StudentInfo getStudentInfoById(Long id){
    	return null;
    }

    public void addStudentInfo(StudentInfo studentInfo){
    	studentInfoList.add(studentInfo);
    	
    }

    public void deleteStudentInfoById(Long id){
    	
    }

    public void deleteAll(){
    	
    }

    public void updateStudentInfo(StudentInfo studentInfo){
    	
    }
    public void testStudentInfo(){
    	if(studentInfoList.isEmpty()){
    		StudentInfo studentInfo = new StudentInfo();
    		Student student = new Student("Yameen", "Bashir" ,  "1",
    				"4/12/1990", "Male", "Science",
    				"4/1/2015");
    		studentInfo.setStudent(student);
    		ContactDetail contactDetail= new ContactDetail("Bashir", "Ahmad",
    				"Lahore,Pakistan", "Islam", "0423",
    				"04233", "0321", "1");
    		studentInfo.setContactDetail(contactDetail);
    		studentInfoList.add(studentInfo);
    		
    		StudentInfo studentInfos = new StudentInfo();
    		Student student1 = new Student("Yameen", "Bashir" ,  "1",
    				"4/12/1990", "Male", "Science",
    				"4/1/2015");
    		studentInfos.setStudent(student1);
    		ContactDetail contactDetail1= new ContactDetail("Bashir", "Ahmad",
    				"Lahore,Pakistan", "Islam", "0423",
    				"04233", "0321", "1");
    		studentInfos.setContactDetail(contactDetail1);
    		studentInfoList.add(studentInfos);
    	}
    	else{
    		System.out.println("List has StudentInfo");
    	}
    	
    	}


}
