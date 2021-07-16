/**
 * 
 */
package com.study.pattern.chain;

/**
 * @author 
 *
 */
public class InterviewPannel {

	private Round first;
	public InterviewPannel() {
		Technical techRound=new Technical();
		Manager mangerRound= new Manager();
		Hr hrRound= new Hr();
		mangerRound.setNext(hrRound);
		techRound.setNext(mangerRound);
		first=techRound;
	}
	public void scheduleInterview(Candidate candidate) {
		if(first.doInterview(candidate)) {
			System.out.println("Hired");
		}else {
			System.out.println("Not Hired");
		}
	}

}
