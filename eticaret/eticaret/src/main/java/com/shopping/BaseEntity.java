package com.shopping;

import jakarta.persistence.*;

public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_sequence")
    @SequenceGenerator(name = "id_sequence", sequenceName = "id_sequence", allocationSize = 1)
    @Column(name = "id", precision = 18)
    protected Long id;
}
