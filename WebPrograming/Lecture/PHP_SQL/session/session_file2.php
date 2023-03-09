
<?php
    session_start();
    $username = $_GET['username'];
    $_SESSION['username']=$username;
?>

    Your name entry is : 
<?php
    
    echo $_SESSION['username'];

?>

<br><br><a href="session_file3.php">คลิกตรงนี้เพื่อไปยังไฟล์ session_file3.php</a>