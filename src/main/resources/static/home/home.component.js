angular.module('Myapp')
    .component('home', {
        templateUrl: "home/home.component.html",
        controller: hometCtrl,
        controllerAs: 'vm'
    });

function hometCtrl() {
    var vm = this ;

}