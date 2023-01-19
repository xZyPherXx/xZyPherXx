
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Create Form Con </title>
</head>
<body>

    <center>
        <br><br><br><br>
        <?php

            function display($id , $user , $sex , $colors) {

                echo "Student ID : " . $id . "<br>";
                echo "Student Name : " . $user . "<br>";
                echo "Student Sex : " . $sex . "<br>";
                echo 'Hobby : ';
                if (isset($_POST['hobby1'])) echo $_POST['hobby1'] . ' ';
                if (isset($_POST['hobby2'])) echo $_POST['hobby2'] . ' ';
                if (isset($_POST['hobby3'])) echo $_POST['hobby3'] . ' ';
    
                echo '<br> Color : ';
                if (!empty($colors)) {
    
                    for ($index = 0 ; $index < count($colors) ; $index++) {
                        
                        echo ($index + 1 != count($colors)) ? $colors[$index] . ', ' : $colors[$index];
                    }
    
                }
                else echo 'Not choose a colors.';

            }

            $id = $_POST['studentID'];
            $user = $_POST['user'];
            $password = $_POST['password'];
            $sex = $_POST['sex'];
            $colors = $_POST['colors'];
            display($id , $user , $sex , $colors);
        ?>

        <br><br><br><br>
        <a href="createForm.php"> Back To Form </a>
    </center>

</body>
</html>