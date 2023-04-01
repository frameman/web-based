package com.chl.recommand_backend.sql;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Entity
@Table(name = "userinfo")
public @Data class  userdb {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(nullable = false, unique = true, length = 45)
        private String Email;

        @Column( name = "Full_Name", length = 30)
        private String Full_Name;

        @Column( name = "Major",length = 30)
        private String Major;

        public userdb() {

        }
}



