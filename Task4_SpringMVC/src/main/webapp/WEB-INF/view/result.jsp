<html>
<head>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
</head>

<body class="container mt-5">

    <h2 class="mb-4">Age Calculator</h2>

    <div class="alert alert-success">

        <h4>Your Age</h4>

        <p>
            <strong>${years}</strong> Years,
            <strong>${months}</strong> Months,
            <strong>${days}</strong> Days
        </p>

    </div>

    <a href="${pageContext.request.contextPath}/"
       class="btn btn-primary">
        Calculate Again
    </a>

</body>
</html>