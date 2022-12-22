
<html>
<head><title> Create Form </title></head>
<body>
    <h2>Form of Student</h2>
    <form action="test.md" method="post" name="studentForm" id="studentForm">
        Student ID : <input type="text" name="studentID" maxlength="10" /><br />
        First Name - Last Name : <input type="text" name="user" size="40" /><br />
        Password : <input type="password" name="password" maxlength="6" size="6" /><br />
        Sex : 
        <input type="radio" name="sex" value="1" /> Male
        <input type="radio" name="sex" value="2" /> Female <br /> 
        Hobby : 
        <input type="checkbox" name="hobby1" value="1" /> Hang out
        <input type="checkbox" name="hobby2" value="2" /> Coding
        <input type="checkbox" name="hobby3" value="3" /> Play game<br /> 
        Upload file : <input type="file" name="file" /> <br />
    </form>
</body>
</html>