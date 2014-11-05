package com.sms.controller.students;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sms.beans.RailwayStation;
import com.sms.beans.students.StudentInfo;
import com.sms.service.students.StudentServiceImpl;




@Controller
@RequestMapping("/students")
public class StudentInfoController {
	
	@Autowired
//    private RailwayStationServiceImpl railwayStationsService;
	private StudentServiceImpl studentService;
	
	@RequestMapping("studentsinfolist.json")
    public @ResponseBody List<StudentInfo> getStudentInfoList() {
        return studentService.getAllStudentsInfo();
    }

	
//	@RequestMapping("railwaystationlist.json")
//    public @ResponseBody List<RailwayStation> getRailwayStationList() {
//        return railwayStationsService.getAllRailwayStations();
//    }
	@RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody void addStudentInfo(@RequestBody StudentInfo studentInfo) {
		studentService.addStudentInfo(studentInfo);
    }

//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public @ResponseBody void addRailwayStation(@RequestBody RailwayStation railwayStation) {
//        railwayStationsService.addRailwayStation(railwayStation);
//    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public @ResponseBody void updateStudentInfo(@RequestBody StudentInfo studentInfo) {
    	studentService.updateStudentInfo(studentInfo);
    }

//	@RequestMapping(value = "/update", method = RequestMethod.PUT)
//    public @ResponseBody void updateRailwayStation(@RequestBody RailwayStation railwayStation) {
//        railwayStationsService.updateRailwayStation(railwayStation);
//    }
    
    @RequestMapping(value = "/remove/{id}", method = RequestMethod.DELETE)
    public @ResponseBody void removeStudentInfo(@PathVariable("id") Long id) {
    	studentService.deleteStudentInfoById(id);
    }

//    @RequestMapping(value = "/remove/{id}", method = RequestMethod.DELETE)
//    public @ResponseBody void removeRailwayStation(@PathVariable("id") Long id) {
//        railwayStationsService.deleteRailwayStationById(id);
//    }
    
    @RequestMapping(value = "/removeAll", method = RequestMethod.DELETE)
    public @ResponseBody void removeAllStudentsInfo() {
    	studentService.deleteAll();
    }


//    @RequestMapping(value = "/removeAll", method = RequestMethod.DELETE)
//    public @ResponseBody void removeAllRailwayStations() {
//        railwayStationsService.deleteAll();
//    }

    @RequestMapping("/layout")
    public String getStudentInfoPartialPage(ModelMap modelMap) {
        return "students/layout";
    }

}
