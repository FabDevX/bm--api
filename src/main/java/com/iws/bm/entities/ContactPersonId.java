package com.iws.bm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactPersonId implements Serializable {

    @Column(name = "addressid")
    private Integer addressId;

    @Column(name = "contactpersonid")
    private Integer contactPersonId;
}
