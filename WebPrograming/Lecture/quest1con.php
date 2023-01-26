
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Result </title>
</head>
<body>

    <center>

        <h2> Result </h2>
        <?php

            if (isset($_POST['operator'])) {

                if ($_POST['operator'] == 'Square') {
                    echo 'Edge is : ' . $_POST['x'] . '<br> Area of Square is ' . square() . '<br>';
                }
                else if ($_POST['operator'] == 'Rectangle') {

                    echo 'Width is : ' . $_POST['x'] . '<br> Lenght is : ' . $_POST['z'] . '<br> Area of Rectangle is : ' . rectangle() . '<br>';
                }
                else if ($_POST['operator'] == 'Rhombus') {

                    echo 'Base is : ' . $_POST['x'] . '<br> Height is : ' . $_POST['z'] . '<br> Area of Rhombus is : ' . rhombus() . '<br>';
                }
                else if ($_POST['operator'] == 'Triangle') {

                    echo 'Base is : ' . $_POST['x'] . '<br> Height is : ' . $_POST['z'] . '<br> Area of Triangle is : ' . triangle() . '<br>';
                }

            }

            function square() {

                return $_POST['x'] * $_POST['x'];
            }

            function rectangle() {

                return $_POST['x'] * $_POST['z'];
            }

            function rhombus() {

                return 1/2 * $_POST['x'] * $_POST['z'];
            }

            function triangle() {

                return 1/2 * $_POST['x'] * $_POST['z'];
            }

            echo '<br><a href="quest1.php"><input type="submit" value="Back To Calculator"></a>';
        ?>

    </center>
        
</body>
</html>