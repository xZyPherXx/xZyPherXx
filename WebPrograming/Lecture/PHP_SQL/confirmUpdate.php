
<?php

    if (empty(trim($_POST['fullName'])) || empty(trim($_POST['address'])) || empty(trim($_POST['email'])) || empty(trim($_POST['tel']))) {

        echo '<script> alert("Something went wrong!"); history.back() </script>';
        exit();
    }
    else if (!preg_match('/^[ๅภถุึคตจขชๆไำพะัีรนยบลฟหกดเ้่าสวงผปแอิืทมใฝฎฑธ๊ณฯญฐฤฆฏโฌ็๋ษศซฉฮ์?ฒฬฦa-zA-Z ]+$/' , $_POST['fullName'])) {

        echo '<script> alert("Fullname not use some character!"); history.back() </script>';
        exit();
    }
    else if (!filter_var(trim($_POST['email']) , FILTER_VALIDATE_EMAIL)) {

        echo '<script> alert("Email is not a valid email address"); history.back() </script>';
        exit();
    }
    else if (!ctype_digit(trim($_POST['tel']))) {

        echo '<script> alert("Telephone must only numbers!"); history.back() </script>';
        exit();
    }

    $host = 'localhost';
    $username = 'root';
    $password = '';
    $database = 'bookstore';
    $connect = mysqli_connect($host , $username , $password);

    $id = $_POST['id'];
    $name = $_POST['fullName'];
    $address = $_POST['address'];
    $email = $_POST['email'];
    $tel = $_POST['tel'];

    if (!$connect) die ('Cannot Connect mySQL!!!');

    mysqli_select_db($connect , $database) or die('Cannot connect to database!!!'); 
    mysqli_query($connect , "set character_set_connection=utf8");
    mysqli_query($connect , "set character_set_client=utf8");
    mysqli_query($connect , "set character_set_results=utf8");
    
    $sql = "UPDATE customer SET name = '$name' , address = '$address' , email = '$email' , telephone = '$tel' WHERE id = '$id'";
    mysqli_query($connect , $sql) or die ('Someting Went Wrong While Update Customer' . mysqli_error());
    mysqli_close($connect);
    echo '<center><h1>Update Customer Id ' . $id . ' Successful!!!</h1>' ;
    echo '<br><br><a href="customerList.php"> <input type="submit" value="Back To Customer List Page"> </a></center>';

?>