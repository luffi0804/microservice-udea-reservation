package com.udea;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Product {

    @Id
    @GeneratedValue
    private Long id;

    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }
    private String reservationName;

    @Override
    public String toString() {
        return "A reservation{"
                + "id:" + id
                + ", reservationName='" + reservationName + '\''
                + '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product() {
    }

    public Product(String reservationName) {
        this.reservationName = reservationName;
    }

    public Long getId() {
        return id;
    }

    public String getReservationName() {
        return reservationName;
    }
}
