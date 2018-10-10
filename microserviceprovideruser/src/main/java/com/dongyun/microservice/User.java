package com.dongyun.microservice;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by fqye2 on 2018/9/19.
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String username;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private BigDecimal balance;
}
