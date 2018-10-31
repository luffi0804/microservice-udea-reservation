package com.udea;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String reservationName;

    @Override
    public String toString() {
        return "A reservation{"
                + "id:" + id
                + ", reservationName='" + reservationName + '\''
                + '}';
    }

    public Product() {
    }

    public Product(String reservationName) {
        this.reservationName = reservationName;
    }



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getReservationName() {
        return reservationName;
    }
    
        public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }
}
