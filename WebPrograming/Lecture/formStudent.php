<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Student Form </title>
</head>
<body>
    
    <h2> Student Form </h2>

    <?php

        if (isset($_POST['confirm'])) {

            echo ' Student ID : ' . $_POST['studentID'];
            echo '<br> Student Name : ' . $_POST['user'];
            echo '<br> Student Sex : ';
            if (isset($_POST['sex'])) echo $_POST['sex'];

            echo '<br> Hobby : ';
            if (!empty($_POST['hobbys'])) {

                for ($index = 0 ; $index < count($_POST['hobbys']) ; $index++) {

                    echo ($index + 1 != count($_POST['hobbys'])) ? $_POST['hobbys'][$index] . ', ' : $_POST['hobbys'][$index];
                }

            }
            else echo 'Hobby not chosen.';

            echo '<br> Color : ';
            if (!empty($_POST['colors'])) {

                for ($index = 0 ; $index < count($_POST['colors']) ; $index++) {

                    echo ($index + 1 != count($_POST['colors'])) ? $_POST['colors'][$index] . ', ' : $_POST['colors'][$index];
                }

            }
            else echo 'Color not chosen.';

            echo '<br> File Upload : ';
            if (!empty($_POST['file'])) echo $_POST['file'];
            else echo 'File not chosen.';

            echo '<br><a href="oneFormStudent.php"> <input type="submit" value="Back To Form"> </a>';
        }
        else {

    ?>

        <form action="" method="post" name="studentForm" id="studentForm">

            Student ID : <input type="text" name="studentID" maxlength="14" placeholder="Student ID" required/><br/>
            Full Name : <input type="text" name="user" size="30" placeholder="Student Name" required/><br/>
            Password : <input type="password" name="password" maxlength="12" size="20" placeholder="Password" required/><br/>

            Sex :
            <input type="radio" name="sex" value="Male" required/> Male
            <input type="radio" name="sex" value="Female" required/> Female <br/>

            Hobby :
            <input type="checkbox" name="hobbys[]" value="Hang out"/> Hang out
            <input type="checkbox" name="hobbys[]" value="Coding"/> Coding
            <input type="checkbox" name="hobbys[]" value="Play game"/> Play game <br/>

            Color :
            <input type="checkbox" name="colors[]" value="Black"/> Black
            <input type="checkbox" name="colors[]" value="White"/> White
            <input type="checkbox" name="colors[]" value="Green"/> Green <br/>

            Upload file : <input type="file" name="file"/><br/>

            <input type="submit" name="confirm" value="Confirm">
            <input type="reset" name="clear" value="Reset Data">

        </form>

    <?php

        }
    ?>

</body>
</html>