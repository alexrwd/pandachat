<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 7/29/14
  Time: 11:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<video autoplay></video>

<script>
    navigator.getUserMedia = navigator.getUserMedia || navigator.mozGetUserMedia || navigator.webkitGetUserMedia;
    navigator.getUserMedia({ audio: true, video: true }, gotStream, streamError);

    function gotStream(stream) {
        document.querySelector('video').src = URL.createObjectURL(stream);
    }

    function streamError(error) {
        console.log(error);
    }
</script>
</body>
</html>
