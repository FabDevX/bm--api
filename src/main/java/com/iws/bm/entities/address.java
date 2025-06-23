package com.iws.bm.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "address", schema = "elwisdb2")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class address {

    @Id
    @Column(name = "addressid")
    private Integer addressId;
    /**
    private Boolean active;

    private String addaddressline;

    private String addresstype;

    private Integer birthday;

    private Integer code;

    private String education;

    private String housenumber;

    private String keywords;

    private Boolean personal;

    private String pobox;

    private String searchname;

    private String street;

    private String taxnumber;

    private String zipofpobox;
    **/
    private Integer version;

    // Nombre (se pueden usar también para búsquedas o mostrar en vistas)
    private String name1;
    private String name2;
    private String name3;

    // Relaciones (puedes mapear con @ManyToOne si vas a usar entidades relacionadas)
    /**
     @ManyToOne
    @JoinColumn(name = "bankaccountid")
    private BankAccount bankAccount;

    @ManyToOne
    @JoinColumn(name = "cityid")
    private City city;

    @ManyToOne
    @JoinColumn(name = "companyid")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "countryid")
    private Country country;

    @ManyToOne
    @JoinColumn(name = "languageid")
    private Language language;

    @ManyToOne
    @JoinColumn(name = "lastmoduser")
    private ElwisUser lastModifiedBy;

    @ManyToOne
    @JoinColumn(name = "recorduser")
    private ElwisUser createdBy;

    @ManyToOne
    @JoinColumn(name = "salutationid")
    private Salutation salutation;

    @ManyToOne
    @JoinColumn(name = "titleid")
    private Title title;

    @ManyToOne
    @JoinColumn(name = "imageid")
    private Freetext image;

    @ManyToOne
    @JoinColumn(name = "waydescriptionid")
    private Freetext wayDescription;

    @ManyToOne
    @JoinColumn(name = "freetextid")
    private Freetext freetext;

    private Integer lastmoddate;
    private Integer recorddate;**/
}
