package pl.lsnova.vehiclerest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Wheel {

   @Id
   @Column(name = "wheelSize")
   private Long size;
   @Column
   private String manufacturer;
   @Column
   private BigDecimal pressure;

   @ManyToOne(optional = false)
   @JoinColumn(name = "vehicleId", referencedColumnName = "vehicleId")
   @JsonIgnore
   private Vehicle vehicle;


   public Wheel(Long size, String manufacturer, BigDecimal pressure) {
      this.size = size;
      this.manufacturer = manufacturer;
      this.pressure = pressure;
   }

   public Wheel(){}
}
