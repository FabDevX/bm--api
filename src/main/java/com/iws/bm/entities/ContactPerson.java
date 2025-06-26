package com.iws.bm.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "contactperson", schema = "elwisdb2")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContactPerson {

    @EmbeddedId
    private ContactPersonId id;

    /*@ManyToOne
    @JoinColumn(name = "companyid", insertable = false, updatable = false)
    private Company company;*/

    private String gender;

   /* @ManyToOne
    @JoinColumn(name = "titleid", insertable = false, updatable = false)
    private Title title;

    @ManyToOne
    @JoinColumn(name = "salutationid", insertable = false, updatable = false)
    private Salutation salutation;
*/
    private String name;
    private String firstname;
    private String position;
    private String department;
    private String email;
    private String phone;
    private String mobile;
    private String fax;
    private String website;
    private Integer version;
}
