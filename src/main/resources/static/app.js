angular.module('Myapp',['ui.router'])
    .config(function ($stateProvider) {

        var states = [

            {
                name : 'home' ,
                url : '',
                template : '<home> </home>'
            }
            , {
                name : 'recherche' ,
                url : "/chercher",
                template : '<recherche> </recherche>'
            }
            ,
            {
                name : 'home2' ,
                url : '/home',
                template : '<home> </home>'
            }
            ,
            {
                name : 'nouveauProduit',
                url : '/nouveauProduit',
                template : '<nouveau-produit> </nouveau-produit>'
            }
        ];

        states.forEach( function (state) {
            $stateProvider.state(state);
        } );
    })




