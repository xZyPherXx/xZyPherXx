<?php

    $hostname = "localhost";
    $username = "root";
    $password = "";
    $dbname = "bookstoreeiei";
    $conn = mysqli_connect($hostname, $username, $password, $dbname);
    $BookID = $_POST['BookID'];
    $BookName = $_POST['BookName'];
    $TypeID = $_POST['TypeID'];
    $StatusID = $_POST['StatusID'];
    $Publish = $_POST['Publish'];
    $UnitPrice = $_POST['UnitPrice'];
    $UnitRent = $_POST['UnitRent'];
    $DayAmount = $_POST['DayAmount'];
    $BookDate = date("Y-m-d");
    $oldImageFile = @$_POST['oldImageFile'];
    $imageFileName = @$_FILES['imageFile']['name'];
    $imageFileType = @$_FILES['imageFile']['type'];
    $imageFileSize = @$_FILES['imageFile']['size'];
    $imageFileTmpName = @$_FILES['imageFile']['tmp_name'];
    $picture="";

    if (!$conn) die("ไม่สามารถติดต่อกับ MySQL ได้");
    if ($conn->connect_error) die("Connection failed: " . $conn->connect_error);

    mysqli_query($conn, "SET character_set_results=utf8mb4");
    mysqli_query($conn, "SET character_set_client=utf8mb4");
    mysqli_query($conn, "SET character_set_connection=utf8mb4");

    if ($_FILES['imageFile']['name']=="") echo '<b><li>คุณไม่ได้เลือกรูปภาพ</li></b><br>';
    else {
        move_uploaded_file($_FILES["imageFile"]["tmp_name"],"pictures/".$_FILES["imageFile"]["name"]);
        $picture = $_FILES['imageFile']['name'];
    }

    $sql = "insert into book(BookID, BookName, TypeID, StatusID, Publish, UnitPrice, UnitRent,
    DayAmount, picture, BookDate) values ('$BookID', '$BookName', '$TypeID', '$StatusID', '$Publish',
    '$UnitPrice', '$UnitRent', '$DayAmount', '$picture', '$BookDate')";
    mysqli_query($conn, $sql) or die("insert ลงตาราง book มีข้อผิดพลาดเกิดขึ้น" .mysqli_error());
    echo '<br><br><h2>บันทึกข้อมูลหนังสือรหัส '.$BookID.' เรียบร้อย</h2>';
    echo '<br><br><a href="listofbook.php">กลับหน้า listofbook.php</a>';
    mysqli_close($conn);
    echo '</center>';

?>