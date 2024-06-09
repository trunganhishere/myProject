<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>trungAnhIsHere</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
</head>
<body class="bg-dark">
<%@ include file="headerAdmin.jsp" %>
<form class="shadow-lg p-3 mb-5 bg-body-tertiary rounded col-7" style="margin-top: 12%; margin-left: 23%" action="/admin/picture/add" method="post">
    <p class="h1 text-center">ADD IMAGE</p>
    <div class="position-relative mt-3">
        <div class="mb-3 col-6">
            <label for="linkImg" class="form-label" style="margin-left: 50%">Link Image</label>
            <input type="text" class="form-control" style="margin-left: 50%" id="linkImg" name="linkImg">
        </div>
        <div class="mb-3 col-6">
            <label for="col" class="form-label" style="margin-left: 50%">Width</label>
            <input type="text" class="form-control" style="margin-left: 50%" id="col" name="col">
        </div>
    </div>
    <div class="position-relative mt-5">
        <button class="btn btn-success position-absolute top-100 start-50 translate-middle col-5" onclick="return checkNull()">Submit</button>
    </div>
    <br>
</form>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    <script>
        function checkError(){
            let linkImg = document.getElementById("linkImg").value
            let col = document.getElementById("col").value
            if(linkImg === "" || col === ""){
                alert("Please fill in all fields!")
                return false;
            }else {
                return true;
            }
        }
    </script>
</html>