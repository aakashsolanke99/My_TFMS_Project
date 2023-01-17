package com.revature.model;

public class Associate {

	    private int associateId;
		private String associateName;
		private String associateTrack;
		private String associateQualification;
		private String associateExperience;
		
		public Associate() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Associate(int associateId, String associateName, String associateTrack, String associateQualification,
				String associateExperience) {
			super();
			this.associateId = associateId;
			this.associateName = associateName;
			this.associateTrack = associateTrack;
			this.associateQualification = associateQualification;
			this.associateExperience = associateExperience;
		}

		public int getAssociateId() {
			return associateId;
		}

		public void setAssociateId(int associateId) {
			this.associateId = associateId;
		}

		public String getAssociateName() {
			return associateName;
		}

		public void setAssociateName(String associateName) {
			this.associateName = associateName;
		}

		public String getAssociateTrack() {
			return associateTrack;
		}

		public void setAssociateTrack(String associateTrack) {
			this.associateTrack = associateTrack;
		}

		public String getAssociateQualification() {
			return associateQualification;
		}

		public void setAssociateQualification(String associateQualification) {
			this.associateQualification = associateQualification;
		}

		public String getAssociateExperience() {
			return associateExperience;
		}

		public void setAssociateExperience(String associateExperience) {
			this.associateExperience = associateExperience;
		}

		@Override
		public String toString() {
			return "Associate [associateId=" + associateId + ", associateName=" + associateName + ", associateTrack="
					+ associateTrack + ", associateQualification=" + associateQualification + ", associateExperience="
					+ associateExperience + "]";
		}
			
		
}
