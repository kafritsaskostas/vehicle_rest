package pl.lsnova.vehiclerest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Wheel implements Comparable<BigDecimal>{

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

   public Long getSize() {
      return size;
   }

   public String getManufacturer() {
      return manufacturer;
   }

   public BigDecimal getPressure() {
      return pressure;
   }

   public Vehicle getVehicle() {
      return vehicle;
   }

   public Wheel(){}

   @Override
   public int compareTo(BigDecimal pressure) {
      return this.getPressure().compareTo(pressure);
   }
}
