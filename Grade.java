
public class Grade {
	
	public static double passingGrade = 9.5;
	private double projeto1;
	private double projeto2;
	private double teste1;
	private double teste2;
	private double exercicioAula;
	private double exercicioCasa;
	
	public double notaProjetos;
	public double notaTeoricoPratica; 
	public double mediaGlobal;
	
	
	public Grade ( double p1, double p2, double t1, double t2, double e, double d) {
		projeto1 = p1; 
		projeto2 = p2; 
		teste1 = t1; 
		teste2 = t2; 
		exercicioAula = e; 
		exercicioCasa = d;
		
		notaProjetos = (0.10*projeto1+0.25*projeto2)/0.35 ;
		notaTeoricoPratica = (0.20*teste1 +0.35*teste2)/0.55 ; 
		mediaGlobal = notaTeoricoPratica*0.55 + notaProjetos*0.35 + exercicioAula + exercicioCasa; 
		
	}
	
	public boolean isExceptional() {if(exercicioAula == 1 && exercicioCasa == 1 && projeto1 >= 16 && projeto2 >= 16 && (projeto1 >= 18 || projeto2 >= 18) && teste1 >= 16 && teste1 >= 16 && notaTeoricoPratica >17  )
	{return true;}else { return false;}
		

	}
	
	public boolean hasFreq() {
		double temFreq = Math.round(notaProjetos*100)/100.0; 
		double roundtemFreq = Math.round(temFreq*100)/100.0;
		return roundtemFreq >= 9.5;
	}


	public double finalGrade() { 
		
		double notaFinal = Math.round(notaTeoricoPratica*100)/100.0;
		if (notaFinal >= 9.5) {
			notaFinal = Math.round(mediaGlobal*100)/100.0;
			
		
		}
		double roundFinalGrade = Math.round(notaFinal*1)/1;
		return roundFinalGrade ; 
	}


	public double neededExamGrade() {double exame = notaTeoricoPratica; 
		if (notaTeoricoPratica >= 9.5) {
		exame = (9.5 - (0.1*projeto1)- (0.25*projeto2) - (exercicioAula) - (exercicioCasa))/0.55; 
		double roundExame = Math.round(exame*100)/100.0 ;
		return roundExame; }
		else { exame = 9.5; return exame;} 
		
		

	}  
	
}

