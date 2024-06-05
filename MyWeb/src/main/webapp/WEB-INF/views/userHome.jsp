<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>trungAnhIsHere</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
</head>

<body class="bg-dark">
<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand text-success">trungAnh</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="index.html">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="pic.html">Picture</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                       aria-expanded="false">
                        More
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="gioiThieu.html">About me</a></li>
                        <li><a class="dropdown-item" href="lienHe.html">Contact</a></li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" aria-disabled="true">Chào!</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="container-fluid text-center" style="padding-top: 2%;">
    <a style="color:white ;font-size: 300%; font-weight: bold;">Home</a>
</div>
<div class="col-12 text-white carousel slide" style="text-align: center;display: flex; justify-content: center;" data-bs-ride="carousel" id="carouselExampleAutoplaying">
    <div id="carouselExampleIndicators" class="carousel slide col-12 col-lg-8">
        <div class="carousel-indicators">
            <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active"
                    aria-current="true" aria-label="Slide 1"></button>
            <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1"
                    aria-label="Slide 2"></button>
            <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2"
                    aria-label="Slide 3"></button>
        </div>
        <div class="carousel-inner ">
            <br>
            <br>
            <div class="carousel-item active">
                <img src="Screenshot 2024-01-06 172755.png" class="d-block w-100" alt="...">
            </div>
            <div class="carousel-item">
                <img src="Screenshot 2024-01-06 172030.png" class="d-block w-100" alt="...">
            </div>
            <div class="carousel-item">
                <img src="Screenshot 2024-01-06 172006.png" class="d-block w-100" alt="...">
            </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators"
                data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators"
                data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </button>
    </div>
</div>

<div class="col-12" style="display: flex;
    justify-content: center; color:white">
    <div class="col-12 col-xl-8 " style="justify-content: center; display: flex; padding-top: 5%; font-size:larger">
        <div class="col-6 col-xl-4" style="display: flex; justify-content: center;"><a
                style="padding-right: 5px;">Adress:</a>
            <p><a href="https://www.google.com/maps/place/Thanh+Oai,+H%C3%A0+N%E1%BB%99i,+Vi%E1%BB%87t+Nam/@20.85998,105.6167332,11z/data=!3m1!4b1!4m6!3m5!1s0x3135b334a644bd6d:0xf61a39318daee561!8m2!3d20.8532165!4d105.7688513!16s%2Fm%2F03mcrrh?entry=ttu"
                  class="link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
                Thanh Oai -
                Ha Noi</a></p>
        </div>
        <div class="col-6 col-xl-4" style="text-align: center;"><a>Phone number: ${infomation.phoneNumber}</a>
        </div>
    </div>
</div>
<div style="color: white; text-align: center;"><a>Email: duongtrunganh204@gmai.com</a>
    <br>
    <br>
    <br>
    <br>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</html>