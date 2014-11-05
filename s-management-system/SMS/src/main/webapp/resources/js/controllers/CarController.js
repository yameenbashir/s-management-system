'use strict';

/**
 * CarController
 * @constructor
 */
var CarController = function($scope, $http, $window,$rootScope,$cookieStore) {
	
	
	
    $scope.fetchCarsList = function() {
        $http.get('cars/carlist.json').success(function(carList){
        	$rootScope.IsLoggedIn = $cookieStore.get('user');
        	alert("isLoggedIn contains: "+$rootScope.IsLoggedIn);
            $scope.cars = carList;
          
        });
    };

    $scope.addNewCar = function(newCar) {
        $http.post('cars/addCar/' + newCar).success(function() {
            $scope.fetchCarsList();
        });
        $scope.carName = '';
        
    };

    $scope.removeCar = function(car) {
        $http.delete('cars/removeCar/' + car).success(function() {
            $scope.fetchCarsList();
        });
    };

    $scope.removeAllCars = function() {
        $http.delete('cars/removeAllCars').success(function() {
            $scope.fetchCarsList();
            $scope.removeAllTrains();
        });

    };
    $scope.removeAllTrains = function() {
       

        $http.delete('trains/removeAllTrains').success(function() {
            $scope.fetchTrainsList();
        }).error(function() {
            $scope.setError('Could not remove all trains');
        });

    };
    $scope.setError = function(message) {
        $scope.error = true;
        $scope.errorMessage = message;
    };

    $scope.fetchCarsList();
};