package med.voll.api.medico;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.enderco.Endereco;

import jakarta.persistence.*;
import med.voll.api.enderco.Endereco;

import javax.annotation.processing.Generated;

@Table(name = "medicos")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Medico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    private  String email;
    private String crm;

    @Generated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

}
