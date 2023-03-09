
<?php

    session_start();
    session_destroy();

?>

<form action="checkUser.php" method="post">

    <table border='1' width='300'>

        <tr><td colspan='2' align='center'> Please Enter Username and Password </td></tr>
        <tr><td>Username :</td> <td><input type="text" name="username"></td></td>
        <tr><td>Password :</td> <td><input type="password" name="password"></td></td>
        <tr><td colspan='2' align='center'><input type="submit" value=" Confirm "></td></tr>

    </table>

</form>