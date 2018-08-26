<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>无标题文档</title>
</head>
<body>

<script type="text/javascript">
    var websocket;

    // 首先判断是否 支持 WebSocket
    if('WebSocket' in window) {

        websocket = new WebSocket("ws://localhost:8080/wsMy?jspCode=AA");
    } else if('MozWebSocket' in window) {
        websocket = new MozWebSocket("ws://localhost:8080/wsMy?jspCode=AA");
    } else {
        websocket = new SockJS("ws://localhost:8080/wsMy?jspCode=AA");
    }

    // 打开连接时
    websocket.onopen = function(event) {
        console.log(" websocket.onopen  ");
    };

    // 收到消息时
    websocket.onmessage = function(event) {
        console.log("收到一条消息"+event.data);
        alert(event.data);
    };

    websocket.onerror = function(event) {
        console.log("  websocket.onerror  ");
    };

    websocket.onclose = function(event) {
        console.log("  websocket.onclose  ");
    };



</script>
</body>
</html>
