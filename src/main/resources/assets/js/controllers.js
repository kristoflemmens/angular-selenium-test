var taskApp = angular.module('taskApp.controllers', ['taskApp.services']);

taskApp.controller('TasksCtrl', function (Tasks) {
    this.all = Tasks.query();
});

taskApp.controller('HomeCtrl', function () {
    this.welcome = 'Welcome';
})