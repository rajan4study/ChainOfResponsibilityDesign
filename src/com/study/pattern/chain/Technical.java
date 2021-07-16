/**
 * 
 */
package com.study.pattern.chain;

/**
 * @author
 *
 */
public class Technical implements Round {
	private Round next;

	@Override
	public boolean doInterview(Candidate candidate) {
		if (candidate.getScore() > 60 && next != null) {
			return next.doInterview(candidate);
		}
		return false;
	}

	public void setNext(Round next) {
		this.next = next;
	}

}
