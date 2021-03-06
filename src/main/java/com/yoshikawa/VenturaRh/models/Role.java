package com.yoshikawa.VenturaRh.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.yoshikawa.VenturaRh.models.usuario.Usuario;
import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role implements GrantedAuthority{

    @Id
    private String nomeRole;

    @ManyToMany(mappedBy = "roles")
    private List<Usuario> usuarios;

    public String getNomeRole() {
        return nomeRole;
    }

    public void setNomeRole(String nomeRole) {
        this.nomeRole = nomeRole;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String getAuthority() {
        // TODO Auto-generated method stub
        return this.nomeRole;
    }


}
