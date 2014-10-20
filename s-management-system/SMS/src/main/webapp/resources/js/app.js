'use strict';

var SMS = {};

var App = angular.module('SMS', ['SMS.filters', 'SMS.services', 'SMS.directives']);

// Declare app level module which depends on filters, and services
App.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/cars', {
        templateUrl: 'cars/layout',
        controller: CarController
    });

    $routeProvider.when('/trains', {
        templateUrl: 'trains/layout',
        controller: TrainController
    });
    
    $routeProvider.when('/railwaystations', {
        templateUrl: 'railwaystations/layout',
        controller: RailwayStationController
    });
    
    $routeProvider.when('/logins', {
        templateUrl: 'logins/layout',
        controller: LoginController
    });
    
    

    $routeProvider.otherwise({redirectTo: '/logins'});
}]);
