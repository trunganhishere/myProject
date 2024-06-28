<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
                    <a class="nav-link active" aria-current="page" href="/admin/home">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin/picture">Picture</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin/infomation">Infomation</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin/contact">Contact</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" aria-disabled="true">Chào: ${infomation.name}!</a>
                </li>
            </ul>
            <a href="/admin/picture/form/add" class="btn btn-outline-secondary" style="margin-right: 2%">Add image</a>
            <a href="/sign-in" class="btn btn-outline-dark">Sign out</a>
        </div>
    </div>
</nav>