angular.module('taskApp.services', ['ngResource'])
    .factory('Tasks', function ($resource) {
        return $resource('api/tasks', {});
    });