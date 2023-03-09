<?php
$hostname = "localhost";
$username = "root";
$password = "";
$dbname = "bookstoreeiei";
$conn = mysqli_connect($hostname, $username, $password, $dbname);
if (!$conn) die("ไม่สามารถติดต่อกับ MySQL ได้");
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error); //ให้โชว์ข้อความนี้ขึนมา แล้วออกจากโปรแกรมไปเลยไม่ทำต่อ
}
mysqli_query($conn, "SET character_set_results=tis620");
mysqli_query($conn, "SET character_set_client=tis620");
mysqli_query($conn, "SET character_set_connection=tis620");
$id = $_REQUEST['id'];
$sql = "DELETE FROM book WHERE BookID = '$id' ";
mysqli_query($conn, $sql) or die ( "DELETE จาตาราง book มีข้อผิดพลาดเกิดขึ้น".mysqli_error($conn));
mysqli_close ( $conn );
header("Location:listofbook.php");
?>
