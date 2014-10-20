'use strict';

/**
 * LoginController
 * @constructor
 */
var LoginController = function($scope, $http, $window) {

	$scope.login = {};

	$scope.validateCurrentUser = function(login) {
		$scope.resetError();

		$http.post('logins/validateUser', login).success(function() {

			$scope.login.userName = '';
			$scope.login.password = '';
			$window.location = '/SMS/#/cars';
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