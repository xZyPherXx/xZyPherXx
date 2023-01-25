
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> TextArea Form </title>
</head>
<body>

    <h2> TextArea Form </h2>

    <?php 

        if (isset($_POST['confirm'])) {

            echo 'Username : ' . $_POST['user'];
            echo '<br> Comment : ';
            if (isset($_POST['comment'])) echo $_POST['comment'];
            else echo 'No Comment.';

            echo '<br><a href="oneFormTextArea.php"> <input type="submit" value="Back To Form"> </a>';
        }
        else {

    ?>

        <form action="" method="post" name="textAreaForm" id="textAreaForm">

            Username : <input type="text" name="user" maxlength="10" placeholder="Username" required><br>
            Password : <input type="password" name="password" maxlength="10" placeholder="Password" required><br>
            Comment : <br><textarea name = "comment" cols="40" rows="5"></textarea> <br>
            <input type="submit" name="confirm" value="Confirm">
            <input type="reset" name="clear" value="Reset Data">

        </form>

    <?php
        
        }  
    ?>
    
</body>
</html>