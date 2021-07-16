/**
 * 
 */
package com.study.pattern.chain;

/**
 * @author
 *
 */
public class Hr implements Round {

	@Override
	public boolean doInterview(Candidate candidate) {
		if (candidate.getScore() > 80 ) {
			return true;
		}
		return false;
	}

}