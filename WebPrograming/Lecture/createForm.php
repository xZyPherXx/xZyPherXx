
<html>
<head><title> Create Form </title></head>
<body>

        <h2>Form of Student</h2>
        <form action="createFormCon.php" method="post" name="studentForm" id="studentForm">
            
            Student ID : <input type="text" name="studentID" maxlength="14"/><br/>
            First Name - Last Name : <input type="text" name="user" size="30"/><br/>
            Password : <input type="password" name="password" maxlength="12" size="20"/><br/>

            Sex :
            <input type="radio" name="sex" value="Male"/> Male
            <input type="radio" name="sex" value="Female"/> Female <br/>

            Hobby :
            <input type="checkbox" name="hobby1" value="Hang out"/> Hang out
            <input type="checkbox" name="hobby2" value="Coding"/> Coding
            <input type="checkbox" name="hobby3" value="Play game"/> Play game <br/>

            Color :
            <input type="checkbox" name="colors[]" value="Black"/> Black
            <input type="checkbox" name="colors[]" value="White"/> White
            <input type="checkbox" name="colors[]" value="Green"/> Green <br/>

            Upload file : <input type="file" name="file"/><br/>

            <input type="submit" value="Confirm">
            <input type="reset" value="Reset Data">

        </form>

    </body>
</html>