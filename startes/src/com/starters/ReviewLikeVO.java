package com.starters;

public class ReviewLikeVO {
	private String memberId;
	private int reviewId;
	private int tutoringApplyId;
	private String reviewTitle;
	private String tutoringTitle;
	private String tutorName;
	private String reviewContent;
	private int reviewCount;
	private String reviewDate;
	private int likeCount; // 전체의 갯수(max값 가져오기)
	private int likeAllCount; // 회원이 눌렀냐 안눌렀냐를 판별
	
	public ReviewLikeVO(){}
	
	public ReviewLikeVO(String memberId, int reviewId, int tutoringApplyId, String reviewTitle, String tutoringTitle,String tutorName,String reviewContent, int reviewCount, String reviewDate, int likeCount, int likeAllCount){
		super();
		this.memberId = memberId;
		this.reviewId = reviewId;
		this.tutoringApplyId = tutoringApplyId;
		this.reviewTitle = reviewTitle;
		this.tutoringTitle = tutoringTitle;
		this.tutorName = tutorName;
		this.reviewContent = reviewContent;
		this.reviewCount = reviewCount;
		this.reviewDate = reviewDate;
		this.likeCount = likeCount;
		this.likeAllCount = likeAllCount;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public int getTutoringApplyId() {
		return tutoringApplyId;
	}

	public void setTutoringApplyId(int tutoringApplyId) {
		this.tutoringApplyId = tutoringApplyId;
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}

	public String getTutoringTitle() {
		return tutoringTitle;
	}

	public void setTutoringTitle(String tutoringTitle) {
		this.tutoringTitle = tutoringTitle;
	}

	public String getTutorName() {
		return tutorName;
	}

	public void setTutorName(String tutorName) {
		this.tutorName = tutorName;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public int getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}

	public String getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public int getLikeAllCount() {
		return likeAllCount;
	}

	public void setLikeAllCount(int likeAllCount) {
		this.likeAllCount = likeAllCount;
	}

	@Override
	public String toString() {
		return "ReviewLikeVO [memberId=" + memberId + ", reviewId=" + reviewId + ", tutoringApplyId=" + tutoringApplyId
				+ ", reviewTitle=" + reviewTitle + ", tutoringTitle=" + tutoringTitle + ", tutorName=" + tutorName
				+ ", reviewContent=" + reviewContent + ", reviewCount=" + reviewCount + ", reviewDate=" + reviewDate
				+ ", likeCount=" + likeCount + ", likeAllCount=" + likeAllCount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + likeAllCount;
		result = prime * result + likeCount;
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((reviewContent == null) ? 0 : reviewContent.hashCode());
		result = prime * result + reviewCount;
		result = prime * result + ((reviewDate == null) ? 0 : reviewDate.hashCode());
		result = prime * result + reviewId;
		result = prime * result + ((reviewTitle == null) ? 0 : reviewTitle.hashCode());
		result = prime * result + ((tutorName == null) ? 0 : tutorName.hashCode());
		result = prime * result + tutoringApplyId;
		result = prime * result + ((tutoringTitle == null) ? 0 : tutoringTitle.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReviewLikeVO other = (ReviewLikeVO) obj;
		if (likeAllCount != other.likeAllCount)
			return false;
		if (likeCount != other.likeCount)
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (reviewContent == null) {
			if (other.reviewContent != null)
				return false;
		} else if (!reviewContent.equals(other.reviewContent))
			return false;
		if (reviewCount != other.reviewCount)
			return false;
		if (reviewDate == null) {
			if (other.reviewDate != null)
				return false;
		} else if (!reviewDate.equals(other.reviewDate))
			return false;
		if (reviewId != other.reviewId)
			return false;
		if (reviewTitle == null) {
			if (other.reviewTitle != null)
				return false;
		} else if (!reviewTitle.equals(other.reviewTitle))
			return false;
		if (tutorName == null) {
			if (other.tutorName != null)
				return false;
		} else if (!tutorName.equals(other.tutorName))
			return false;
		if (tutoringApplyId != other.tutoringApplyId)
			return false;
		if (tutoringTitle == null) {
			if (other.tutoringTitle != null)
				return false;
		} else if (!tutoringTitle.equals(other.tutoringTitle))
			return false;
		return true;
	}


}
