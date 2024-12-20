package org.example.historialmedicoserver.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.example.historialmedicoserver.models.roles.Rol;

@Table(name = "users")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull(message = "El nombre no puede ser nulo")
    @Column(nullable = false)
    private String nombre;

    @NotNull(message = "El apellido no puede ser nulo")
    @Column(nullable = false)
    private String apellido;

    @NotNull(message = "El ci no puede ser nulo")
    @Column(nullable = false)
    private String ci;

    @NotNull(message = "El email no puede ser nulo")
    @Column(nullable = false)
    private String email;

    @NotNull(message = "El telefono no puede ser nulo")
    @Column(nullable = false)
    private String telefono;

    @NotNull(message = "La direccion no puede ser nulo")
    @Column(nullable = false)
    private String direccion;

    @NotNull(message = "El password no puede ser nulo")
    @Column(nullable = false)
    private String password;

    @NotNull(message = "El genero no puede ser nulo")
    @Column(nullable = false)
    private String genero;

    @ManyToOne
    @JoinColumn(name = "rolId")
    private Rol rol;

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCi() {
        return ci;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getPassword() {
        return password;
    }

    public String getGenero() {
        return genero;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
