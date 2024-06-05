<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>trungAnhIsHere</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body class="bg-dark">

<form class="shadow-lg p-3 mb-5 bg-body-tertiary rounded col-7" style="margin-top: 12%; margin-left: 23%" action="/checking" method="get">
    <p class="h1 text-center">SIGN IN</p>
    <div class="position-relative mt-3">
        <div class="mb-3 col-6">
            <label for="username" class="form-label" style="margin-left: 50%">Your username</label>
            <input type="text" class="form-control" style="margin-left: 50%" id="username" name="username">
        </div>
        <div class="mb-3 col-6">
            <label for="password" class="form-label" style="margin-left: 50%">Your password</label>
            <input type="password" class="form-control" style="margin-left: 50%" id="password" name="password">
        </div>
    </div>
    <div class="position-relative mt-5">
        <button class="btn btn-primary position-absolute top-100 start-50 translate-middle col-5" onclick="return checkNull()">Sign in</button>

    </div><br>
    <label style="color: red" class="mt-2" id="errorMessage">${error}</label>
    <p class="text-end mt-3"> <a href="/sign-up">Create account ?</a><p>
    <br>
</form>

<script>
    function checkError(){
        let username = document.getElementById("username").value
        let password = document.getElementById("password").value
        if(username === "" || password === ""){
            alert("Please fill in all fields!")
            return false;
        }else {
            return true;
        }
    }
</script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>