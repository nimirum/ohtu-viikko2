package ohtu;

public class Submission {
    private String student_number;
    private int week;
    private int hours;
    private boolean a1;
    private boolean a2;
    private boolean a3;
    private boolean a4;
    private boolean a5;
    private boolean a6;
    private boolean a7;
    private boolean a8;
    private boolean a9;
    private boolean a10;
    private boolean a11;

	public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }   
    
    public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hour) {
		this.hours = hour;
	}

	public boolean isA2() {
		return a2;
	}

	public void setA2(boolean a2) {
		this.a2 = a2;
	}

	public boolean isA3() {
		return a3;
	}

	public void setA3(boolean a3) {
		this.a3 = a3;
	}

	public boolean isA4() {
		return a4;
	}

	public void setA4(boolean a4) {
		this.a4 = a4;
	}

	public boolean isA5() {
		return a5;
	}

	public void setA5(boolean a5) {
		this.a5 = a5;
	}

	public boolean isA6() {
		return a6;
	}

	public void setA6(boolean a6) {
		this.a6 = a6;
	}

	public boolean isA7() {
		return a7;
	}

	public void setA7(boolean a7) {
		this.a7 = a7;
	}

	public boolean isA8() {
		return a8;
	}

	public void setA8(boolean a8) {
		this.a8 = a8;
	}

	public boolean isA9() {
		return a9;
	}

	public void setA9(boolean a9) {
		this.a9 = a9;
	}

	public boolean isA10() {
		return a10;
	}

	public void setA10(boolean a10) {
		this.a10 = a10;
	}

	public boolean isA11() {
		return a11;
	}

	public void setA11(boolean a11) {
		this.a11 = a11;
	}

    public boolean isA1() {
		return a1;
	}

	public void setA1(boolean a1) {
		this.a1 = a1;
	}
	
	public int tasksDone(){
		int total =0;
		total += booleanToInt(isA1());
		total += booleanToInt(isA2());
		total += booleanToInt(isA3());
		total += booleanToInt(isA4());
		total += booleanToInt(isA5());
		total += booleanToInt(isA6());
		total += booleanToInt(isA7());
		total += booleanToInt(isA8());
		total += booleanToInt(isA9());
		total += booleanToInt(isA10());
		total += booleanToInt(isA11());
		return total;
	}
	
	private int booleanToInt(boolean done){
		if(done==true)
			return 1;
		else{
			return 0;
		}
	}

	@Override
    public String toString() {
		String tulostus ="viikko "+week+": tehtyjä tehtäviä yhteensä: " + tasksDone()+
		", aikaa kului " + hours +" tuntia, tehdyt tehtävät: ";
        return tulostus;
    }
    
}