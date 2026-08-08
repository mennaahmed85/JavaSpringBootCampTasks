<html>
<head>

    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

</head>

<body class="container mt-5">

<h2>Age Calculator</h2>

<form action="processForm">

    <input type="text"
           name="yearKey"
           placeholder="Year"
           class="form-control">

    <br>

    <input type="text"
           name="monthKey"
           placeholder="Month"
           class="form-control">

    <br>

    <input type="text"
           name="dayKey"
           placeholder="Day"
           class="form-control">

    <br>

    <input type="submit"
           value="Calculate"
           class="btn btn-primary">

</form>

</body>
</html>