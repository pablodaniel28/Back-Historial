package org.example.historialmedicoserver.models.fichas;

import jakarta.validation.constraints.NotNull;

public class FichaCancelDTO {

    @NotNull(message = "La fecha_proxima no puede ser nulo")
    private String fecha_proxima;

    @NotNull(message = "El motivo no puede ser nulo")
    private String motivo;

    public @NotNull(message = "La fecha_proxima no puede ser nulo") String getFecha_proxima() {
        return fecha_proxima;
    }

    public @NotNull(message = "El motivo no puede ser nulo") String getMotivo() {
        return motivo;
    }

    public void setFecha_proxima(@NotNull(message = "La fecha_proxima no puede ser nulo") String fecha_proxima) {
        this.fecha_proxima = fecha_proxima;
    }

    public void setMotivo(@NotNull(message = "El motivo no puede ser nulo") String motivo) {
        this.motivo = motivo;
    }
}
