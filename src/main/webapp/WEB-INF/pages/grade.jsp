<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Grade Calculator</title>
</head>
<body>
<h2>Grader</h2>
<form:form method="post" action="addContact.html">

    <table>
        <tr>
            <td><form:label path="score">Score: </form:label></td>
            <td><form:input path="score" /></td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="submit" value="Add Contact"/>
            </td>
        </tr>
    </table>

</form:form>
</body>
</html>