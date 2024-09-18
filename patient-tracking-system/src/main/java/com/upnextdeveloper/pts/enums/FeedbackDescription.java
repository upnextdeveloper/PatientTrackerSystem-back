package com.upnextdeveloper.pts.enums;

public enum FeedbackDescription {

	VERY_SATISFIED("VERY_SATISFIED"),
	SATISFIED("SATISFIED"),
	NEUTRAL("NEUTRAL"),
	UNSATISFIED("UNSATISFIED"),
	VERY_UNSATISFIED("VERY_UNSATISFIED");
	
	private String feedbackDescription;
	
	FeedbackDescription(String fd) {
		this.feedbackDescription = fd;
	}

	public String getFeedbackDescription() {
		return feedbackDescription;
	}
}
