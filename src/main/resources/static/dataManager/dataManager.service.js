angular.module('Myapp')
    .service('dataManager', function ($http) {
        return {
            getData: (url) => {
                return $http.get(url).then((response) => {
                    return response.data;
                });
            },
            sentPost:  (url, data) =>{
                var req = {
                    method: 'POST',
                    url: url,
                    headers: {
                        'Content-Type': "application/json; charset=utf8"
                    },
                    data: data
                }
                return $http(req);
            }
        }
    })