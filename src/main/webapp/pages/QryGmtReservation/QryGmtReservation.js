Application.$controller("QryGmtReservationPageController", ["$scope", function($scope) {
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

        /* PROGRAM VERSION 
           cn04 07/06/2018 testing completed for deployment
        */


        /*
         
         if (!($scope.pageParams.pParam1 === undefined || $scope.pageParams.pParam1 === null)) {
            var link = "~26" + $scope.pageParams.pParam1 + "~26";

            $scope.pageParams.pOrdnum = link.split('~26pOrdnum~3D').pop().split('~2C').shift();

            var m_scncod = link.split('~2CpScncod~3D').pop().split('~26').shift();

            if (m_scncod !== undefined) {
                $scope.pageParams.pScncod = m_scncod;
            }
        }
        
        */


        if ($scope.pageParams.pTrnnum !== undefined && $scope.pageParams.pTrnnum !== null && $scope.pageParams.pTrnnum !== "") {
            $scope.Widgets.formFilter.formWidgets.p_trnnum.datavalue = $scope.pageParams.pTrnnum;
        }

        if ($scope.pageParams.pOrdnum !== undefined && $scope.pageParams.pOrdnum !== null && $scope.pageParams.pOrdnum !== "") {
            $scope.Widgets.formFilter.formWidgets.p_source_ordnum.datavalue = $scope.pageParams.pOrdnum;
        }


        if ($scope.pageParams.pDestOrdnum !== undefined && $scope.pageParams.pDestOrdnum !== null && $scope.pageParams.pDestOrdnum !== "") {
            $scope.Widgets.formFilter.formWidgets.p_dest_ordnum.datavalue = $scope.pageParams.pDestOrdnum;
        }


        if ($scope.Widgets.formFilter.formWidgets.p_source_ordnum.datavalue !== undefined || $scope.Widgets.formFilter.formWidgets.p_dest_ordnum.datavalue !== undefined || $scope.Widgets.formFilter.formWidgets.p_trnnum.datavalue !== undefined) {

            $scope.Variables.svProcCS1000PK0_GetGmtReservQty.invoke(

                {
                    "inputFields": {
                        "pPrgid": $scope.Variables.statPrgid.dataSet.dataValue,
                        "pSourceOrdnum": $scope.pageParams.pOrdnum,
                        "pDestOrdnum": $scope.pageParams.pDestOrdnum,
                        "pTrnnum": $scope.pageParams.pTrnnum
                    }
                },
                function(data) {},
                function(error) {
                    $scope.Variables.notifMsg.setAlertType("error");
                    $scope.Variables.notifMsg.setMessage("Error: " + error);
                    $scope.Variables.notifMsg.notify();
                });
        }

    };


    $scope.button3Click = function($event, $isolateScope) {

        var m_Sordnum = $scope.Widgets.formFilter.formWidgets.p_source_ordnum.datavalue;
        var m_Dordnum = $scope.Widgets.formFilter.formWidgets.p_dest_ordnum.datavalue;
        var m_Trnnum = $scope.Widgets.formFilter.formWidgets.p_trnnum.datavalue;


        if ((m_Sordnum == "" || m_Sordnum == null || m_Sordnum == undefined) && (m_Dordnum == "" || m_Dordnum == null || m_Dordnum == undefined) &&
            (m_Trnnum == "" || m_Trnnum == null || m_Trnnum == undefined)) {
            $scope.Variables.notifMsg.setMessage("Source or Destination Order Number or Reservation Number is required to query");
            $scope.Variables.notifMsg.notify();
            return false;
        }


        $scope.Variables.svProcCS1000PK0_GetGmtReservQty.invoke();
    };
    //--------------------------------------------------------------------------------------------------------------------
    $scope.button1Click = function($event, $isolateScope) {
        $scope.Variables.svProcCS1000PK0_GetGmtReservQty.dataSet = null;
    };

    //----------------------------------------------------------------------------------------------------------------
    $scope.p_source_ordnumChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Widgets.formFilter.formWidgets.p_source_ordnum.datavalue = newVal.toUpperCase();
    };
    //----------------------------------------------------------------------------------------------------------------

    $scope.p_dest_ordnumChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Widgets.formFilter.formWidgets.p_dest_ordnum.datavalue = newVal.toUpperCase();
    };
    //----------------------------------------------------------------------------------------------------------------

    $scope.p_trnnumChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Widgets.formFilter.formWidgets.p_trnnum.datavalue = newVal.toUpperCase();
    };
    //----------------------------------------------------------------------------------------------------------------

}]);


Application.$controller("gridMasterController", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("gridMasterController", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);