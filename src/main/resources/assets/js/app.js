angular.module('taskApp', ['taskApp.controllers', 'ui.bootstrap'])
    .config(['$routeProvider', function ($routesProvider) {
        $routesProvider
            .when('/', {templateUrl: 'partials/home.html', controller: 'HomeCtrl as home'})
            .when('/tasks', { templateUrl: 'partials/tasks.html', controller: 'TasksCtrl as tasks' })
            .otherwise({redirectTo: '/'});
    }]);