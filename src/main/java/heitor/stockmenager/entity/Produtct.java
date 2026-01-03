package heitor.stockmenager.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "products")
public class Produtct {

  @Id
  @GeneratedValue(generator = "uuid")
  @JsonProperty("_id")
  String id;
  String sku;
  String name;
  String description;
  double price;
  int quantity;
  LocalDateTime creadAt;
  LocalDateTime UpdatedAt;

}
