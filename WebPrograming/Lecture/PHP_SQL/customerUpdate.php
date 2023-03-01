
<!-- Create From To Update -->
<!-- Data Link -->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Edit </title>
</head>
<body>

    <center>

    <h2> Edit Customer </h2>

    <p style="color : red"> * required field </p>

        <?php

            $id = $_REQUEST['id'];
            $host = 'localhost';
            $username = 'root';
            $password = '';
            $database = 'bookstore';
            $connect = mysqli_connect($host , $username , $password);

            if (!$connect) die('Cannot Connect mySQL!!!');

            mysqli_select_db($connect , $database) or die ('Cannot Select Bookstore Database!');
            mysqli_query($connect , "set character_set_connection=utf8");
            mysqli_query($connect , "set character_set_client=utf8");
            mysqli_query($connect , "set character_set_results=utf8");

            $sql = "SELECT * FROM customer WHERE id = '$id'";
            $query = mysqli_query($connect , $sql);
            

            if (!$query) die ("Select join error!!!" . mysqli_error());

            $data = mysqli_fetch_object($query);

            echo '<form action="confirmUpdate.php" method="post">';
            echo 'Id : <input type="text" name="id" maxlength="40" minlength="4" value="' . $data->id . '" readonly required><br><br>';
            echo 'Fullname : <input type="text" name="fullName" maxlength="40" minlength="4" value="' . $data->name . '" required><br><br>';
            echo 'Address : <textarea name="address" cols="40" rows="5" required> ' . $data->address . ' </textarea> <span style = "color : red">*</span> <br><br>';
            echo 'Email : <input type="text" name="email" size="20" maxlength="40" value="' . $data->email . '" required><br><br>';
            echo 'Telephone : <input type="text" name="tel" size="10" maxlength="12" minlength="10" value="' . $data->telephone . '" required><br><br>';

            echo '<input type="submit" name="confirm" value="Confirm">';
            echo '<input type="reset" name="clear" value="Clear">';
            echo '</form>';

        ?>

    </center>

</body>
</html>