
<?php

    session_start();
    $Username = $_POST['Username'];
    $Password = $_POST['Password'];
    $hostname = "localhost";
    $username = "root";
    $password = "";
    $dbname = "database: session";
    $conn = mysqli_connect( $hostname, $username, $password );
    if ( ! $conn ) die ( "ไม่สามารถติดต่อกับ MySQL ได้")

        mysqli_select_db ( $conn, $dbname )or die ( "ไม่สามารถเลือกฐานข้อมูล session ได้" );
        $sqltxt = "SELECT * FROM login where username = '$Username'";
        $result = mysqli_query ( $conn, $sqltxt );
        $rs = mysqli_fetch_array ( $result );

    if ( $rs ) {

        if ($rs['password'] == $Password) {

            $_SESSION['Username']=$Username;
            header("Location: welcome.php?Username=$Username");
        }
        else {

            echo "<br>Password not match.";
            echo "<br><a href='login.php'>คลิก กลับไปเพื่อ login</a>";
        }

    }

    else {

        echo "Not found Username " . $Username;
        echo "<br><a href='login.php'>คลิก กลับไปเพื่อ login </a>";
    }

?>