
<?php

    session_start();
    echo "ชื่อผู้ใช้ของคุณยังคงเป็น " . $_SESSION['username'];

?>

<br><br><a href="session_file1.php">คลิกตรงนี้เพื่อไปยังไฟล์ session_file1.php</a>