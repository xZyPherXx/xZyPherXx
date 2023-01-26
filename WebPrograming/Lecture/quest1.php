
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Area Calculator </title>
</head>
<body>

    <center>

        <h2> Area Calculator </h2>

        <form action="quest1con.php" method="post" name="quest" id="quest">

            <input type="text" name="x"><br>
            <input type="text" name="z"><br>

            <input type="radio" name="operator" value="Square" required> Square <br>
            <input type="radio" name="operator" value="Rectangle" required> Rectangle <br>
            <input type="radio" name="operator" value="Rhombus" required> Rhombus <br>
            <input type="radio" name="operator" value="Triangle" required> Triangle <br>

            <input type="submit" name="confirm" value="Submit">
            <input type="reset" name="clear" value="Reset">

        </form>

    </center>
    
</body>
</html>