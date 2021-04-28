package br.com.max.projectsw.character.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "character")
public class CharacterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long specie;
    private Integer age;
    private Long planet;
    @CreationTimestamp
    @Column(name="date_creation")
    private LocalDateTime creationDate;
    @Column(name="master_id")
    private Integer masterId;
}
