angular.module('Myapp')
    .component('nouveauProduit', {
        templateUrl: "nouveauProduit/nouveau-produit.component.html",
        controller : newProductCtrl ,
        controllerAs :'vm'

    });


function newProductCtrl(dataManager) {
    var vm = this ;
    vm.designation = '' ;
    vm.quantite = '';
    vm.prix = '';

    vm.saveProduit = function () {
         var produit = {
             "designation" : vm.designation ,
             "quantite" : vm.quantite ,
             "prix" : vm.prix
         }
         dataManager.sentPost("http://localhost:8080/Produits",produit)
             .then(function (response) {
                 console.log("done " + response.data)
             })
    }
}