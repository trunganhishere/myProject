<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>trungAnhNe</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
</head>
<body class="bg-dark">
<%@ include file="headerUser.jsp" %>
<div class="container text-center" style="padding-top: 2%;">
    <a style="color:white ;font-size: 300%; font-weight: bold;">Picture</a>
</div>
<div style="display: flex; justify-content: center; padding-top: 3%;">
    <div class=" col-11 col-lg-10" style="padding-left: 5%;">
        <c:forEach items="${mainImage}" var="a">
            <img src="${a.image}" class="col-${a.col} img-fluid" style="border: white 3px solid ; border-radius:2%" data-bs-toggle="modal" data-bs-target="#exampleModal${a.id}">
            <div class="modal fade" id="exampleModal${a.id}" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-body">
                            <img src="${a.image}" class="img-fluid" alt="Ảnh">
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>
<hr style="border: 2px solid white;;">
<div class="bg-dark col-12" style="display: flex;
    justify-content: center; color:white">
    <div class="col-12 col-xl-8 " style="justify-content: center; display: flex; padding-top: 5%; font-size:larger">
        <div class="col-6 col-xl-4" style="display: flex; justify-content: center;"><a
                style="padding-right: 5px;">Adress:</a>
            <p><a href="https://www.google.com/maps/place/Thanh+Oai,+H%C3%A0+N%E1%BB%99i,+Vi%E1%BB%87t+Nam/@20.85998,105.6167332,11z/data=!3m1!4b1!4m6!3m5!1s0x3135b334a644bd6d:0xf61a39318daee561!8m2!3d20.8532165!4d105.7688513!16s%2Fm%2F03mcrrh?entry=ttu"
                  class="link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
                Thanh Oai -
                Ha Noi</a></p>
        </div>
        <div class="col-6 col-xl-4" style="text-align: center;"><a>Phone number: ${myInfomation.phoneNumber}</a>
        </div>
    </div>
</div>
<div class="bg-dark" style="color: white; text-align: center;"><a>Email: duongtrunganh204@gmai.com</a>
    <br>
    <br>
    <br>
    <br>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</html>