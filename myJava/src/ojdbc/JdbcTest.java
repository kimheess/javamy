package ojdbc;

//데이터 오브젝트 하나의 행 정보를 나타내는 객체
public class JdbcTest {
	private int Undergrad;
	private String ename;
	private String gender;
	private int lang;
	private int english;
	private int maths;
	private int science;
	
	public JdbcTest(int Undergrad,String ename, String gender,int lang,int english,int maths, int science) {
		this.Undergrad = Undergrad;
		this.ename = ename;
		this.gender = gender;
		this.lang = lang;
		this.english = english;
		this.maths = maths;
		this.science = science;
	}
	
	public int getUndergrad() {
		return this.Undergrad;
	}
	
	public String getename() {
		return this.ename;
	}
	public String getgender() {
		return this.gender;
	}
	public int getlang() {
		return this.lang;
	}
	public int getenglish() {
		return this.english;
	}
	public int getmaths() {
		return this.maths;
	}
	public int getscience() {
		return this.science;
	}
}
