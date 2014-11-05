'use strict';

/**
 * StudentsList
 * @constructor
 */
var StudentsListController = function($scope, $http, $window,$rootScope,$cookieStore) {
	
	$scope.fetchStudentsList = function() {
        $http.get('students/studentsinfolist.json').success(function(studentsList){
        	$rootScope.IsLoggedIn = $cookieStore.get('user');
        	alert("isLoggedIn contains: "+$rootScope.IsLoggedIn);
            $scope.studentsInfo = studentsList;
          
        });
    };

    $scope.addNewStudent = function(newStudent) {
        $http.post('students/addStudent/' + newStudent).success(function() {
            $scope.fetchStudentsList();
        });
        $scope.studentName = '';
        
    };

    $scope.removeStudent = function(student) {
        $http.delete('students/removeStudent/' + student).success(function() {
            $scope.fetchStudentsList();
        });
    };

    $scope.removeAllStudents = function() {
        $http.delete('students/removeAllStudents').success(function() {
            $scope.fetchStudentsList();
            
        });

    };
   
    $scope.setError = function(message) {
        $scope.error = true;
        $scope.errorMessage = message;
    };

	$scope.fetchStudentsList();
};