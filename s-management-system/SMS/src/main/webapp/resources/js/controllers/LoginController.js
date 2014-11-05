'use strict';

/**
 * LoginController
 * @constructor
 */
var LoginController = function($scope, $http, $window,$rootScope,$cookieStore) {

	$scope.login = {};
	$rootScope.IsLoggedIn=false;
	
	
	$scope.validateCurrentUser = function(login) {
		$scope.resetError();

		$http.post('logins/validateUser', login).success(function(isvalid) {
			alert("user validated successfully");
			if(isvalid=="true"){
				
				
				$scope.login.userName = '';
				$scope.login.password = '';
				$rootScope.IsLoggedIn=true;
				alert("isloggedIn contians: "+$rootScope.IsLoggedIn);
				$cookieStore.put('user',$rootScope.IsLoggedIn);
				$rootScope.IsLoggedIn = $cookieStore.get('user');
				alert("Value get from cookie: "+$rootScope.IsLoggedIn);
				$window.location = '/SMS/#/students';
			}
			else{
				$scope.login.userName = '';
				$scope.login.password = '';
				$scope.setError('Could not validate user/password');
			}
			
		}).error(function() {
			$scope.setError('Could not validate user/password');
		});
	};

	$scope.resetUserForm = function() {
		$scope.resetError();
		$scope.login = {};

	};

	$scope.resetError = function() {
		$scope.error = false;
		$scope.errorMessage = '';
	};

	$scope.setError = function(message) {
		$scope.error = true;
		$scope.errorMessage = message;
	};

};