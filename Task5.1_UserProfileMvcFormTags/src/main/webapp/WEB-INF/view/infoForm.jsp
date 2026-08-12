<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
    <title>User Registration</title>

    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>

    <style>
        body {
            background-color: white;
        }

        .form-container {
            max-width: 550px;
            margin: 50px auto;
        }

        .form-title {
            text-align: center;
            margin-bottom: 35px;
            color: #222;
        }

        .form-label {
            color: #222;
            font-weight: 500;
        }

        .form-control {
            height: 42px;
            border: 1px solid #d9d9d9;
            border-radius: 4px;
        }

        .form-control:focus {
            border-color: #0d6efd;
            box-shadow: none;
        }

        .submit-btn {
            background-color: #0d6efd;
            border: none;
            padding: 8px 20px;
            border-radius: 4px;
        }

        .submit-btn:hover {
            background-color: #0b5ed7;
        }
    </style>

</head>

<body>

<div class="form-container">

    <h1 class="form-title">
        User Registration
    </h1>

    <form:form modelAttribute="userData" action="showInfo">

        <div class="mb-4">
            <label class="form-label">First Name</label>

            <form:input path="firstName"
                        class="form-control"
                        placeholder="Enter first name"/>
        </div>


        <div class="mb-4">
            <label class="form-label">Last Name</label>

            <form:input path="lastName"
                        class="form-control"
                        placeholder="Enter last name"/>
        </div>


        <div class="mb-4">
            <label class="form-label">Email Address</label>

            <form:input path="email"
                        type="email"
                        class="form-control"
                        placeholder="Enter email"/>
        </div>


        <div class="mb-4">
            <label class="form-label">Date of Birth</label>

            <form:input path="birthDate"
                        type="date"
                        class="form-control"/>
        </div>


        <div class="mb-4">
            <label class="form-label">City</label>

            <form:input path="city"
                        class="form-control"
                        placeholder="Enter city"/>
        </div>


        <div class="text-center">
            <button type="submit"
                    class="btn btn-primary submit-btn">
                Submit
            </button>
        </div>

    </form:form>

</div>

</body>
</html>