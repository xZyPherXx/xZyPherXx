
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Participants Scores </title>
</head>
<body>

    <center>


    <h2> Enter Participants Scores </h2>
    <form action="" method="post" name="participants" id="participants">

        P1 <input type="text" name="p1" maxlength="10" required> <br>
        P2 <input type="text" name="p2" maxlength="10" required> <br>
        P3 <input type="text" name="p3" maxlength="10" required> <br>
        P4 <input type="text" name="p4" maxlength="10" required> <br>
        P5 <input type="text" name="p5" maxlength="10" required> <br>
        <input type="submit" name="confirm" value="Submit">
        <input type="reset" name="clear" value="Reset">

    </form>
    
    <h2> Result </h2>

    <?php

        if (isset($_POST['confirm'])) {

            $datas = array($_POST['p1'], $_POST['p2'], $_POST['p3'], $_POST['p4'], $_POST['p5']);
            rsort($datas);
            echo 'Max to Min :';
            for ($index = 0; $index < count($datas); $index++) {

                echo ($index + 1 != count($datas)) ? $datas[$index] . ', ' : $datas[$index];
            }

            echo '<br> Max : ' . max($datas);
            echo '<br> Min : ' . min($datas);
            echo '<br> Sum : ' . array_sum($datas);
        }

    ?>

    </center>

</body>
</html>