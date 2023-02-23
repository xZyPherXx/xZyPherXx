
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Customer </title>
</head>
<body>

    <center>

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

            if (!$connect) die('Cannot mySQL!!!');

            mysqli_select_db($connect , $database) or die('Cannot connect to database!!!'); 
            mysqli_query($connect , "set character_set_connection=utf8");
            mysqli_query($connect , "set character_set_client=utf8");
            mysqli_query($connect , "set character_set_results=utf8");

            $name = $_POST['fullName'];
            $address = $_POST['address'];
            $email = $_POST['email'];
            $tel = $_POST['tel'];

            $sql = "INSERT INTO customer(name , address , email , telephone) VALUES ('$name' , '$address' , '$email' , '$tel')";
            mysqli_query($connect , $sql) or die('Cannot insert into table customer!!!' .mysqli_error());
            echo '<br><br><h2> Insert Customer ' . $name . ' Success!!!</h2>';

            // echo '<h2>Customer Data</h2>';
            // echo '<br>Fullname : ' . $_POST['fullName'];
            // echo '<br>Address : ' . $_POST['address'];
            // echo '<br>Email : ' . $_POST['email'];
            // echo '<br>Telephone : ' . $_POST['tel'];

            echo '<br><br><a href="customerInsert.php"> <input type="submit" value="Back To Insert Page"> </a>';
        ?>

    </center>
    
</body>
</html>