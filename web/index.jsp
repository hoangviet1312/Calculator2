<%--
  Created by IntelliJ IDEA.
  User: hoangviet
  Date: 7/26/2018
  Time: 10:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>$Title$</title>
</head>
<body>
<div class="container">
    <form method="post" action="/calculator">
        <div class="form-group">
            <label for="formGroupExampleInput">First Number</label>
            <input type="text" class="form-control" name="first_number" id="formGroupExampleInput"
                   placeholder="first number">
        </div>
        <div class="form-group">
            <label>Option</label>
            <select class="custom-select" name="luachon">
                <option value="+">+</option>
                <option value="-">-</option>
                <option value="*">*</option>
                <option value="/">/</option>
            </select>
        </div>
        <div class="form-group">
            <label for="formGroupExampleInput3">Second Number</label>
            <input type="text" class="form-control" name="second_number" id="formGroupExampleInput3"
                   placeholder="second number">
        </div>
        <button type="submit" class="btn btn-primary">Calculate Discount</button>
    </form>
</div>
</body>
</html>
