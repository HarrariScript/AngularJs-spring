angular.module('Myapp')
    .component('recherche', {
        templateUrl: "recherche/recherche.component.html",
        controller: rechercheCtrl,
        controllerAs: 'vm'
    });

function rechercheCtrl(dataManager) {
    var vm = this;
    vm.produits = null;
    vm.motCle = "";
    vm.currentPage = 0;
    vm.currentSize = 4;
    vm.pages = [];

    vm.chercher = function () {
        dataManager.getData("http://localhost:8080/findsProduits?mc=" + vm.motCle + "&page=" + vm.currentPage + "&size = " + vm.currentSize)
            .then(function (data) {
                vm.produits = data.content;
                vm.pages = new Array(data.totalPages);
            });
        vm.currentPage = 0 ;
    };
    vm.chercher();
    vm.goToPage = function (page) {
        vm.currentPage= page ;
        vm.chercher();
    }

}