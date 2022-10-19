<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form update</title>
</head>
<body>

<h1>Form setting</h1>

<a href="/setting">Setting</a>

<form:form modelAttribute="form">
    ${form}
</form:form>

</body>
</html>