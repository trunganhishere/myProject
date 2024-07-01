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
<form class="shadow-lg p-3 mb-5 bg-body-tertiary rounded col-7" style="margin-top: 12%; margin-left: 23%" action="/admin/picture/<c:if test="${not empty listDetail.id}">update?id=${listDetail.id}</c:if><c:if test="${empty listDetail.id}">add</c:if>" method="post">
    <p class="h1 text-center">ADD IMAGE</p>
    <div class="position-relative mt-3">
        <div class="mb-3 col-6">
            <label for="linkImg" class="form-label" style="margin-left: 50%">Link Image</label>
            <input type="text" class="form-control" style="margin-left: 50%" id="linkImg" name="linkImg" value="${listDetail.image}">
        </div>
        <div class="mb-3 col-6">
            <label class="form-label" style="margin-left: 50%">Name Image</label>
            <select name="nameImage" style="margin-left: 50%" class="form-select" aria-label="Default select example">
                <option value="main_image" ${listDetail.name=="main_image"?"selected":""}>Main Image</option>
                <option value="home_image" ${listDetail.name=="home_image"?"selected":""}>Home Image</option>
                <option value="achievement_image" ${listDetail.name=="achievement_image"?"selected":""}>Achievement Image</option>
            </select>
        </div>
    </div>
    <div class="position-relative mt-5">
        <button class="btn btn-success position-absolute top-100 start-50 translate-middle col-5" onclick="return checkNull()">Submit</button>
    </div>
    <br>
</form>

<table class="bg-white container" style="max-width: 1080px">
    <thead>
    <tr>
        <th style="width: 50%">Image</th>
        <th>Name image</th>
        <th>Width</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listImage}" var="a">
        <tr>
            <td>
                <img src="${a.image}" style="width: 50%">
            </td>
            <td>${a.name}</td>
            <td>${a.col}</td>
            <td>
                <a href="/admin/detail-image?id=${a.id}" class="btn btn-info">Show</a>
                <a href="/admin/picture/delete-image?id=${a.id}" class="btn btn-danger">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

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