<!doctype html>
<html lang="vi">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>trungAnhIsHere</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body class="bg-dark">

<form class="shadow-lg p-3 mb-5 bg-body-tertiary rounded col-7" style="margin-top: 10%; margin-left: 23%" action="/user/add" method="post">
    <p class="h1 text-center">SIGN UP</p>
    <div class="position-relative mt-3">
        <div class="mb-3 col-6">
            <label for="name" class="form-label" style="margin-left: 50%">Your name*</label>
            <input type="text" class="form-control" style="margin-left: 50%" id="name" name="name">
        </div>
        <div class="mb-3 col-6">
            <label for="username" class="form-label" style="margin-left: 50%">Your username*</label>
            <input type="text" class="form-control" style="margin-left: 50%" id="username" name="username">
        </div>
        <div class="mb-3 col-6">
            <label for="password" class="form-label" style="margin-left: 50%">Your password*</label>
            <input type="password" class="form-control" style="margin-left: 50%" id="password" name="password">
        </div>
        <div class="mb-3 col-6">
            <label for="age" class="form-label" style="margin-left: 50%">Your age*</label>
            <input type="number" class="form-control" style="margin-left: 50%" id="age" name="age" value="0">
        </div>
        <div class="mb-3 col-6">
            <label for="address" class="form-label" style="margin-left: 50%">Your address</label>
            <input type="text" class="form-control" style="margin-left: 50%" id="address" name="address">
        </div>
        <label for="address" class="form-label" style="margin-left: 25%">Your gender</label>
        <div class="mb-3 col-6" style="margin-left: 25%; display: flex;">
            <div class="form-check">
                <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1" checked value="Male" name="gender">
                <label class="form-check-label" for="flexRadioDefault1">
                    Male
                </label>
            </div>
            <div class="form-check" style="margin-left: 10%;">
                <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" value="Female"  name="gender">
                <label class="form-check-label" for="flexRadioDefault2">
                    Female
                </label>
            </div>
        </div>
        <div class="mb-3 col-6">
            <label for="phoneNumber" class="form-label" style="margin-left: 50%">Your phone number</label>
            <input type="number" class="form-control" style="margin-left: 50%" id="phoneNumber" name="phoneNumber">
        </div>
    </div>
    <div class="position-relative mt-5">
        <button type="submit" class="btn btn-primary position-absolute top-100 start-50 translate-middle col-5" onclick="return checkNull()">Sign up</button>

    </div><br>
    <label style="color: red" class="mt-2" id="errorMessage">${error}</label>
    <br>
    <p class="text-end mt-3"> <a href="/sign-in">You have a account ?</a><p>
    <br>
</form>

<script>
    function checkNull(){
        let name = document.getElementById("name").value
        let username = document.getElementById("username").value
        let password = document.getElementById("password").value
        let age = document.getElementById("age").value
        if (name === ""  || username === "" || password === "" || age === ""){
            alert("Please fill in all necessary fields");
            return false;
        }else {
            return true;
        }

    }
</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>