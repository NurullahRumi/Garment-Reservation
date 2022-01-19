Application.$controller("QrySurplusForRepeatsPageController", ["$scope", function($scope) {
    "use strict";

    /* perform any action on widgets/variables within this block */
    $scope.onPageReady = function() {
        /*
         * variables can be accessed through '$scope.Variables' property here
         * e.g. to get dataSet in a staticVariable named 'loggedInUser' use following script
         * $scope.Variables.loggedInUser.getData()
         *
         * widgets can be accessed through '$scope.Widgets' property here
         * e.g. to get value of text widget named 'username' use following script
         * '$scope.Widgets.username.datavalue'
         */
        if ($scope.pageParams.pOrdnum !== undefined && $scope.pageParams.pOrdnum !== "") {
            $scope.Variables.svProcCS1000PK0_CS411QryGmtStock.setInput("pPrgid", $scope.Variables.statPrgid.dataSet.datavalue);
            $scope.Variables.svProcCS1000PK0_CS411QryGmtStock.setInput("pOrdnum", $scope.pageParams.pOrdnum);
            $scope.Variables.svProcCS1000PK0_CS411QryGmtStock.invoke();
        }


    };


    $scope.button3Click = function($event, $isolateScope) {
        var m_Ordnum = $scope.Widgets.formFilter.formWidgets.pOrdnum.datavalue;

        if (m_Ordnum == "" || m_Ordnum == null || m_Ordnum == undefined) {
            $scope.Variables.notifMsg.setMessage("Enter an Order Number first");
            $scope.Variables.notifMsg.notify();
            return false;
        }
        $scope.Variables.svProcCS1000PK0_CS411QryGmtStock.invoke();
    };


    $scope.button1Click = function($event, $isolateScope) {
        $scope.Variables.svProcCS1000PK0_CS411QryGmtStock.dataSet = null;
        $scope.Variables.svProcCS1000PK0_CS411QryReservation.dataSet = null;
    };


    $scope.pOrdnumChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Widgets.formFilter.formWidgets.pOrdnum.datavalue = newVal.toUpperCase();
    };


    $scope.svProcCS1000PK0_CS411QryGmtStockonError = function(variable, data) {
        if (data !== undefined) {
            $scope.Variables.notifMsg.setAlertType("error");
            $scope.Variables.notifMsg.setMessage("Query order number/repeats.");
            $scope.Variables.notifMsg.notify();
            return false;
        }
    };


    $scope.svProcCS1000PK0_CS411QryReservationonBeforeUpdate = function(variable, inputData) {
        if (inputData.pOrdnum == undefined) {
            return false;
        }
    };

}]);


Application.$controller("tableMasterController", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("tableDetailController", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);