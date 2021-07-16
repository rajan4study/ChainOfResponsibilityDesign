/**
 * 
 */
package com.study.pattern.chain;

/**
 * @author
 *
 */
public class Manager implements Round {
	private Round next;

	public void setNext(Round next) {
		this.next = next;
	}

	@Override
	public boolean doInterview(Candidate candidate) {
		if (candidate.getScore() > 70 && next != null) {
			return next.doInterview(candidate);
		}
		return false;
	}

}