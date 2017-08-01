const app = angular.module("feira-app", ['ui.router', 'ngMaterial']);

app.config(function($stateProvider, $urlRouterProvider) {

    $urlRouterProvider.otherwise('/login');

    $stateProvider
        .state('main', {
            url: '',
            abstract: true,
            template: '<div ui-view></div>',
            controller:'listaSeriesCtrl'
        })

        .state( 'main.login',{
            url: '/login',
            templateUrl: 'login.html',
        
        })

        .state('main.home', {
            url:'/home',
            templateUrl: 'home.html',
         
        });




});

