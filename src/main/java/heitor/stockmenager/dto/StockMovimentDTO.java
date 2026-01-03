package heitor.stockmenager.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StockMovimentDTO {

  private Long id;
  private String productId;
  private int quantity;
  private String Type;
  private  String reseason;
}
