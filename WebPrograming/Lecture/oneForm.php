
<html>
<head><title> Create Form </title></head>
<body>

        <h2>Form of Student</h2>

        <?php

            if (isset($_POST['confirm'])) {

                echo '<br> Student ID : ' . $_POST['studentID'];
                echo '<br> Student Name : ' . $_POST['user'];
                echo '<br> Student Sex : ';
                if (isset($_POST['sex'])) echo $_POST['sex'];

                echo '<br> Hobby : ';
                if (!empty($_POST['hobbys'])) {

                    for ($index = 0 ; $index < count($_POST['hobbys']) ; $index++) {

                        echo ($index + 1 != count($_POST['hobbys'])) ? $_POST['hobbys'][$index] . ', ' : $_POST['hobbys'][$index];
                    }

                }
                else echo 'Not choose a hobbys.';

                echo '<br> Color : ';
                if (!empty($_POST['colors'])) {

                    for ($index = 0 ; $index < count($_POST['colors']) ; $index++) {
 
                        echo ($index + 1 != count($_POST['colors'])) ? $_POST['colors'][$index] . ', ' : $_POST['colors'][$index];
                    }

                }
                else echo 'Not choose a colors.';

            }
            else {

        ?>

            <form action="" method="post" name="studentForm" id="studentForm">

                Student ID : <input type="text" name="studentID" maxlength="14" required/><br/>
                First Name - Last Name : <input type="text" name="user" size="30" required/><br/>
                Password : <input type="password" name="password" maxlength="12" size="20" required/><br/>

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
                <input type="reset" name="clear" value="ResetData">

            </form>

        <?php

            }
        ?>

    </body>
</html>