
<?php
    session_start();
    session_destroy();
?>

<form action="session_file2.php">

    Please Enter Username and press OK <br><br>
    <input type="text" name="username">
    <input type="submit" value=" OK ">

</form>