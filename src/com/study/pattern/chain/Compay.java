/**
 * 
 */
package com.study.pattern.chain;

/**
 * @author 
 *
 */
public class Compay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InterviewPannel pannel= new InterviewPannel();
		Candidate candidate1= new Candidate(100);
		pannel.scheduleInterview(candidate1);
		Candidate candidate2= new Candidate(75 );
		pannel.scheduleInterview(candidate2);

	}

}
