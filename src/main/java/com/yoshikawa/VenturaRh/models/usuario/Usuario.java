package com.yoshikawa.VenturaRh.models.usuario;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;

import com.yoshikawa.VenturaRh.models.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class Usuario {
    private static final long serialVersionUID = 1L;

    @Id
    private String login;
    private String nomeCompleto;

    @NotEmpty
    private String senha;

    @ManyToMany
    @JoinTable(
            name = "usuarios_roles",
             joinColumns = @JoinColumn(
                    name = "usuario_id", referencedColumnName = "login"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "nomeRole"))
    private List<Role> roles;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }


    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        return (Collection<? extends GrantedAuthority>) this.roles;
    }


    public String getPassword() {
        // TODO Auto-generated method stub
        return this.senha;
    }


    public String getUsername() {
        // TODO Auto-generated method stub
        return this.login;
    }


    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }


    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }


    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }


    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }


}
