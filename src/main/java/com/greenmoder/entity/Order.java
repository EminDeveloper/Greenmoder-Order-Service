package com.greenmoder.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ORDER_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int qty;
    private double price;


}
