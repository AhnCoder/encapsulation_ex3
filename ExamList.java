package 객체_캡슐화_ex3_콘솔코드분리;

public class ExamList {
	private Exam[] exams; 
	private int current;    
	

	public Exam get(int i) {
			// TODO Auto-generated method stub
			return this.exams[i]; 
		}
	
	public void add(Exam exam) {
		
			Exam[] exams = this.exams;
			int size = this.current;
			
			
			if(exams.length == size) {
				Exam[] temp = new Exam[size + 5];
				for(int i=0; i<size; i++) {
					temp[i] = exams[i];
				}
				this.exams  = temp;
			}
			System.out.println("현재 길이" + this.exams.length);
			
			this.exams[current] = exam;   
			current++;  
		}

	public ExamList() {  
			this(3);
		}
		
	public ExamList(int size) {  
			exams = new Exam[size];        
			current = 0;
		}

	
	public int size() {
		
		return current;
	}
}