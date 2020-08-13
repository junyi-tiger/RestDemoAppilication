package com.example.demo.entity;

import com.example.demo.constant.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.weaver.ast.Or;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author lenovo
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CUSTOMER_ORDER") //"order"不是一个有效的表名
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    private String description;

    private OrderStatus status;

    public Order(String description, OrderStatus status) {
        this.description = description;
        this.status = status;
    }
}