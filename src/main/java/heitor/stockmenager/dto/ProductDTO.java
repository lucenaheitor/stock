package heitor.stockmenager.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {

  private String id;
  private String sku;
  private String name;
  private String description;
  private double price;
  private int quantity;
}
