public class Preparat {


    private String nume;
    private int grade;
    private int timp;

    public Preparat(String nume, int grade, int timp) {
        this.nume = nume;
        this.grade = grade;
        this.timp = timp;
    }

    public int getGrade() {
        return this.grade;
    }

    public int getTimp() {
        return this.timp;
    }

    @Override
    public String toString() {
        return "Preparat [denumirePreparat=" + nume + ", nrMinuteGatire=" + timp
                + ", gradeGatire=" + grade + "]";
    }

}
