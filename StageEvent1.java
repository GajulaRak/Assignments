package com.example;


	public class StageEvent1 extends Event {
		private Integer noOfShows,noOfSeatesPerShow;

		public Integer getNoOfShows() {
			return noOfShows;
		}

		public void setNoOfShows(Integer noOfShows) {
			this.noOfShows = noOfShows;
		}

		public Integer getNoOfSeatesPerShow() {
			return noOfSeatesPerShow;
		}

		public void setNoOfSeatesPerShow(Integer noOfSeatesPerShow) {
			this.noOfSeatesPerShow = noOfSeatesPerShow;
		}
		public StageEvent1(String name, String detail, String ownerName, Integer noOfShows, Integer noOfSeatesPerShow) {
			super(name, detail, ownerName);
			this.noOfShows = noOfShows;
			this.noOfSeatesPerShow = noOfSeatesPerShow;
		}
		public Double projectedRevenue(){
			return (double) (noOfSeatesPerShow*50)*noOfShows;
			
		}
		}




