package pl.lsnova.vehiclerest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Vehicle {

   @Id
   @Column(name="vehicleId", nullable = false)
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long vehicleId;

   @Column(name="licensePlate", nullable = false, unique = true)
   private String licensePlate;

   @Column(name="postalCode", nullable = false)
   private String postalCode;

   @Column(name="vehicleName", nullable = false)
   private String vehicleName;

   @OneToMany(mappedBy = "vehicle", targetEntity = Wheel.class, cascade = CascadeType.ALL)
   private List<Wheel> wheelList;

   public Vehicle() {
   }

   public void setVehicleId(Long vehicleId) {
      this.vehicleId = vehicleId;
   }

   public void setLicensePlate(String licensePlate) {
      this.licensePlate = licensePlate;
   }

   public void setPostalCode(String postalCode) {
      this.postalCode = postalCode;
   }

   public void setVehicleName(String vehicleName) {
      this.vehicleName = vehicleName;
   }

   public void setWheelList(List<Wheel> wheelList) {
      this.wheelList = wheelList;
   }


   public Long getVehicleId() {
      return vehicleId;
   }

   public String getLicensePlate() {
      return licensePlate;
   }

   public String getPostalCode() {
      return postalCode;
   }

   public String getVehicleName() {
      return vehicleName;
   }

   public List<Wheel> getWheelList() {
      return wheelList;
   }
}
