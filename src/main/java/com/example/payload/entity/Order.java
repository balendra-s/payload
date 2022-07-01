package com.example.payload.entity;

import com.example.payload.Status;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "customer_order")
public class Order {
    @Id
    @GeneratedValue
    private int id;
    private String description;
    private Status status;
}
