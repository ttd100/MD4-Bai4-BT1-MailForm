<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring form</title>
</head>
<body>

<h1>Setting</h1>

<form:form method="post" modelAttribute="form">
    <table>
        <tr>
            <td>Languages:</td>
            <td>
                <form:select path="language" items="${languageList}" />
            </td>
        </tr>
        <tr>
            <td>Page Size:</td>
            <td>
                <form:select path="pageSize" items="${pageSize}"/>
            </td>
        </tr>
        <tr>
            <td>Spam filter:</td>
            <td>
                <form:checkbox path="spamFilter"/>
            </td>
        </tr>
        <tr>
            <td>Signature:</td>
            <td>
                <form:textarea path="signature"/>
            </td>
        </tr>
    </table>
    <form:button>Update</form:button>

</form:form>

${form}

</body>
</html>