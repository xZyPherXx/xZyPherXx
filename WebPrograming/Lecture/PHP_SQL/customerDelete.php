
<?php

    $id = $_REQUEST['id'];
    $host = 'localhost';
    $username = 'root';
    $password = '';
    $database = 'bookstore';
    $connect = mysqli_connect($host , $username , $password);

    if (!$connect) die ('Cannot Connect To MySQL!');
    mysqli_select_db($connect , $database) or die ('Cannot Select Bookstore Database!');

    $sql = "DELETE FROM customer WHERE id = '$id'";
    mysqli_query($connect , $sql) or die ('Someting Went Wrong While Delete Customer' . mysqli_error());
    mysqli_close($connect);

    header('location:customerList.php');
?>