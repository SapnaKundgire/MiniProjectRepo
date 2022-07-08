package com.nt.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor

@AllArgsConstructor
public class Booking {
	  @Id
	  @GeneratedValue(strategy= GenerationType.AUTO)
	   int bookingId ; 
	   String source;
	    String  destination;
	    String vehicleType;
	    Long phoneNo;
	public int getBookingId() {
			return bookingId;
		}
		public void setBookingId(int bookingId) {
			this.bookingId = bookingId;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
	
	 @Override
		public String toString() {
			return "Booking [bookingId=" + bookingId + ", source=" + source + "]";
		}

}
