<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
    <script type="text/javascript">
        var websocket;

        // 首先判断是否 支持 WebSocket
        if('WebSocket' in window) {
            // websocket = new WebSocket("ws://127.0.0.1:8081/springTest/testHandler?userId=zhaoshouyun");
            websocket = new WebSocket("ws://localhost:8081/wsMy?jspCode=AA");
        } else if('MozWebSocket' in window) {
            websocket = new MozWebSocket("ws://127.0.0.1:8080/wsMy?jspCode=AA");
        } else {
            websocket = new SockJS("ws://127.0.0.1:8080/wsMy?jspCode=AA");
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
</head>
<body>
</body>
</html>
