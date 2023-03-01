
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Customer List </title>
</head>
<body>

    <?php

        $host = 'localhost';
        $username = 'root';
        $password = '';
        $database = 'bookstore';
        $connect = mysqli_connect($host , $username , $password);

        if (!$connect) die ('Cannot Connect To MySQL!');
        mysqli_select_db($connect , $database) or die ('Cannot Select Bookstore Database!');

        mysqli_query($connect , "set character_set_connection=utf8");
        mysqli_query($connect , "set character_set_client=utf8");
        mysqli_query($connect , "set character_set_results=utf8");

        $sql = 'SELECT * FROM customer ORDER BY id';
        $result = mysqli_query($connect , $sql);

        echo '<center>';
        echo '<br><h3> All Customer </h3>';
        echo '<table width="800" border="0">';
        echo '<tr><td align="left"> <a href="customerInsert.php"> Insert Customer </a></td></tr>';
        echo '</center>';

        echo '<br><table width="800" border="1">';
        echo '<tr bgcolor="">';
        echo '<th width = "150"> Id </th>';
        echo '<th width = "200"> Full Name </th>';
        echo '<th width = "200"> Address </th>';
        echo '<th width = "200"> Email </th>';
        echo '<th width = "200"> Telephone </th>';
        echo '<th width = "80"> Edit </th>';
        echo '<th width = "80"> Delete </th></tr>';

        while ($data = mysqli_fetch_array($result)) {

            echo '<tr align="center" bgcolor="">';
            echo '<td>' . $data['id'] . '</td>';
            echo '<td align="left">' . $data['name'] . '</td>';
            echo '<td align="left">' . $data['address'] . '</td>';
            echo '<td align="left">' . $data['email'] . '</td>';
            echo '<td align="left">' . $data['telephone'] . '</td>';
            
            echo '<td><a href="customerUpdate.php?id=' . $data["id"] . '"> [Edit] </a></td>';
            echo '<td><a href="customerDelete.php?id=' . $data["id"] . '" onclick="return confirm(\'Are You Confirm To Delete Customer Id ' . $data["id"] . '\')"> [Delete] </a></td>';
            echo '</tr>';
        }

        echo '<table>';
        mysqli_close($connect);
    ?>
    
</body>
</html>