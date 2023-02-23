
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Form Insert Customer </title>
</head>
<body>

    <center>

        <h2> Insert Customer </h2>

        <p style="color : red"> * required field </p>
        <form action="confirmInsert.php" method="post">

            Fullname : <input type="text" name="fullName" maxlength="40" minlength="4" required><br><br>
            Address : <textarea name="address" cols="40" rows="5" required></textarea> <span style = "color : red">*</span> <br><br>
            Email : <input type="text" name="email" size="20" maxlength="40" required><br><br>
            Telephone : <input type="text" name="tel" size="10" maxlength="12" minlength="10" required><br><br>

            <input type="submit" name="confirm" value="Confirm">
            <input type="reset" name="clear" value="Clear">

        </form>

    </center>

</body>
</html>