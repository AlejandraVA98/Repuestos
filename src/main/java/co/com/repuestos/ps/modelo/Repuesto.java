package co.com.repuestos.ps.modelo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;


import java.util.Date;

@Table
@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Repuesto {

    public Repuesto() {

    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @Column(name="color", nullable=false)
    private int color;
    @Column(name="nombre", nullable=false)
    private String nombre;
    @Column(name="marca", nullable=false)
    private String marca;
    private String modelo;
    private double precio;
    private Date fechaInventario;
    private boolean venceElProducto;
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
}