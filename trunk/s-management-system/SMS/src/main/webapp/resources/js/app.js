'use strict';

var SMS = {};

var App = angular.module('SMS', ['SMS.filters', 'SMS.services', 'SMS.directives','ngCookies']);

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
    
    $routeProvider.when('/students', {
        templateUrl: 'students/layout',
        controller: StudentsListController
    });
    
    $routeProvider.otherwise({redirectTo: '/logins'});
    
    
}]);
