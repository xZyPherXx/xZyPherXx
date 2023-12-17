
public class StudentGrade {

    private float score = 0 , credit = 0 , gpa = 0;
    private String status;

    public StudentGrade(String grades[]) {

        setScore(grades);
        setCredit(grades);
        setGPA(grades);
        setStatus(gpa);
    }

    public void setScore(String grades[]) { 

        for (int index = 0 ; index < grades.length ; index++) { 

            switch (grades[index]) {

                case "A" : this.score += 4.0 * 3.0; break;
                case "B+" : this.score += 3.5 * 3.0; break;
                case "B" : this.score += 3.0 * 3.0; break;
                case "C+" : this.score += 2.5 * 3.0; break;
                case "C" : this.score += 2.0 * 3.0; break;
                case "D+" : this.score += 1.5 * 3.0; break;
                case "D" : this.score += 1.0 * 3.0; break;

                default : this.score += 0 * 3.0;
            }

        }

    }

    public void setCredit(String grades[]) {

        this.credit = grades.length * 3;
    }

    public void setGPA(String grades[]) {

        this.gpa = getScore() / getCredit();
    }

    public void setStatus(float gpa) {

        if (gpa < 1.25) {

            this.status = "Retire";
        }
        else if (gpa < 2.00) {

            this.status = "Probation";
        }
        else {

            this.status = "Normal";
        }

    }

    public float getScore() {

        return this.score;
    }

    public float getCredit() {

        return this.credit;
    }

    public float getGPA() {

        return this.gpa;
    }

    public String getStatus() {

        return this.status;
    }

}