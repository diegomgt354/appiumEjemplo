$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("actualizacion.feature");
formatter.feature({
  "line": 2,
  "name": "Ingreso al aplicativo taxi",
  "description": "quiero poder ingresar al aplicativo taxiRara",
  "id": "ingreso-al-aplicativo-taxi",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Actualizar"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Ingreso de cliente",
  "description": "",
  "id": "ingreso-al-aplicativo-taxi;ingreso-de-cliente",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@ActualizaconelusuarioCliente"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Ingresar al aplicativo",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Ir a tipo cliente",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "seleccionar ya tengo cuenta",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Ingresar datos \"\u003ccorreo\u003e\" y \"\u003cpassword\u003e\" en login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Ingresar",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "GPS en \"\u003cactivaGPS\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "ir a opcion Actualizar",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "actualizar datos cliente \"\u003cnombre\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Atras",
  "keyword": "And "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "ingreso-al-aplicativo-taxi;ingreso-de-cliente;",
  "rows": [
    {
      "cells": [
        "correo",
        "password",
        "activaGPS",
        "nombre"
      ],
      "line": 18,
      "id": "ingreso-al-aplicativo-taxi;ingreso-de-cliente;;1"
    },
    {
      "cells": [
        "clienteprimero@gmail.com",
        "1234567",
        "NO",
        "diego546"
      ],
      "line": 19,
      "id": "ingreso-al-aplicativo-taxi;ingreso-de-cliente;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "Ingreso de cliente",
  "description": "",
  "id": "ingreso-al-aplicativo-taxi;ingreso-de-cliente;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Actualizar"
    },
    {
      "line": 5,
      "name": "@ActualizaconelusuarioCliente"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Ingresar al aplicativo",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Ir a tipo cliente",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "seleccionar ya tengo cuenta",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Ingresar datos \"clienteprimero@gmail.com\" y \"1234567\" en login",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Ingresar",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "GPS en \"NO\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "ir a opcion Actualizar",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "actualizar datos cliente \"diego546\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Atras",
  "keyword": "And "
});
formatter.match({
  "location": "loginStep.ingresar_al_aplicativo()"
});
formatter.result({
  "duration": 15209046600,
  "status": "passed"
});
formatter.match({
  "location": "loginStep.ir_a_tipo_cliente()"
});
formatter.result({
  "duration": 1387325900,
  "status": "passed"
});
formatter.match({
  "location": "loginStep.seleccionar_ya_tengo_cuenta()"
});
formatter.result({
  "duration": 2354688800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "clienteprimero@gmail.com",
      "offset": 16
    },
    {
      "val": "1234567",
      "offset": 45
    }
  ],
  "location": "loginStep.ingresar_datos_y_en_login(String,String)"
});
formatter.result({
  "duration": 4074569400,
  "status": "passed"
});
formatter.match({
  "location": "loginStep.ingresar()"
});
formatter.result({
  "duration": 1390459700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NO",
      "offset": 8
    }
  ],
  "location": "loginStep.GPS_en_activo(String)"
});
formatter.result({
  "duration": 6977692300,
  "status": "passed"
});
formatter.match({
  "location": "loginStep.ir_a_opcion_Actualizar()"
});
formatter.result({
  "duration": 3900984100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "diego546",
      "offset": 26
    }
  ],
  "location": "loginStep.actualizar_datos_cliente(String)"
});
formatter.result({
  "duration": 8209294300,
  "status": "passed"
});
formatter.match({
  "location": "loginStep.Atras()"
});
formatter.result({
  "duration": 3119625800,
  "status": "passed"
});
});